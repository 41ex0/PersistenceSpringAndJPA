package Spring3.ElBuenSabor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends BaseEntity{
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero_calle")
    private int nroCalle;
    @Column(name = "piso_dpto")
    private int pisoDpto;
    @Column(name = "numero_dpto")
    private int nroDpto;
}
