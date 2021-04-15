package StructuralPatterns.Proxy.DuckTypization;

public class Pegasus extends Horse {
    @Override
    void ride() {
        System.out.println("Pegasus is riding");
    }

    void fly() {
        System.out.println("Pegasus is flying");
    }
}
