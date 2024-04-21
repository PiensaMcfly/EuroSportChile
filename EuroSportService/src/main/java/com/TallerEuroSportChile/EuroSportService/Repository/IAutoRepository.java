/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Repository;

import com.TallerEuroSportChile.EuroSportService.Models.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author MegaTecnologia
 */
@Repository
public interface IAutoRepository extends JpaRepository<Auto, Long> {
    //List<Object> findAllById(Long idAuto); // se agrego luego de que estuviera haciendo el metodo de cliente cmpleto
}
