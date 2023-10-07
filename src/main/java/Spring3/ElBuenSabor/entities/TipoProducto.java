package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tipo_producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoProducto extends BaseEntity {
    @Column(name = "cod_tipo_producto")
    private String codTipoProducto;
    @Column(name = "nombre_tipo_producto")
    private String nombreTipoProducto;

    //Relations
}
