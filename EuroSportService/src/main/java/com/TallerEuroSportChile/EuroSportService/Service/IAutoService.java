/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Auto;
import java.util.List;

public interface IAutoService {

    //CRUD-PROCESO

    //metodo para traer todas las personas
    public List<Auto> getAutos();
    //Metodo para dar de alta una persona
    public Auto saveAuto(Auto auto);
    //Metodo para borrar una persona
    public void deleteAuto(Long id);
    //metodo para encontrar a una persona
    public Auto findAuto(Long id);
    //Metodo para editar una persona
    public void editAuto(Auto auto);

}