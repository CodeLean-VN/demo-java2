package bai1.exampleinterface;

public class CaChep extends DongVat implements ICanFly, ICanSwim{

    @Override
    public void fly() {
        System.out.println("Bay len cao!");
    }

    @Override
    public void swim() {
        System.out.println("Boi xuong thap!");
    }
    
}
