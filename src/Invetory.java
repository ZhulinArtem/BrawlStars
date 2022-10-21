public class Invetory extends Shop{

    private double dropCoinsAmount;
    private int dropCoins;
    private double dropPowerPointsAmount;
    private int dropPowerPoints;

    public void myBoxes(){

        System.out.println("You have:");
        System.out.println(box + " boxes");
        System.out.println(bigBox + " big boxes");
        System.out.println(megaBox + " mega boxes");
    }

    public void openBox() {

        if (box < 1 ) {
            System.out.println("You haven't boxes");
        }
        else {
            box = box - 1;
            dropCoinsAmount = Math.random()*100;
            dropCoins = (int) dropCoinsAmount;
            coins = coins + dropCoins;
            dropPowerPointsAmount = Math.random()*50;
            dropPowerPoints = (int) dropPowerPointsAmount;
            powerPoints = powerPoints + dropPowerPoints;
            System.out.println("You opened box");
            System.out.println("You received " + dropCoins + " coins");
            System.out.println("You received " + dropPowerPoints + " power points");
            System.out.println("You have " + box + " boxes left");
        }
    }

    public void openBigBox() {

        if (bigBox < 1 ) {
            System.out.println("You haven't big boxes");
        }
        else {
            bigBox = bigBox - 1;
            dropCoinsAmount = Math.random() * 300;
            dropCoins = (int) dropCoinsAmount;
            coins = coins + dropCoins;
            dropPowerPointsAmount = Math.random()*150;
            dropPowerPoints = (int) dropPowerPointsAmount;
            powerPoints = powerPoints + dropPowerPoints;
            System.out.println("You opened big box");
            System.out.println("You received " + dropCoins + " coins");
            System.out.println("You received " + dropPowerPoints + " power points");
            System.out.println("You have " + bigBox + " big boxes left");
        }
    }

    public void openMegaBox() {

        if (megaBox < 1) {
            System.out.println("You haven't mega boxes");
        }
        else {
            megaBox = megaBox - 1;
            dropCoinsAmount = Math.random() * 1000;
            dropCoins = (int) dropCoinsAmount;
            coins = coins + dropCoins;
            dropPowerPointsAmount = Math.random()*500;
            dropPowerPoints = (int) dropPowerPointsAmount;
            powerPoints = powerPoints + dropPowerPoints;
            System.out.println("You opened mega box");
            System.out.println("You received " + dropCoins + " coins");
            System.out.println("You received " + dropPowerPoints + " power points");
            System.out.println("You have " + megaBox + " mega boxes left");
        }
    }
}
