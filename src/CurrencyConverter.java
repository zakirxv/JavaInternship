public class CurrencyConverter {
    public static void main(String[] args) {

        int som = 10000;
        double exchangeRate = 87.5;

        double dollars = som / exchangeRate;
        int wholeDollars = (int) dollars;
        double discardedCents = (dollars - wholeDollars) * 100;

        System.out.println("Сумма в сомах: " + som);
        System.out.println("Сумма в долларах: " + dollars);
        System.out.println("Целые доллары: " + wholeDollars);
        System.out.println("Отброшенные центы: " + discardedCents);
    }
}
