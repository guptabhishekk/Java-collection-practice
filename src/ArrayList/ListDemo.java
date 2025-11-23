package ArrayList;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;

class Car{
    String brand;

 public   Car(String brand){
        this.brand=brand;
    }
// @Override
  //  public String toString(){
    //return brand;
    //}
}



public class ListDemo {
    public static void main(String[] args) {

        //Car c1 =new Car("Toyota");
        //Car c2 =new Car("Ford");

    /*    List u  = new ArrayList<>();
        u.add("Abhi");
        u.add("Kajal");
        u.add("Asha");
        u.add("Ruhi");
        u.add("Katha");
        u.add(1);
        System.out.println("All users -->> ");
        for(Object user : u){

            System.out.println(user);
        }   */

        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");

        System.out.println("ALl list size : ");
        for (String s : l) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Size of the list --> " + l.size());
        System.out.println("Element of the list --> " + l.get(0));


        System.out.println("");
//LIST OF OBJECTS
        Car c1 = new Car("Toyota");
        Car c2 = new Car("Ford");

        List<Car> carlist = new ArrayList<>();
        carlist.add(c1);
        carlist.add(c2);

        for (Car c : carlist) {
            System.out.println(c.brand);

        }
        System.out.println();
    }
}




