/*
Найдите возраст человека, если известно, что год его рождения 1991.
Выведите полученный результат в виде "Возраст = ..."
 */
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int birthOfYear = 1990;
        System.out.print("Введите год: ");
        int currentYear = in.nextInt();
        System.out.printf("Возраст = %d", (currentYear-birthOfYear));
    }
}
