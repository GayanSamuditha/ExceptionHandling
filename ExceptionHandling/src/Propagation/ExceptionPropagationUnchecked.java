package Propagation;

import java.io.IOException;

class Test{

    public void method3() {
        //compile time error here because
        //checked exceptions can't be propagated.
        throw new IOException();
    }

    public void method1(){
        method3();
    }

    public void method2(){
        try{
            method1();
        }catch(Exception e){
            System.out.println("Exception Handled here !");
        }
    }
}

public class ExceptionPropagationUnchecked {
    public static void main(String args[]){

        Test obj =  new Test();
        obj.method2();
    }
}