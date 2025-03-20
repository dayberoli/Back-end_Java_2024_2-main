package aula05.exercicios.exercicio03;

public class Bank {

    public static void main(String[] args) {
        BankAccount conta = new BankAccount();

        conta.deposit(100);
        conta.withdraw(50.99);
        conta.withdraw(50);
        conta.withdraw(49.01);
    }
}
