/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Cliente;
import java.util.List;

public interface IClienteService {
    //CRUD- PROCESO
    public List<Cliente> getClientes();
    public Cliente saveCliente(Cliente cliente);
    public void deleteCliente(Long id);
    public Cliente findCliente(Long id);
    public void editCliente(Cliente cliente);
}
