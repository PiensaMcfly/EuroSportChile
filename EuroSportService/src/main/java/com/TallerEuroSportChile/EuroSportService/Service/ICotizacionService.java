/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Cotizacion;
import java.util.List;

public interface ICotizacionService {
    //CRUD- PROCESO
    public List<Cotizacion> getCotizaciones();
    public Cotizacion saveCotizacion(Cotizacion cotizacion);
    public void deleteCotizacion(Long id);
    public Cotizacion findCotizacion(Long id);
    public void editCotizacion(Cotizacion cotizacion);
}
