package OOPPrinciples.ThirdTask;

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
        Query query = new Query(user);
        query.printToLog();
        new Query(new User("anotherUser", "psw2")).printToLog();
    }

    void createQuery() {
        new Query(this).printToLog();
    }

    static class Query {
        User user;

        Query(User user) {
            this.user = user;
        }

        void printToLog() {
            System.out.println("User " + user.login + " :: " + user.password + " sent request");
        }
    }
}
