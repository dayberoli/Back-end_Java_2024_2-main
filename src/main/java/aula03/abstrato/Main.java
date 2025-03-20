package aula03.abstrato;

public class Main {

    public static void main(String[] args) {
        Vehicle myBike = new Motorcycle();
        myBike.startEngine();
        myBike.stopEngine();
        myBike.horn();

        Vehicle Fuscao = new Fusquinha();
        Fuscao.startEngine();
        Fuscao.stopEngine();

    }
}

