public class DivisionExample {
    public static void main(String[] args) {

        int a = 7;
        int b = 2;

        double fractionalDivision = (double) a / b;
        int remainder = a % b;
        int integerDivision = a / b;

        System.out.println("Целочисленное деление: " + integerDivision);
        System.out.println("Остаток от деления: " + remainder);
        System.out.println("Дробное деление: " + fractionalDivision);
    }
}
