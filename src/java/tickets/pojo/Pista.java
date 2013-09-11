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
@Table
public class Pista {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idPista")
	private long idPista;
	
	@Column(name="descripcion")
	private String descripcion;

	public long getIdPista() {
		return idPista;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
