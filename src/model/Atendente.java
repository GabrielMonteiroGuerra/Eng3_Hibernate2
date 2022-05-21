package model;

@Entity
@Table(name = "Atendente")

public class Atendente {
	
	@Id
	@Column(name = "codigo_atendente")
	@NotNull
	private int id;
	
	@Column(name = "nome_atendente")
	@NotNull
	private String nome;
	
	@Column(name = "email_atendente")
	@NotNull
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Atendente [id=" + id + ", nome=" + nome + ", email=" + email + ", hora=" + hora + "]";
	}
	
	

}
