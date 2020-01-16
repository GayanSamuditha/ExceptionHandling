package ParentChild;

import java.io.*;

/* If base class doesn’t throw any exception but child class throws an checked exception  */
class Building {

    void color()
    {
        System.out.println("Blue");
    }
}


class Demo extends Building{

    void color() throws IOException
    {
        System.out.println("White");
    }

    public static void main(String args[]){

        Building obj = new Demo();
        try{
            obj.color();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

/*
The above code is having a compilation error: Because the overriding method (child class method) cannot
throw a checked exception
if the overridden method(method of base class) is not throwing an exception.
 */