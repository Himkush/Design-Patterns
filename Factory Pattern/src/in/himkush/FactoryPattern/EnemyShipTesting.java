package in.himkush.FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {


    public static void main(String[] args) {

//        EnemyShip theEnemy = null;
//
//        EnemyShip ufo = new UFOEnemyShip();
//        Scanner userInput = new Scanner(System.in);
//
//        String enemyShipOption = "";
//        System.out.print("What type of Enemy (U/R)");
//
//        if (userInput.hasNextLine()) {
//            enemyShipOption = userInput.nextLine();
//
//        }
//
//        if (enemyShipOption.equals("U")) {
//            theEnemy = new UFOEnemyShip();
//        }
//        if (enemyShipOption.equals("R")) {
//            theEnemy = new RocketEnemyShip();
//        }
//
//            doStuff(theEnemy);

        EnemyShipFactory ShipFactory=  new EnemyShipFactory();
        EnemyShip  theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of Enemy (U/F/B)");

        if (userInput.hasNextLine()){
            String typeofEnemy = userInput.nextLine();
            theEnemy = ShipFactory.makeEnemyShip(typeofEnemy);

        }
        if(theEnemy!= null){
            doStuff(theEnemy);
        }

    }


        public static void doStuff (EnemyShip anEnemyShip){

            anEnemyShip.displayEnemyNewShip();
            anEnemyShip.followHeroShip();
            anEnemyShip.enemyShoots();
        }


}
