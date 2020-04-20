package ru.job4j.tracker;

import ru.job4j.oop.User;

import java.sql.Statement;

public class StartUI {

    public static void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            StartUI.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private static void showMenu(UserAction[] actions) {
        System.out.println("Menu:");
        for(int index = 0; index < actions.length; index++) {
            System.out.println(actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
