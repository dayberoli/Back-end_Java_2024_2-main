package aula03.abstrato;

public class Fusquinha extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Tec tec tec!");
    }

    @Override
    void stopEngine() {
        System.out.println("Toc toc toc!");
    }

    public Fusquinha() {
    }
}
