package testing;


public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        int plus = a + b;
        return plus;
    }
    public int subtract(){
        int minus = a - b;
        return minus;

    }
}
