package OOPPrinciples.Task9;

interface IHelper {
    static void checkRole(User.INames.AccessRights rights) throws Exception {
        if (rights != User.INames.AccessRights.USER) {
            throw new Ex();
        }
    }

    class Ex extends Exception {
        @Override
        public String toString() {
            return "User doesn't have rights for sending request";
        }
    }

    static void main(String[] args) {
        User user = new User("user1", "psw1", User.INames.AccessRights.ADMIN);
        try {
            user.createQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        user.new Query().printToLog();
        new User("anotherUser", "psw2", User.INames.AccessRights.GUEST).new Query().printToLog();

    }
}

class User {
    private String login;
    private String password;
    private INames.AccessRights rights;


    public User(String login, String password, INames.AccessRights rights) {
        this.login = login;
        this.password = password;
        this.rights = rights;
    }


    void createQuery() {
        try {
            IHelper.checkRole(rights);
            new Query().printToLog();
        } catch (Exception e) {
            e.printStackTrace();
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
                    + " sent request for " + INames.line);
        }
    }


}
