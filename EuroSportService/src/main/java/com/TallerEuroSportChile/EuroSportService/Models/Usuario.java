
package com.TallerEuroSportChile.EuroSportService.Models;

import com.TallerEuroSportChile.EuroSportService.Enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombreUsuario;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private Rol rol;

}