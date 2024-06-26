/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Repository;

import com.TallerEuroSportChile.EuroSportService.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MegaTecnologia
 */
@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {

    //@Query("SELECT c FROM Cliente c WHERE c.id = :id")
    //public String buscarcliente(@Param("id") String id);

    //@Query("SELECT c FROM Cotizacion c WHERE c. = :id")
    //public List <Cotizacion> (@Param("id") String id);

    //@Query("SELECT c FROM Cliente c WHERE c.id = :id")
    //public List <Auto>(@Param("id") String id);

}
