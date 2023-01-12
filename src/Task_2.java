/*
Дано двузначное число 57. Найти:
    a) число десятков в нём;
    b) число едииниц в нём;
    c) сумму его цифр;
    d) произведение его цифр.
 */
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        short number = in.nextShort();
        System.out.println();
        System.out.printf("Число десятков: %d\n", number/10);
        System.out.printf("Число единиц: %d\n", number%10);
        System.out.printf("Сумма цифр: %d\n", number/10 + number%10);
        System.out.printf("Произведение цифр: %d\n", (number/10)*(number%10));
    }
}
