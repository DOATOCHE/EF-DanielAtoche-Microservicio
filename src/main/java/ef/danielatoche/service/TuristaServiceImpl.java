package ef.danielatoche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ef.danielatoche.client.OpenFeignClient;
import ef.danielatoche.dto.HospedajeDTO;
import ef.danielatoche.modelo.Turista;
import ef.danielatoche.modelo.TuristaDetalle;
import ef.danielatoche.modelo.TuristaHospedajeFK;
import ef.danielatoche.repositorio.DetalleTuristaRepository;
import ef.danielatoche.repositorio.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	@Autowired
	private TuristaRepository aularepo;

	@Autowired
	private DetalleTuristaRepository detallerepo;

	@Autowired
	private OpenFeignClient client;

	@Override
	public void guardarturista(Turista aula) {
		aularepo.save(aula);
	}

	@Override
	public void asignarturistaHospedaje() {
		List<HospedajeDTO> listado = client.listarHospedajes();
		TuristaHospedajeFK fk = null;
		TuristaDetalle detalle = null;

		for (HospedajeDTO hospedajeDTO : listado) {
			fk = new TuristaHospedajeFK();
			fk.setIdHospedaje(hospedajeDTO.getIdHospedaje());
			fk.setIdTurista(1);

			detalle = new TuristaDetalle();
			detalle.setFk(fk);
			detallerepo.save(detalle);
		}
	}

}
