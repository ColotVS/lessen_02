import java.util.Scanner;

public class lesson_02_14 {
    public static void main(String[] args) {
        /*Считай с клавиатуры три строки.
        А затем:
        Выведи на экран третью строку в неизменном виде.
        Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
        Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.*/

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
