package aula03.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("João");
        person.setAge(25);

        System.out.println("Nome: " + person.getName());
        System.out.println("Idade: " + person.getAge());
    }
}

