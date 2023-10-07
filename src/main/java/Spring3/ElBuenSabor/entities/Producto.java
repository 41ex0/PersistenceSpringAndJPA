package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto extends BaseEntity{
    @Column(name = "nombre_prodcto")
    private String nombre;
    @Column(name = "tiempo_estimado_cocina")
    private Date tiempoEstimadoCocina;
    @Column(name = "precio_venta")
    private double precioVenta;
    @Column(name = "precio_compra")
    private double precioCompra;
    @Column(name = "stock_actual")
    private int stockActual;
    @Column(name = "stock_minimo")
    private int stockMinimo;
    @Column(name = "receta", length = 2000)
    private String receta;
    @Column(name = "fecha_hora_alta_producto")
    private Date fechaHoraAltaProducto;
    @Column(name = "fecha_hora_baja_producto")
    private Date fechaHoraBajaProducto;
}
