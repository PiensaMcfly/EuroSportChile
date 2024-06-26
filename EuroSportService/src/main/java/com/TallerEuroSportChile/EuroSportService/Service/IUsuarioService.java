/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Usuario;
import java.util.List;

public interface IUsuarioService {
    //CRUD- PROCESO
    public List<Usuario> getUsuario();
    public void saveUsuario(Usuario usuario);
    public void deleteUsuario(Long id);
    public Usuario findUsuario(Long id);
    public void editUsuario(Usuario usuario);
}
