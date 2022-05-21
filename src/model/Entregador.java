package model;

@Entity
@Table(name = "Entregador")

public class Entregador {
	
	@Id
	@Column(name = "cnh_entregador")
	@NotNull
	private int cnh;
	
	@Column(name = "nome_entregador")
	@NotNull
	private String nome;
	
	@Column(name = "salario_entregador")
	@NotNull
	private double salario;

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
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
		return "Entregador [cnh=" + cnh + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
