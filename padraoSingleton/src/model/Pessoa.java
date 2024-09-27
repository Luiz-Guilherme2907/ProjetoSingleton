package model;

public class Pessoa {
    // Atributos básicos de uma pessoa
    private String nome;
    private int idade;
    private String cpf;

    // Instância única da classe (Singleton)
    private static Pessoa instance;

    // Construtor privado para evitar múltiplas instâncias
    Pessoa() {
        // Inicializa os atributos com valores padrão
        this.nome = "";
        this.idade = 0;
        this.cpf = "";
    }

    // Método para obter a instância única da classe
    public static Pessoa getInstance() {
        if (instance == null) {
            instance = new Pessoa();
        }
        return instance;
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }
}
