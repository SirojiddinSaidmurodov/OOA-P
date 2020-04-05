package Facade.Custom;

class Keys {
    private String key;

    public Keys(String key) {
        this.key = key;
    }

    public boolean turn(Keys keys) {
        if (keys.key.equals(key)) {
            System.out.println("Ключи вставлены");
            return true;
        } else {
            System.out.println("Ключи не подошли");
        }
        return false;
    }
}
