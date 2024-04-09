/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Repository;

import com.TallerEuroSportChile.EuroSportService.Models.Cotizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MegaTecnologia
 */
@Repository
public interface ICotizacionRepository extends JpaRepository<Cotizacion, Long> {
}

