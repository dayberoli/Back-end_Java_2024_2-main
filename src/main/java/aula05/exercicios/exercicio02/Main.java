package aula05.exercicios.exercicio02;

public class Main {

    public static void main(String[] args) {

        Student joca = new Student();
        joca.setName("Joca da Silva Joquinha");
        joca.setAge(15);

        System.out.println(
                "O estudante " + joca.getName() +
                        " tem " + joca.getAge() + " anos."
        );

    }
}
