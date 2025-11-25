package MAP;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo
{
    public static void main(String[] args) {
        List user = new ArrayList<>();
        user.add("Abhi");
        user.add("Kajal");
        user.add("Asha");
        user.add("Katha");
        user.add("Satyaprem");
        user.add(1);

        System.out.println("All User ");
        for(Object o : user){
            System.out.println(o.toString());
        }
    }
}
