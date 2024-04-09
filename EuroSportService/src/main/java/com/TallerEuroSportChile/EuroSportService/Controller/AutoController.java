/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Controller;

import com.TallerEuroSportChile.EuroSportService.Models.Auto;
import com.TallerEuroSportChile.EuroSportService.Service.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoController {
    @Autowired
    private IAutoService autoService;
    @PostMapping("/creacion")
    public ResponseEntity<Auto> save(@RequestBody Auto auto){
        Auto aut = autoService.saveAuto(auto);
        return new ResponseEntity<Auto>(aut, HttpStatus.OK);
    }
    //Buscar Cotizacion en especifico

    @GetMapping("/traer/{id}")
    public Auto traerEspecifico(@PathVariable Long id){
        return autoService.findAuto(id);
    }
    //Traer todas las Cotizaciones
    @GetMapping("/traer")
    public List<Auto> getAll(){
        return autoService.getAutos();
    }
    //Borrar cotizacion
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Auto> delete(@PathVariable Long id){
        Auto auto = autoService.findAuto(id);
        if(auto != null){
            autoService.deleteAuto(id);
        }else{
            return new ResponseEntity<Auto>(auto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Auto>(auto, HttpStatus.OK);
    }

    //Modificar Cotizacion
}