package StructuralPatterns.Decorator.Garbage;

abstract class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public String getDescription() {
        return description;
    }

    double cost() {
        double price = 0;
        if (hasMilk()) {
            price += 0.05;
        }
        if (hasMocha()) {
            price += 0.15;
        }
        if (hasSoy()) {
            price += 0.2;
        }
        if (hasWhip()) {
            price += 0.1;
        }
        return price;
    }

}
