package ef.danielatoche.modelo;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable 
public class ReservaHospedajeFK implements Serializable{
	
	private static final long serialVersionUID = -4259684636861252684L;
	
	@Column(name = "id_reserva", nullable=false)
	private Integer idReserva;
	
	@Column(name = "id_hospedaje", nullable=false)
	private Integer idHospedaje;
	

}
