package StructuralPatterns.Proxy.DuckTypization;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
