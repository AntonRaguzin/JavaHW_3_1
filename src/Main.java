public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Цена 10 000 руб.");
        System.out.println(miles + " Бонусов");

        System.out.println("Цена 12 000 руб.");
        System.out.println(service.calculate(12_000) + " Бонусов");
            }
}
