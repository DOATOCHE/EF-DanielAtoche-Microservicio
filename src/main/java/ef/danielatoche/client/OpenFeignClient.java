package ef.danielatoche.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import ef.danielatoche.dto.HospedajeDTO;

@FeignClient(name = "hospedaje-microservicio", url="localhost:8090")
public interface OpenFeignClient {

	@GetMapping("/api/hospedaje/listar")
	public List<HospedajeDTO> listarHospedajes();
	
}
