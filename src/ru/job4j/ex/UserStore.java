package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User current : users) {
            if(current.getUsername().equals(login)){
                return current;
            }
        }
        throw new UserNotFoundException("User not found!");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if(!user.isValid()) {
            throw new UserInvalidException("User is not valid!");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("The login is too short!");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException enf) {
            enf.printStackTrace();
        }

    }
}
