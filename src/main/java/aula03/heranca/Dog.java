package aula03.heranca;

// Classe derivada (subclasse)
public class Dog extends Animal {

    public Dog(String nome, int idade) {
        this.nomeDoBicho = nome;
        this.idadeDoBicho = idade;
    }

    @Override
    public void makeSound() {
        System.out.println("Latido: Au Au!");
    }

    public void makeSound(String texto) {
        System.out.println("Latido: Au Au!");
    }

    public void makeSound(String texto, String outroTexto) {
        System.out.println("Latido: Au Au!");
    }


}

