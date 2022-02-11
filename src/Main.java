public class Main {

    public static void main(String[] args) {

        // Расчет количества начисленных бонусных миль за купленный билет.

        int ticketPrice = 2300; // цена билета в рублях
        int bonusMileFare = 20; // количество потраченных рублей на билет, равное одной бонусной миле
        int earnedBonusMiles = ticketPrice / bonusMileFare; // количество начисленных миль за купленный билет

        System.out.println("Начислено бонусных миль:");
        System.out.println((earnedBonusMiles) + " миль(я)");
    }
}
