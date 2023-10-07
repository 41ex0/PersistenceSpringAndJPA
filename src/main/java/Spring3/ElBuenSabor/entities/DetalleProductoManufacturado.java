package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "detalle_pedido_manufacturado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleProductoManufacturado extends BaseEntity{
    @Column(name = "cantidad")
    private int cantidad;
}
