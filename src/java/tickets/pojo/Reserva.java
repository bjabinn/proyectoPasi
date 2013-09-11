package tickets.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


@Entity
@Table(name="Reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idReserva")
	private long idReserva;
	
	@ManyToOne
	@JoinColumn(name="idPista",referencedColumnName="idPista", insertable=false, updatable=false)
	private Pista pista;
	
	@ManyToOne
	@JoinColumn(name="idCliente",referencedColumnName="idCliente", insertable=false, updatable=false)
	private Cliente cliente;

	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="idPista")
	private long idPista;
	
	@Column(name="idCliente")
	private long idCliente;
	
}
