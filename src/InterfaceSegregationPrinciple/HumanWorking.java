package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.Eating;
import InterfaceSegregationPrinciple.Working;

public class HumanWorking implements Working, Eating {
    public void work() {
        System.out.println("Человек работает");
    }

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}
