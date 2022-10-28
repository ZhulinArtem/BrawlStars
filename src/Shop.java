public class Shop {

    public static int starPoints;
    public static int coins;
    public static int gems;
    public static int box;
    public static int bigBox;
    public static int megaBox;
    public static int powerPoints;

    public Shop(){
    }

    public Shop(int starPoints , int coins, int gems, int box, int bigBox, int megaBox, int powerPoints) {

        if (starPoints < 0){
            starPoints = 0;
        }
        if (coins < 0){
            coins = 0;
        }
        if (gems < 0){
            gems = 0;
        }
        if (box < 0){
            box = 0;
        }
        if (bigBox < 0){
            bigBox = 0;
        }
        if (megaBox < 0){
            megaBox = 0;
        }
        if (powerPoints < 0){
            powerPoints = 0;
        }
        Shop.starPoints = starPoints;
        Shop.coins = coins;
        Shop.gems = gems;
        Shop.box = box;
        Shop.bigBox = bigBox;
        Shop.megaBox = megaBox;
        Shop.powerPoints = powerPoints;
    }

    public void buyPowerPoints(int quantityPowerPoints){
        if (quantityPowerPoints < 1){
            System.out.println("Are you stupid? How do you want to buy " + quantityPowerPoints + " power points");
        }
        else if (coins < 1){
            System.out.println("You haven't coins");
        }
        else if (quantityPowerPoints * 2 > coins){
            System.out.println("Not enough coins");
            System.out.println("You can buy only " + coins / 2 + " power points");
        }
        else {
            coins = coins - 2 * quantityPowerPoints;
            powerPoints = powerPoints + quantityPowerPoints;
            System.out.println("You buy " + quantityPowerPoints + " power points");
            System.out.println("You have " + coins + " coins left");
        }
    }

    public void balanceInfo() {

        System.out.println("You have:");
        System.out.println(starPoints + " star points");
        System.out.println(coins + " coins" );
        System.out.println(gems + " gems");
        System.out.println(powerPoints + " power points");
    }

    public void buyBoxWithGems () {

        if (gems < 10) {
            System.out.println("Not enough gems");
        }
        else {
            box = box + 1;
            System.out.println("You buy 1 box");
            gems = gems - 10;
            System.out.println("You have " + gems + " gems left");
        }
    }

    public void buyBigBoxWithGems () {

        if (gems < 30) {
            System.out.println("Not enough gems");
        }
        else {
            bigBox = bigBox + 1;
            System.out.println("You buy 1 big box");
            gems = gems - 30;
            System.out.println("You have " + gems + " gems left");
        }
    }

    public void buyMegaBoxWithGems () {

        if (gems < 80) {
            System.out.println("Not enough gems");
        }
        else {
            megaBox = megaBox + 1;
            System.out.println("You buy 1 mega box");
            gems = gems - 80;
            System.out.println("You have " + gems + " gems left");
        }
    }

    public void buyBoxWithStarPoints () {

        if (starPoints < 200) {
            System.out.println("Not enough star points");
        }
        else {
            box = box + 1;
            System.out.println("You buy 1 box");
            starPoints = starPoints - 200;
            System.out.println("You have " + starPoints + " star points left");
        }
    }

    public void buyBigBoxWithStarPoints () {

        if (starPoints < 500) {
            System.out.println("Not enough star points");
        }
        else {
            bigBox = bigBox + 1;
            System.out.println("You buy 1 big box");
            starPoints = starPoints - 500;
            System.out.println("You have " + starPoints + " star points left");
        }
    }

    public void buyMegaBoxWithStarPoints () {

        if (starPoints < 1500) {
            System.out.println("Not enough star points");
        }
        else {
            megaBox = megaBox + 1;
            System.out.println("You buy 1 mega box");
            starPoints = starPoints - 1500;
            System.out.println("You have " + starPoints + " star points left");
        }
    }
}