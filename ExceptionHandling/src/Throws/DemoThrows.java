package Throws;

public class DemoThrows{
    int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;
    }
    public static void main(String args[]){
        DemoThrows obj = new DemoThrows();
        try{
            System.out.println(obj.division(15,0));
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide this number by zero");
        }
    }
}