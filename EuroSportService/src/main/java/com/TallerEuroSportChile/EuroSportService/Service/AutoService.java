/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Auto;
import com.TallerEuroSportChile.EuroSportService.Repository.IAutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MegaTecnologia
 */
@Service
public class AutoService implements IAutoService{
    @Autowired
    private IAutoRepository autoRepo;

    @Override
    public List<Auto> getAutos() {
        return autoRepo.findAll();
    }

    @Override
    public Auto saveAuto(Auto auto) {
        return autoRepo.save(auto);
    }

    @Override
    public void deleteAuto(Long id) {
        autoRepo.deleteById(id);
    }

    @Override
    public Auto findAuto(Long id) {
        return autoRepo.findById(id).orElse(null);
    }

    @Override
    public void editAuto(Auto auto) {
        autoRepo.save(auto);
    }
}