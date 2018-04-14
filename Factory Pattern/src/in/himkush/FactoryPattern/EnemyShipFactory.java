package in.himkush.FactoryPattern;

public class EnemyShipFactory {

    public  EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip =  null;

        if(newShipType.equals("U")){
            newShip = new UFOEnemyShip();
        }

        if(newShipType.equals("R")){
            newShip = new RocketEnemyShip();
        }

        if(newShipType.equals("B")){
            newShip = new BigUfoEnemyShip();
        }

        return newShip;





    }

}
