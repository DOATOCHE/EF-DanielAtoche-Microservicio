package ef.danielatoche.modelo;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable 
public class TuristaHospedajeFK implements Serializable{
	
	private static final long serialVersionUID = -4259684636861252684L;
	
	@Column(name = "id_turista", nullable=false)
	private Integer idTurista;
	
	@Column(name = "id_hospedaje", nullable=false)
	private Integer idHospedaje;
	

}
