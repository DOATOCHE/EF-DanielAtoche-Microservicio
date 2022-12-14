package ef.danielatoche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ef.danielatoche.modelo.Turista;
import ef.danielatoche.service.TuristaService;

@Controller
@RequestMapping("api/turista")
public class TuristaController {

	@Autowired
	private TuristaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Turista turista) {
		service.guardarturista(turista);
	}

	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarturistaHospedaje();
	}
}
