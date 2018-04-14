package in.himkush.FactoryPattern;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

    public double getAmtDamage(){
        return amtDamage;
    }

    public void setAmtDamage(double newdamage){
        this.amtDamage = newdamage;
    }

    public void followHeroShip(){
        System.out.println(this.getName() + " is  following the hero");
    }

    public void displayEnemyNewShip(){
        System.out.println(this.getName() + " is  on the screen");

    }

    public void enemyShoots(){
        System.out.println(this.getName() + "attack and does "+getAmtDamage());

    }
}
