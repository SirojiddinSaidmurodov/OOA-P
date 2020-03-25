package OOPPrinciples.SecondTask;

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
    }

    void createQuery() {
        class Query {
            void printToLog() {
                System.out.println("User " + login + " :: " + password + " sent request");
            }
        }
        new Query().printToLog();
    }
}
