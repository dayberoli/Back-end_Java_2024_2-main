package aula03.abstrato;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();

    String marca;

    public void horn(){
        System.out.println("Bi! " + "bi!");
    }

    public Vehicle() {
    }
}

