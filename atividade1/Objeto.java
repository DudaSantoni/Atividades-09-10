package atividade1;

public class Objeto {

	public static void main(String[] args) {
		Tema tema1 = new Tema (12L, "Toalha", 20.55, "Rosa");
		Cliente cliente1 = new Cliente (10, "Maria Eduarda", "(15)98827-0057", "1234567890", "0987654321");
		ItemTema item1 = new ItemTema (321L, "Gabriel Santoni", "Quintal");
		Endereco endereco1 = new Endereco (54L, "Avenida", 896, "Apartamento", "Vila Rica", "Sorocaba", "18205-600", "SP");

		System.out.println("ID: " + tema1.getId() + ", NOME: " + tema1.getNome() + ", VALOR DO ALUGUEL: " + tema1.getValorAluguel());
		System.out.println("ID: " + cliente1.getId() + ", NOME: " + cliente1.getNome() + ", TELEFONE: " + cliente1.getTelefone() + ", CPF: " + cliente1.getCpf() + ", RG: " + cliente1.getRg());
		System.out.println("ID: " + item1.getId() + ", NOME: " + item1.getNome() + ", DESCRIÇÃO: " + item1.getDescricao());
		System.out.println("ID: " + endereco1.getId() + ", LOGRADOURO: " + endereco1.getLogradouro() + ", COMPLEMENTO: " + endereco1.getComplemento() + ", BAIRRO: " + endereco1.getBairro() + ", CIDADE: " + endereco1.getCidade() + ", CEP: " + endereco1.getCep() + ", UF: " + endereco1.getUf());
	}

}
