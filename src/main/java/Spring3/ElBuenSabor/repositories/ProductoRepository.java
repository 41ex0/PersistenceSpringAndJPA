package Spring3.ElBuenSabor.repositories;

import Spring3.ElBuenSabor.entities.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
