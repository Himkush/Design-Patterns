package in.himkush;

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hand");

    }
    public void walkForward(){
        int movement =  generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement +" Spaces ");
    }

    public void reactTohuman(String driverName){

        System.out.println("Enemy Robot tramps on " + driverName);
    }
}
