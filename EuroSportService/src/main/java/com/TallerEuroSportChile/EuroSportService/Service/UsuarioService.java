/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TallerEuroSportChile.EuroSportService.Service;

import com.TallerEuroSportChile.EuroSportService.Models.Usuario;
import com.TallerEuroSportChile.EuroSportService.Repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> getUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public void editUsuario(Usuario usuario) {
        this.usuarioRepo.save(usuario);
    }
}