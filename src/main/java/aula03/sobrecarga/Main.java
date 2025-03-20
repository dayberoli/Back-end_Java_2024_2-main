package aula03.sobrecarga;

// Quando a classe está em outro pacote ela precisa ser importada
import aula03.visibilidade.MyNewClass;

public class Main {
    static int plusMethod(int x, int y) {
        System.out.println("INT INT ");
        return x + y;
    }

    static double plusMethod(double x, double y) {
        System.out.println("DOUBLE DOUBLE ");
        return x + y;
    }

    static double plusMethod(int x, double y) {
        System.out.println("INT DOUBLE ");
        return x + y;
    }


    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4, 1.55555);
        double myNum3 = plusMethod(4.09, 1.55555);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("double: " + myNum3);

        // Usando uma classe de outro pacote
        // Veja o pacote "visibilidade"
        MyNewClass thing1 = new MyNewClass();
        thing1.atributo1 = 9;
        System.out.println("Valor: " + thing1.atributo1);
        // thing1.atributo2 = 10;
        // System.out.println("Valor: " + thing1.atributo2);
    }


}

