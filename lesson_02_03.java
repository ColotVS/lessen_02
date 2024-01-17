public class lesson_02_03 {
    public static void main(String[] args) {
        /*В переменной number записано число.
                В переменную lastDigit нужно записать последнюю цифру этого числа.
        Для вычисления используй переменную number и оператор «остаток от деления».
        Для объявления и инициализации lastDigit используй одну команду.*/
        int number = 546;

        int lastDigit = number%540;

        System.out.println(lastDigit);
    }
}
