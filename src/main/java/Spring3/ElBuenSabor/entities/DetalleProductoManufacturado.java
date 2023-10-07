package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;

public class DetalleProductoManufacturado extends BaseEntity{
    @Column(name = "cantidad")
    private int cantidad;
}
