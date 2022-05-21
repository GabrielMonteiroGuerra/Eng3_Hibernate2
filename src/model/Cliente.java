package model;


@Entity
@Table(name = "Cliente")

public class Cliente {
	
	@Id
	@Column(name = "codigo_cliente")
	@NotNull
	private int id;
	
	@Column(name = "nome_cliente")
	@NotNull
	private String nome;
	
	@Column(name = "telefone_Cliente")
	@NotNull
	private String telefone;
	
	@Column(name = "email_cliente")
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}
