package atividade1;

public class Tema {
	private long id;
	private String nome;
	private double valorAluguel;
	private String cor;

	public Tema(long id, String nome, double valorAluguel, String cor) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.cor = cor;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (id >= 0) {
			this.id = id;
		}
		else {
			System.out.println("ID inválido! Não pode ser negativo.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		if (valorAluguel >= 0) {
			this.valorAluguel = valorAluguel;
		}
		else {
			System.out.println("Valor inválido! Não pode ser negativo.");
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
