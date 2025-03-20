package aula05.exercicios.exercicio01;

public class Book {
    String title, author;
    int year;

    public static void main(String[] args) {

        Book livro1 = new Book();
        livro1.title = "Título 1";
        livro1.author = "Autor o Livro 1";
        livro1.year = 2021;

        Book livro2 = new Book();
        livro2.title = "Título 2";
        livro2.author = "Autor o Livro 2";
        livro2.year = 2022;

        Book livro3 = new Book();
        livro3.title = "Título 3";
        livro3.author = "Autor o Livro 3";
        livro3.year = 2023;

        System.out.println(
                "Título: " + livro1.title + "\n" +
                        "\tAutor: " + livro1.author + "\n" +
                        "\tAno: " + livro1.year + "\n" +
                        "-------------------"
        );

        System.out.println(
                "Título: " + livro2.title + "\n" +
                        "\tAutor: " + livro2.author + "\n" +
                        "\tAno: " + livro2.year + "\n" +
                        "-------------------"
        );

        System.out.println(
                "Título: " + livro3.title + "\n" +
                        "\tAutor: " + livro3.author + "\n" +
                        "\tAno: " + livro3.year + "\n"
        );

    }
}
