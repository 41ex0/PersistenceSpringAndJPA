package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalle_pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedido extends BaseEntity{
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "subtotal")
    private double subtotal;
}
