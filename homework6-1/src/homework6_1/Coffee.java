package homework6_1;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Brewing coffee grinds");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}