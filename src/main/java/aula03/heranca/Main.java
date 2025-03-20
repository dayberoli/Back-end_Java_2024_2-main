package aula03.heranca;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Diguinho", 5);
        myDog.makeSound(); // Executa a versão da subclasse
        System.out.println(
                "Nome: " + myDog.nomeDoBicho + "\n" +
                "Idade: " + myDog.idadeDoBicho
        );

        // myDog.makeSound(10);
    }
}

