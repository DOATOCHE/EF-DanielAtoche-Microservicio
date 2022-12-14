package ef.danielatoche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ef.danielatoche.client.OpenFeignClient;
import ef.danielatoche.dto.HospedajeDTO;
import ef.danielatoche.modelo.Reserva;
import ef.danielatoche.modelo.ReservaDetalle;
import ef.danielatoche.modelo.ReservaHospedajeFK;
import ef.danielatoche.repositorio.DetalleReservaRepository;
import ef.danielatoche.repositorio.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository aularepo;

	@Autowired
	private DetalleReservaRepository detallerepo;

	@Autowired
	private OpenFeignClient client;

	@Override
	public void guardarReserva(Reserva reserva) {
		aularepo.save(reserva);
	}

	@Override
	public void asignarReservaHospedaje() {
		List<HospedajeDTO> listado = client.listarHospedajes();
		ReservaHospedajeFK fk = null;
		ReservaDetalle detalle = null;

		for (HospedajeDTO hospedajeDTO : listado) {
			fk = new ReservaHospedajeFK();
			fk.setIdHospedaje(hospedajeDTO.getIdHospedaje());
			fk.setIdReserva(1);

			detalle = new ReservaDetalle();
			detalle.setFk(fk);
			detallerepo.save(detalle);
		}
	}

}
