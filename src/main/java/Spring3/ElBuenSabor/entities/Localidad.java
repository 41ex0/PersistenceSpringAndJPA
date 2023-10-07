package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
}
