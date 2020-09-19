package CreationalPatterns.Singleton.Synched;

class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler boiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (boiler == null) {
            return new ChocolateBoiler();
        }
        return boiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        boiled = true;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
