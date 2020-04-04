package Singleton.Classic;

class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        return new ChocolateBoiler();
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
