package ru.job4j.poly;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("На столе " + matches + " спичек.");
        int player = 0;
        while(matches > 0) {
            int select = 0;
            if(player < 2) {
                player++;
            } else {
                player--;
            }
            System.out.print("Ход " + player +"-го игрока (от 1 до 3): ");
            select = Integer.parseInt(input.nextLine());
            if (select > matches) {
                do {
                    System.out.println("Вы выбрали слишком много. Попробуйте еще раз.");
                    select = Integer.parseInt(input.nextLine());
                } while (select > matches);
            }
            matches = matches - select;
            System.out.println("На столе осталось " + matches + " спичек.");
            if(matches == 0) {
                System.out.println("Игрок " + player + " выиграл!" );
            }
        }
    }
}
