/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Auto;
import com.TallerEuroSportChile.EuroSportService.Models.Cliente;
import com.TallerEuroSportChile.EuroSportService.Models.Cotizacion;
import com.TallerEuroSportChile.EuroSportService.Repository.IAutoRepository;
import com.TallerEuroSportChile.EuroSportService.Repository.IClienteRepository;
import java.util.List;

import com.TallerEuroSportChile.EuroSportService.Repository.ICotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteRepository clienteRepo;
    @Autowired
    private IAutoRepository autoRepo;
    @Autowired
    private ICotizacionRepository cotizacionRepo;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
       return clienteRepo.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public Cliente findCliente(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public void editCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @Override
    public void crearClienteCompleto(String Rut, String nombre, String apellido, String telefono
            , String mail, String numeroVin, Long idAuto, Long idCotizacion) {

        Cliente client = new Cliente();
        Auto auto1 = autoRepo.findById(idAuto).get();
        Cotizacion cotizacion1 = cotizacionRepo.findById(idCotizacion).get();


        client.setRut(Rut);
        client.setNombre(nombre);
        client.setApellido(apellido);
        client.setTelefono(telefono);
        client.setMail(mail);
        client.setNumeroVin(numeroVin);

       //client.setListaAuto((List<Auto>) auto1);
      // client.setListaCotizacion((List<Cotizacion>) cotizacion1);
        clienteRepo.save(client);


    }


}