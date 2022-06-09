import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Main {

    public static Main printElevator(Queue<Integer> floor) {
        out.println("Лифт проследовал по следующим этажам:" +
                lineSeparator() +
                floor.stream().map(i -> i.toString()).collect(Collectors.joining("->")));


        return null;
    }


    public static  Main addFloor(Scanner scanner ) {
        Queue<Integer> floor = new ArrayDeque<>();

        int d;


        while (true) {
            try {
                out.println("Ожидаю ввода этажа: (для завершения введите 0)");
                d = scanner.nextInt();
                if (0 <= d & d <= 25) {
                    if (d != 0) {
                        floor.add(d);

                    } else {
                        floor.add(0);
                        printElevator(floor);
                        break;
                    }

                } else {
                    out.println("Такого этажа нет");
                }


            } catch (NoSuchElementException ex) {
                out.println("Введите число");
            }
        }
        return null;

    }

    public static void main(String[] args) {
        Main.addFloor(new Scanner(System.in) );
    }
}


