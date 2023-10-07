package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "rubro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rubro extends BaseEntity {
    @Column(name = "nombre_rubro")
    private String nombreRubro;
    @Column(name = "fecha_hora_baja_producto")
    private Date fechaHoraBajaProducto;
}
