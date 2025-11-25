package Minor_Project;

import java.util.*;


public class UserManagementDemo {
    public static void main(String[] args) {
      //  Set<String> user1roles   = new HashSet<>(Arrays.asList("ADMIN","USER"));
       // User user1 = new User("Raj", user1roles, true)
        List<User> users = new ArrayList<>();

/*        users.add(new User("Raj", new HashSet<>(Arrays.asList("ADMIN")) , true));

        users.add(new User("Bob", new HashSet<>(Arrays.asList("USER")) , false));

        users.add(new User("Sam", new HashSet<>(Arrays.asList("MANAGER")) , true));

        users.add(new User("Abhi", new HashSet<>(Arrays.asList("CTO")) , true));
*/

        users.add(new User("Raj", true , new HashSet<>(Arrays.asList("ADMIN","USER"))));

        users.add(new User("Bob", false, new HashSet<>(Arrays.asList("USER"))));

        users.add(new User("Sam" , true,new HashSet<>(Arrays.asList("MANAGER"))));

        users.add(new User("Abhi" , true, new HashSet<>(Arrays.asList("CTO"))));

        //REMOVING ACTIVE USERS

        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User u = it.next();
            if(!u.isActive()){
                it.remove();
            }

            //PRINT ACTIVE USER
            System.out.println("Active users ");

            for(User us : users){
                System.out.println(us.getName());
            }

        }

     // COUNT USER PER ROLE
        Map<String, Integer> roleCount = new HashMap<>();
        for(User u : users){
            for(String role : u.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);


            }
        }

        System.out.println("All Users");
        for(Map.Entry<String,Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
