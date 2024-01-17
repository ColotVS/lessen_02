import java.util.Scanner;

public class lesson_02_15 {
    public static void main(String[] args) {
        /*Считай с клавиатуры три целых числа.
        Выведи на экран их среднее арифметическое.*/
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a+b+c)/3);
    }
}
