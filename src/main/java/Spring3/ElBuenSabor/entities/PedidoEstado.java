package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "pedido_estado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoEstado extends BaseEntity{
    @Column(name = "fecha_hora_alta_pedido_estado")
    private Date fechaHoraAltaPedidoEstado;
    @Column(name = "fecha_hora_baja_pedido_estado")
    private Date fechaHoraBajaPedidoEstado;
    @Column(name = "contador_pedido_estado")
    private Long contadorPedidoEstado;
}
