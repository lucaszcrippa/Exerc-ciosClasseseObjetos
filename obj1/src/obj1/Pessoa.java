
package obj1;


public class Pessoa {
    String nome;
    int idade;
    String profissao;

    // Construtor
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }
}

