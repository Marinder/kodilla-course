package testing;
import testing.Calculator;

public class TestingMain {
    public static void main(String[] args){

        System.out.println("Test - add:");
        Calculator calculator = new Calculator(10,20);
        Integer result = calculator.add();
        if (result.equals(30)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - substract:");
        Calculator calculator2 = new Calculator(50,7);
        Integer result2 = calculator2.subtract();
        if (result2.equals(43)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}