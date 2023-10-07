package Spring3.ElBuenSabor.entities;

import Spring3.ElBuenSabor.enumeration.FormaPago;
import Spring3.ElBuenSabor.enumeration.TipoEnvio;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido extends BaseEntity {
    @Column(name = "url_imagen")
    private String urlImagen;
    @Column(name = "fecha_hora_pedido")
    private Date fechaHoraPedido;
    @Column(name = "fecha_hora_estimada_finalizacion")
    private Date fechaHoraEstimadaFinalizacion;
    @Column(name = "total_precio")
    private double totalPrecio;
    @Column(name = "tipo_envio")
    private TipoEnvio tipoEnvio;
    @Column(name = "forma_pago")
    private FormaPago formaPago;
}
