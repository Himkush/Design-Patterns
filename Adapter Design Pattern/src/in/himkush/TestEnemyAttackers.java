package in.himkush;

public class TestEnemyAttackers  {

    public static void main(String[] args) {

        EnemyTank rx3Tank = new EnemyTank();

        EnemyRobot crack = new EnemyRobot();

        EnemyAttacker robotAdapter =  new EnemyRobotAdapter(crack);

        System.out.println("The Robot");

        crack.reactTohuman("Bhai");
        crack.walkForward();
        crack.smashWithHands();

        System.out.println("Enemy Tank");

        rx3Tank.assignDriver("Salman");
        rx3Tank.driveForward();
        rx3Tank.fireWeapon();

        System.out.println("Robot Adapter");
        robotAdapter.assignDriver("Oh Yeah");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
