package OOPPrinciples.Task7;

class User {
    private String login;
    private String password;
    private INames.AccessRights rights;

    public User(String login, String password, INames.AccessRights rights) {
        this.login = login;
        this.password = password;
        this.rights = rights;
    }

    public static void main(String[] args) {
        User user = new User("user1", "psw1", INames.AccessRights.ADMIN);
        user.createQuery();
        user.new Query().printToLog();
        new User("anotherUser", "psw2", INames.AccessRights.GUEST).new Query().printToLog();

    }

    void createQuery() {
        new Query().printToLog();
    }

    interface INames {
        String line = "Connection";

        enum AccessRights {
            ADMIN,
            USER,
            GUEST
        }
    }

    class Query {
        void printToLog() {
            System.out.println(rights.toString() + "  " + login + " :: " + password
                    + " sent request for " + INames.line);
        }
    }
}
