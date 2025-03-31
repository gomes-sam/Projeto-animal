package br.com.mundo.animal.Main;

import br.com.mundo.animal.Model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Rex", "Marrom", "Labrador", 5);
        cachorro.exibirInfo();
        cachorro.EmitirSom();
        cachorro.Correr();
        System.out.println("------------------------");

        Animal gato = new Animal("pom-pom","rajado","siames",2);
        gato.exibirInfo();
        gato.EmitirSom();
        gato.Correr();
    }
}
