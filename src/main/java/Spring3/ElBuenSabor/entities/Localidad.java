package Spring3.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidad extends BaseEntity{
    @Column(name = "nombre_localidad")
    private String nombreLocalidad;
    @Column(name = "codigo_postal")
    private int codigoPostal;

    //Relations
}
