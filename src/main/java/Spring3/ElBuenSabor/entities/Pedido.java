package Spring3.ElBuenSabor.entities;

import Spring3.ElBuenSabor.enumeration.FormaPago;
import Spring3.ElBuenSabor.enumeration.TipoEnvio;
import jakarta.persistence.*;
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

    //Relaciones
    @ManyToOne()
    @JoinColumn(name = "id_domicilio_entrega")
    private Domicilio domicilioEntrega;

    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
