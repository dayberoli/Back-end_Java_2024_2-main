package aula05.exercicios.exercicio01;

public class Book2 {

    // Atributo "array" contendo uma array de arrays
    String[][] colecao = {
            {"Star Wars", "George Lucas", "1977"}, // [0][?]
            {"Harry Potter", "Dona Inglesa", "2010"}, // [1][?]
            {"Minecraft", "Bill Gates", "2019"}, // [2][?]
            {"Receitas da Tia", "Tia Jurema", "2022"},
            {"Receitas da Tia", "Tia Jurema", "2022"},
            {"Receitas da Tia", "Tia Jurema", "2022"},
            {"Receitas da Tia", "Tia Jurema", "2022"},
            {"Receitas da Tia", "Tia Jurema", "2022"}
    };

    public static void main(String[] args) {

        Book2 livros = new Book2();

        // Loop para iterar cada livro
        // `array.length` retorna quantos itens existem no array
        // Referências: https://www.w3schools.com/java/java_arrays.asp
        for (
                int i = 0; // Inicializa a variável de controle (só 1º loop)
                i < livros.colecao.length; // Expressão: enquanto for "true" roda o loop
                i++ // Incremento do controle (2º loop em diante)
        ) {
            System.out.println(
                    "Título: " + livros.colecao[i][0] + "\n" +
                            "\tAutor: " + livros.colecao[i][1] + "\n" +
                            "\tAno: " + livros.colecao[i][2] + "\n" +
                            "-------------------"
            );
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Iterando com for-each
        // Referências: https://www.w3schools.com/java/java_arrays_loop.asp
        // A variável `item` é atualizada a cada loop, com os dados de
        // cada item da coleção
        for (String[] item : livros.colecao) {
            System.out.println(
                    "Título: " + item[0] + "\n" +
                            "\tAutor: " + item[1] + "\n" +
                            "\tAno: " + item[2] + "\n" +
                            "-------------------"
            );
        }
    }
}
