package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");;
        roles.add("MANAGER");
        roles.add("EMPLOYEE");
        roles.add("STAFF");
        roles.add("HR");




      /*  for(String role : roles){
            System.out.println("ROLE: " + role);
           //
            //
            // roles.get


        }*/

        Iterator <String> it = roles.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
