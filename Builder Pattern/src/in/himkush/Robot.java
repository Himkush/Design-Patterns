package in.himkush;

public class Robot implements RobotPlan {
    private String robotHead;

    private String robotTorso;

    private String robotArms;

    private String robotlegs;


    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        robotlegs =  legs;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotlegs() {
        return robotlegs;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotHead() {
        return robotHead;
    }
}
