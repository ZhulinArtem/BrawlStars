public class Brawler {

    private String rare;
    private String name;
    private int level;
    private int damage;
    private int health;
    private int movementSpeed;

    public Brawler(String rare, String name, int powerLevel, int damage, int health, int movementSpeed){

        if (powerLevel < 1){
            powerLevel = 1;
        }
        if (powerLevel > 11){
            powerLevel = 11;
        }
        if (damage < 550){
            damage = 550;
        }
        if (health < 3500){
            health = 3500;
        }
        if (movementSpeed > 5){
            movementSpeed = 5;
        }
        if (movementSpeed < 1){
            movementSpeed = 1;
        }
        this.rare = rare;
        this.name = name;
        this.level = powerLevel;
        this.damage = damage;
        this.health = health;
        this.movementSpeed = movementSpeed;
    }

    public void brawlerInfo () {

        System.out.println(rare);
        System.out.println(name);
        System.out.println("Level - " + level);
        System.out.println("Damage - " + damage);
        System.out.println("Health - " + health);
        System.out.println("Movement Speed - " + movementSpeed);
    }

    public void upgradeLevel() {

        if (level > 10) {
            System.out.println("Max level is 11");
        }
        else if (Shop.coins < 100) {
            System.out.println("You need more coins");
        }
        else if (Shop.powerPoints < 100) {
            System.out.println("You need more power points");
        }
        else {
            Shop.coins = Shop.coins - 100;
            Shop.powerPoints = Shop.powerPoints - 100;
            System.out.println(rare);
            System.out.println(name);
            level = level + 1;
            System.out.println("Level - " + level);
            damage = damage + 50;
            System.out.println("Damage - " + damage);
            health = health + 300;
            System.out.println("Health - " + health);
            System.out.println("Movement Speed - " + movementSpeed);
        }
    }
}