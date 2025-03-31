package br.com.mundo.animal.Model;

public class Animal {
    public String nome;
    public String raca;
    public String cor;
    public int idade;

    public Animal(String nome, String cor, String raca, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("O nome do animal é: " + nome);
        System.out.println("A cor do animal é: " + cor);
        System.out.println("A raça do animal é: " + raca);
        System.out.println("A idade do animal é: " + idade + " anos");
    }

    public void EmitirSom(){
        System.out.println(nome +" esta  emitindo som...");

    }
    public void Correr(){
        System.out.println("o Animal esta correndo...");
    }
}