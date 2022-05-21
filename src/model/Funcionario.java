package model;

@Entity
@Table(name = "Funcionario")

public class Funcionario {
	
	@Id
	@Column(name = "codigo_funcionario")
	@NotNull
	private int id;
	
	@Column(name = "nome_funcionario")
	@NotNull
	private String nome;
	
	@Column(name = "salario_funcionario")
	@NotNull
	private double salario;

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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
