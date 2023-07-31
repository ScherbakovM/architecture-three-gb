package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.HumanWorking;

public class Main {
    public static void main(String[] args) {
        HumanWorking human = new HumanWorking();
        RobotWorking robot = new RobotWorking();

        robot.work();
        // работ не имплементирует интерфейс eat  поэтому и вызвать его у робота не получится

        human.work();
        human.eat();
    }
}