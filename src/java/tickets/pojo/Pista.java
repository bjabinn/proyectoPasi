
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
