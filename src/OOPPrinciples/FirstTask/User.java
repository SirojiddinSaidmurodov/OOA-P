package OOPPrinciples.FirstTask;

class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User("user1", "psw1");
        user.createQuery();
        user.new Query().printToLog();
        new User("anotherUser", "psw2").new Query().printToLog();
    }

    void createQuery() {
        new Query().printToLog();
    }

    class Query {
        void printToLog() {
            System.out.println("User " + login + " :: " + password + " sent request");
        }
    }
}
