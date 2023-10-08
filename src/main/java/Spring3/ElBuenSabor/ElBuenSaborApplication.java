package Spring3.ElBuenSabor;

import Spring3.ElBuenSabor.entities.*;
import Spring3.ElBuenSabor.enumeration.FormaPago;
import Spring3.ElBuenSabor.enumeration.TipoEnvio;
import Spring3.ElBuenSabor.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ElBuenSaborApplication {

	@Autowired
	RubroRepository rubroRepository;
	@Autowired
	TipoProductoRepository tipoProductoRepository;
	@Autowired
	UnidadMedidaRepository unidadMedidaRepository;
	@Autowired
	LocalidadRepository localidadRepository;

	public static void main(String[] args) {
		SpringApplication.run(ElBuenSaborApplication.class, args);
		System.out.println("Estoy funcionando ;)");
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository) {
		return args -> {
			System.out.println("---------ESTOY FUNCIONANDO---------");

			//Crear rubro
			Rubro rubro1 = Rubro.builder()
					.nombreRubro("Skinner & the Superintendent")
					.build();

			//Crear tipos de productos
			TipoProducto manufacturado = TipoProducto.builder()
					.codTipoProducto("M-01")
					.nombreTipoProducto("MANUFACTURADO")
					.build();

			TipoProducto insumo = TipoProducto.builder()
					.codTipoProducto("I-01")
					.nombreTipoProducto("INSUMO")
					.build();

			//Save tipo de producto
			tipoProductoRepository.save(manufacturado);
			tipoProductoRepository.save(insumo);

			//Crear unidad de medida
			UnidadMedida unidadMedida1 = UnidadMedida.builder()
					.nombreUnidadMedida("unidad1")
					.fechaHoraBajaUnidadMedida(null)
					.build();

			//save unidad de medida
			unidadMedidaRepository.save(unidadMedida1);

			//Crear productos
			SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
			String fechaString = "1996-03-14"; //cambiar fecha
			Date fechaAlta = formatoFecha.parse(fechaString);

			Producto producto1 = Producto.builder()
					.nombreProducto("Asado arruinado")
					.tiempoEstimadoCocina(600)
					.precioVenta(0)
					.precioCompra(7300)
					.stockActual(1)
					.stockMinimo(1)
					.receta("Dejar la carne demasiado tiempo en el horno hasta que se queme. ADVERTENCIA: si no se apaga el horno se puede generar una Aurora Boreal en la cocina. ")
					.fechaHoraAltaProducto(fechaAlta)
					.fechaHoraBajaProducto(null)
					.build();

			producto1.setTipoProducto(manufacturado);
			producto1.setUnidadMedida(unidadMedida1);

			Producto producto2 = Producto.builder()
					.nombreProducto("Almejas al vapor")
					.tiempoEstimadoCocina(20)
					.precioVenta(29200)
					.precioCompra(14600)
					.stockActual(0)
					.stockMinimo(0)
					.receta("Solo son una invencion para justificar el humo que sale del horno. Nunca hay stock.")
					.fechaHoraAltaProducto(fechaAlta)
					.fechaHoraBajaProducto(null)
					.build();

			producto2.setTipoProducto(manufacturado);
			producto2.setUnidadMedida(unidadMedida1);

			Producto producto3 = Producto.builder()
					.nombreProducto("Hamburguejas al vapor")
					.tiempoEstimadoCocina(0)
					.precioVenta(730)
					.precioCompra(365)
					.stockActual(4)
					.stockMinimo(4)
					.receta("Cuando nadie este viendo) Salir de la cocina por la venta y comprar hamburguesas Krusty, emplatar y servir como Hambuerguejas al vapor. Una vieja receta familiar.")
					.fechaHoraAltaProducto(fechaAlta)
					.fechaHoraBajaProducto(null)
					.build();

			producto3.setTipoProducto(manufacturado);
			producto3.setUnidadMedida(unidadMedida1);

			//Agregar productos al rubro, tipo de producto y unidad de medida
			rubro1.agregarProducto(producto1);
			rubro1.agregarProducto(producto2);
			rubro1.agregarProducto(producto3);

			//Guardar rubro, tipo de producto y unidad medida
			rubroRepository.save(rubro1);

			//Crear cliente
			Cliente cliente1 = Cliente.builder()
					.nombre("Seymour")
					.apellido("Skinner")
					.telefono("111-111")
					.mail("directorskinner@email.com")
					.fechaHoraBajaCliente(null)
					.build();

			Cliente cliente2 = Cliente.builder()
					.nombre("Gary")
					.apellido("Chalmers")
					.telefono("222-222")
					.mail("superintendentechalmers@email.com")
					.fechaHoraBajaCliente(null)
					.build();

			//Crear Localidad
			Localidad localidad1 = Localidad.builder()
					.nombreLocalidad("Springfield")
					.codigoPostal(555)
					.build();

			Localidad localidad2 = Localidad.builder()
					.nombreLocalidad("Capital City")
					.codigoPostal(555)
					.build();

			//save localidades
			localidadRepository.save(localidad1);
			localidadRepository.save(localidad2);

			//Crear domicilio
			Domicilio domicilio1 = Domicilio.builder()
					.calle("calle actual")
					.nroCalle(111)
					.pisoDpto(0)
					.nroDpto(0)
					.localidad(localidad1)
					.build();

			Domicilio domicilio2 = Domicilio.builder()
					.calle("otra calle")
					.nroCalle(222)
					.pisoDpto(0)
					.nroDpto(0)
					.localidad(localidad2)
					.build();

			//Agregar domicilio al cliente1
			cliente1.agregarDomicilio(domicilio1);
			cliente1.agregarDomicilio(domicilio2);

			//Crear detalle pedido
			DetallePedido detallePedido1 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(7300)
					.build();

			DetallePedido detallePedido2 = DetallePedido.builder()
					.cantidad(0)
					.subtotal(0)
					.build();

			DetallePedido detallePedido3 = DetallePedido.builder()
					.cantidad(4)
					.subtotal(2920)
					.build();

			//Formato de fecha
			SimpleDateFormat formatoFecha0 = new SimpleDateFormat("yyyy-MM-dd");
			String fechaToString = "1996-03-14"; //cambiar fecha
			Date fecha = formatoFecha0.parse(fechaToString);

			//Crear EstadoPedido
			EstadoPedido preparacion = EstadoPedido.builder()
					.codEstadoPedido("P-01")
					.nombreEstadoPedido("PREPARACION")
					.build();

			EstadoPedido entregado = EstadoPedido.builder()
					.codEstadoPedido("E-01")
					.nombreEstadoPedido("ENTREGADO")
					.build();

			//Crear pedido
			Pedido pedido1 = Pedido.builder()
					.estadoPedido(preparacion)
					.fechaHoraPedido(fecha)
					.fechaHoraEstimadaFinalizacion(fecha)
					.totalPrecio(7300)
					.tipoEnvio(TipoEnvio.RETIRO_LOCAL)
					.formaPago(FormaPago.EFECTIVO)
					.build();

			Pedido pedido2 = Pedido.builder()
					.estadoPedido(entregado)
					.fechaHoraPedido(fecha)
					.fechaHoraEstimadaFinalizacion(fecha)
					.totalPrecio(2920)
					.tipoEnvio(TipoEnvio.RETIRO_LOCAL)
					.formaPago(FormaPago.EFECTIVO)
					.build();

			//Crear factura
			Factura factura1 = Factura.builder()
					.nroFactura(0001)
					.fechaHoraFacturacion(fecha)
					.descuento(10)
					.formaPago(FormaPago.EFECTIVO)
					.totalPrecioFactura(7300)
					.build();

			Factura factura2 = Factura.builder()
					.nroFactura(0002)
					.fechaHoraFacturacion(fecha)
					.descuento(0)
					.formaPago(FormaPago.EFECTIVO)
					.totalPrecioFactura(2920)
					.build();

			//Agregar detalle al pedido
			pedido1.agregarDetallePedido(detallePedido1);
			pedido1.agregarDetallePedido(detallePedido2);
			pedido2.agregarDetallePedido(detallePedido3);

			//Agregar pedido al cliente
			pedido1.setCliente(cliente1);
			pedido2.setCliente(cliente1);

			//Relacionar detalle con producto
			detallePedido1.setProducto(producto1);
			detallePedido2.setProducto(producto2);
			detallePedido3.setProducto(producto3);

			//Relacionar factura con pedido
			factura1.setPedido(pedido1);
			factura2.setPedido(pedido2);

			//Guardar cliente
			clienteRepository.save(cliente1);
			clienteRepository.save(cliente2);

		};
	}
}
