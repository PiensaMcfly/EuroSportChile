
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Cotizacion;
import com.TallerEuroSportChile.EuroSportService.Repository.ICotizacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CotizacionService implements ICotizacionService{
    @Autowired
    private ICotizacionRepository cotizacionRepo;

    @Override
    public List<Cotizacion> getCotizaciones() {
        return cotizacionRepo.findAll();
    }

    @Override
    public Cotizacion saveCotizacion(Cotizacion cotizacion) {
        return cotizacionRepo.save(cotizacion);
    }

    @Override
    public void deleteCotizacion(Long id) {
        cotizacionRepo.deleteById(id);
    }

    @Override
    public Cotizacion findCotizacion(Long id) {
        return cotizacionRepo.findById(id).orElse(null);
    }

    @Override
    public void editCotizacion(Cotizacion cotizacion) {
        cotizacionRepo.save(cotizacion);
    }
}