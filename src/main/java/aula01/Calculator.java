package aula01;

/*
Exercício 2: Calculadora Simples
Objetivo: Criar um programa que solicita dois números ao usuário e exibe a soma.
Siga os passos:
   1) Criar um novo arquivo chamado `Calculator.java`.
   2) Implementar o seguinte código:
   3) Executar o código e testar com diferentes valores.
      Exemplo de entrada e saída:
      ```cmd
      Digite o primeiro número: 5
      Digite o segundo número: 3
      A soma dos números é: 8.0
      ```
   4) Teste com vários valores de entrada.
   5) Modifique o código para testar outras operações como subtração e multiplicação.
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Cria um objeto chamado `scanner` do tipo `Scanner` que se conecta ao `System.in` do Java.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        // O método `Scanner.nextDouble()` recebe um número `double`
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("A soma dos números é: " + sum);

        scanner.close();
    }
}
