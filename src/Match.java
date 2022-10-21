public class Match {

    private int trophies;
    private int showdownModeMatches;
    private int brawlBallModeMatches;
    private int gemGrabModeMatches;
    private double winChance;

    public Match(int trophies, int showdownModeMatches, int brawlBallModeMatches, int gemGrabModeMatches){

        if (trophies < 0){
            trophies = 0;
        }
        if (showdownModeMatches < 0){
            showdownModeMatches = 0;
        }
        if (brawlBallModeMatches < 0){
            brawlBallModeMatches = 0;
        }
        if (gemGrabModeMatches < 0){
            gemGrabModeMatches = 0;
        }
        if (trophies > 20000){
            trophies = 5000;
            Shop.starPoints = Shop.starPoints + 15000;
            System.out.println("Нou got 15000 star points for a good game");
            System.out.println("Your trophies have been lowered to 5,000");
        }
        this.trophies = trophies;
        this.showdownModeMatches = showdownModeMatches;
        this.brawlBallModeMatches = brawlBallModeMatches;
        this.gemGrabModeMatches = gemGrabModeMatches;
    }

    public void checkRang(){

        System.out.println("Your trophies " + trophies);
        System.out.println("You played:");
        System.out.println(showdownModeMatches + " showdown matches");
        System.out.println(brawlBallModeMatches + " brawl ball matches");
        System.out.println(gemGrabModeMatches + " gem grab matches");
        if (trophies < 1000) {
            System.out.println("chel ti bot");
        }
        else if (trophies < 5000) {
            System.out.println("bro nado trenirovatsya");
        }
        else {
            System.out.println("zadrot");
        }
    }

    public void playShowdownMode() {

        winChance = Math.random();
        if (winChance > 0.5){
            System.out.println("You win");
            trophies = trophies + 10;
            System.out.println("Your trophies - " + trophies);
            Shop.coins = Shop.coins + 20;
            System.out.println("You have received 20 coins");
            Shop.gems = Shop.gems + 1;
            System.out.println("You have received 1 gem");
        }
        else {
            System.out.println("You lose");
            trophies = trophies - 10;
            if (trophies < 0){
                trophies = 0;
            }
            System.out.println("Your trophies - " + trophies);
            Shop.coins = Shop.coins + 10;
            System.out.println("You have received 10 coins");
        }
        showdownModeMatches = showdownModeMatches + 1;
    }

    public void playBrawlBallMode() {

        winChance = Math.random();
        if (winChance > 0.5){
            System.out.println("You win");
            trophies = trophies +8;
            System.out.println("Your trophies - " + trophies);
            Shop.coins = Shop.coins + 20;
            System.out.println("You have received 20 coins");
            Shop.gems = Shop.gems + 1;
            System.out.println("You have received 1 gem");
        }
        else {
            System.out.println("You lose");
            trophies = trophies - 8;
            if (trophies < 0){
                trophies = 0;
            }
            System.out.println("Your trophies - " + trophies);
            Shop.coins = Shop.coins + 10;
            System.out.println("You have received 10 coins");
        }
        brawlBallModeMatches = brawlBallModeMatches + 1;
    }

    public void playGemGrabMode() {

        winChance = Math.random();
        if (winChance > 0.5){
            System.out.println("You win");
            trophies = trophies + 8;
            System.out.println("Your trophies - " + trophies);
            Shop.coins = Shop.coins + 20;
            System.out.println("You have received 20 coins");
            Shop.gems = Shop.gems + 1;
            System.out.println("You have received 1 gem");
        }
        else {
            System.out.println("You lose");
            trophies = trophies - 8;
            if (trophies < 0){
                trophies = 0;
            }
            System.out.println("Your trophies - " + trophies);
            Shop.coins = Shop.coins + 10;
            System.out.println("You have received 10 coins");
        }
        gemGrabModeMatches = gemGrabModeMatches + 1;
    }
}