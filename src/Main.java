public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop(10000, 1000, 500, 10,10,10,500);

        Invetory invetory = new Invetory();

        Brawler elPrimo = new Brawler("Rare", "El Primo",1,1440,6000,5);

        Match match = new Match(5000,10,5,5);
    }
}