package in.himkush;

public class TestRobotBuilder {

    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Build");

        System.out.println("HEad: " + firstRobot.getRobotHead());

        System.out.println("Torso: " + firstRobot.getRobotTorso());

        System.out.println("Arms: " + firstRobot.getRobotArms());

        System.out.println("Legs: " + firstRobot.getRobotlegs());


    }
}
