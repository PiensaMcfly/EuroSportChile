
package com.TallerEuroSportChile.EuroSportService.Models;

import com.TallerEuroSportChile.EuroSportService.Enums.Encargado;
import com.TallerEuroSportChile.EuroSportService.Enums.EstadoCotizacion;
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
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCotizacion;
    private Long monto;
    private String descripcion;
   // @ManyToOne
   //private Cliente cliente;
    @Enumerated(EnumType.STRING)
    private EstadoCotizacion estado;
    @Enumerated(EnumType.STRING)
    private Encargado encargado;
    private String formaPago;
}