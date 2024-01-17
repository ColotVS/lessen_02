public class lesson_02_10 {
    public static void main(String[] args) {
         /*С каждым разом огромнее
    В переменную hugeAmount нужно записать число 100500.
    Используй переменные bigAmount, greatAmount и преобразование строки в число.
    Для объявления и инициализации hugeAmount используй одну команду.*/
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount)+Integer.parseInt(greatAmount);

        System.out.println(hugeAmount);
    }


}
