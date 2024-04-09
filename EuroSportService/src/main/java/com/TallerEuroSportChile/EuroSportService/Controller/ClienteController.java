/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Controller;

import com.TallerEuroSportChile.EuroSportService.Models.Cliente;
import com.TallerEuroSportChile.EuroSportService.Service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/traer")
    public List<Cliente> traerTodos(){
        return clienteService.getClientes();
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente cliente){
        Cliente cli = clienteService.saveCliente(cliente);
        return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
    }

    @GetMapping("/traer/{id}")
    public Cliente traerCliente(@PathVariable Long id){
        return clienteService.findCliente(id);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Cliente> borrarCliente(@PathVariable Long id){
        Cliente cli = clienteService.findCliente(id);
        if (cli != null) {
            clienteService.deleteCliente(id);
        }else{
            return new ResponseEntity<Cliente>(cli, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
    }


    //Modificar

}