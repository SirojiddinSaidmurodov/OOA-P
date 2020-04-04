package OOPPrinciples.Task8;

import static OOPPrinciples.Task8.User.INames.*;

class User {
    private String login;
    private String password;
    private AccessRights rights;

    public User(String login, String password, AccessRights rights) {
        this.login = login;
        this.password = password;
        this.rights = rights;
    }

    public static void main(String[] args) {
        User user = new User("user1", "psw1", AccessRights.ADMIN);
        try {
            user.createQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        user.new Query().printToLog();
        new User("anotherUser", "psw2", AccessRights.GUEST).new Query().printToLog();

    }

    void createQuery() throws Exception {
        if (rights == AccessRights.USER) {
            new Query().printToLog();
        } else {
            throw new Ex();
        }
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
                    + " sent request for " + line);
        }
    }

    private class Ex extends Exception {
        @Override
        public String toString() {
            return rights.toString() + "  " + login + " doesn't have rights for sending request";
        }
    }
}
