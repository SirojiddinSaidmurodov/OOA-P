package OOPPrinciples.Task6;

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
        new IQuery.Query().printToLog(user);
        new IQuery.Query().printToLog(new User("anotherUser", "psw2"));
    }

    void createQuery() {
        new IQuery.Query().printToLog(this);
    }

    interface IQuery {
        void printToLog(User user);

        class Query implements IQuery {
            @Override
            public void printToLog(User user) {
                System.out.println("User " + user.login + " :: " + user.password + " sent request");
            }
        }
    }
}

