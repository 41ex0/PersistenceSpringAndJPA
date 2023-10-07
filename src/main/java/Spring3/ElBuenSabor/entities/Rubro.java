package Spring3.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

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

    //Relations
    @ManyToOne
    @JoinColumn(name = "id_rubro_padre")
    private Rubro rubroPadre;

    @OneToMany(mappedBy = "rubroPadre")
    private List<Rubro> subRubros;
}
