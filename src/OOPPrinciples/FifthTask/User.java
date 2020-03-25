package OOPPrinciples.FifthTask;

interface IQuery {
    static void printToLog(User user) {
        System.out.println("User " + user.login + " :: " + user.password + " sent request");
    }
}

class User {
    public String login;
    public String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User("user1", "psw1");
        user.createQuery();
        IQuery.printToLog(user);
    }

    void createQuery() {
        IQuery.printToLog(this);
    }

}
