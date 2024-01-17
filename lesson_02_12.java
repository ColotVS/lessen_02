public class lesson_02_12 {
    public static void main(String[] args) {
        /*Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
        Внеси изменения в код, чтобы все буквы в этих строках стали строчными.*/
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        System.out.println("RESUME".toLowerCase());
        System.out.println("TITLE: ".toLowerCase() + title.toLowerCase());
        System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
        System.out.println("CAREER: ".toLowerCase() + career.toLowerCase());
    }
}
