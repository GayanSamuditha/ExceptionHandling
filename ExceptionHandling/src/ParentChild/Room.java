package ParentChild;

import java.io.*;

//When base class and child class both throws a checked exception

class BuildingS {

    void color() throws IOException
    {
        System.out.println("Blue");
    }
}


class Room extends BuildingS{

    void color() throws IOException
    {
        System.out.println("White building");
    }

    public static void main(String args[]){
        BuildingS obj = new Room();
        try{
            obj.color();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

/*
The code ran fine because color() method of child class is NOT throwing a checked
exception with scope broader than the exception declared by color() method of base class.
 */