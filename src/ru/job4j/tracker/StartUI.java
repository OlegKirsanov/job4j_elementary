package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("--- Create a new Item ---");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item was added!");
                System.out.println();
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for(int index = 0; index < items.length; index++) {
                    Item current = items[index];
                    if (current == null) {
                        break;
                    }
                    System.out.println("Id: " + current.getId() + " name: " + current.getName());
                }
                System.out.println();
            } else if (select == 2) {
                System.out.println("--- Edit an Item ---");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                System.out.println("Enter a new name: ");
                String newName = scanner.nextLine();
                for(int index = 0; index < items.length; index++) {
                    Item current = items[index];
                    if (current == null) {
                        break;
                    }
                    current.setName(newName);
                    boolean result = tracker.replace(current.getId(), current);
                    if (result) {
                        System.out.println("Replace was successful!");
                    } else {
                        System.out.println("Error!");
                    }
                }
                System.out.println();
            } else if (select == 3) {
                System.out.println("--- Delete an Item ---");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                for(int index = 0; index < items.length; index++) {
                    Item current = items[index];
                    if (current == null) {
                        System.out.println("No Items found!");
                        break;
                    }
                    boolean result = tracker.delete(current.getId());;
                    if (result) {
                        System.out.println("Delete was successful!");
                    } else {
                        System.out.println("Error!");
                    }
                }
                System.out.println();
            } else if (select == 4) {
                System.out.println("--- Find an Item by Id ---");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Item found!");
                    System.out.println("Id: " + item.getId() + " name: " + item.getName());
                } else {
                    System.out.println("No Items found!");
                }
                System.out.println();
            } else if (select == 5) {
                System.out.println("--- Find an Item by Name ---");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                for(int index = 0; index < items.length; index++) {
                    Item current = items[index];
                    System.out.println("Id: " + current.getId() + " name: " + current.getName());
                }
                System.out.println();
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        StartUI test = new StartUI();
        test.init(scanner, tracker);
    }
}
