package OOPPrinciples.ForthTask;

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
        IQuery query = new IQuery() {
        };
        query.printToLog();
    }

    void createQuery() {
        IQuery query = new IQuery() {
            @Override
            public void printToLog() {
                System.out.println("User " + login + " :: " + password + " sent request");
            }
        };
        query.printToLog();
    }

    interface IQuery {
        default void printToLog() {
            System.out.println("User " + " :: " + " sent request");
        }
    }
}
