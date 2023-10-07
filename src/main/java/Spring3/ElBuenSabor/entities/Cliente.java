package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente extends BaseEntity{
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido ;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "mail")
    private String mail;
    @Column(name = "fecha_hora_baja_cliente")
    private Date fechaHoraBajaCliente;
}
