/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Controller;

import com.TallerEuroSportChile.EuroSportService.Models.Cotizacion;
import com.TallerEuroSportChile.EuroSportService.Service.ICotizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cotizacion")
public class CotizacionController {
    @Autowired
    private ICotizacionService cotizacionService;

    //Creacion de cotizacion
    @PostMapping("/creacion")
    public ResponseEntity<Cotizacion> save(@RequestBody Cotizacion cotizacion){
        Cotizacion cot = cotizacionService.saveCotizacion(cotizacion);
        return new ResponseEntity<Cotizacion>(cot, HttpStatus.OK);
    }
    //Buscar Cotizacion en especifico
    @GetMapping("/traer/{id}")
    public Cotizacion traerEspecifico(@PathVariable Long id){
        return cotizacionService.findCotizacion(id);
    }
    //Traer todas las Cotizaciones
    @GetMapping("/traer")
    public List<Cotizacion> getAll(){
        return cotizacionService.getCotizaciones();
    }
    //Borrar cotizacion
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Cotizacion> delete(@PathVariable Long id){
        Cotizacion cot = cotizacionService.findCotizacion(id);
        if(cot != null){
            cotizacionService.deleteCotizacion(id);
        }else{
            return new ResponseEntity<Cotizacion>(cot, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Cotizacion>(cot, HttpStatus.OK);
    }

    //Modificar Cotizacion
}