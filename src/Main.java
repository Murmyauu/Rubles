public class Main {
    public static void main(String[] args) {
        int phoneBalance = 39;
        int replenishmentOfTheBalance = 1010;
        int rubles = 100;
        if (replenishmentOfTheBalance > 1000) {
            int balance = replenishmentOfTheBalance + phoneBalance;
            int bonus = replenishmentOfTheBalance / rubles;
            System.out.println("Баланс: " + balance);
            System.out.println("Бонусы: " + bonus);
        } else {
            int balance = replenishmentOfTheBalance + phoneBalance;
            int bonus = 0;
            System.out.println("Баланс: " + balance);
            System.out.println("Бонусы: " + bonus);
        }
    }
}