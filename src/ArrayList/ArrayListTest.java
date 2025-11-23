package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

    public static void main(String [] args){

        List<String> nameList = new ArrayList<>(2);
        nameList.add("Abhishek");
        nameList.add("Aman");
        nameList.add("Mohit");
        nameList.add("Amit");
        nameList.add("Shivam");

        //1. Printing the entire list
        System. out.println("All names in the list: ");
        System.out.println(nameList);

       // for(int i=0;i<nameList.size();i++){

        //System.out.println(nameList.get(i));

          //2. Accessing element by index
            System.out.println("\nFirst name:  " + nameList.get(0));
            System.out.println("\nFourth name: " + nameList.get(3));

            System.out.println("\nLast name:  " + nameList.get(nameList.size()-1));

        // 3. Checking if a name exists
        String searchName = "Kajal";
        if (nameList.contains(searchName)) {
            System.out.println("\n" + searchName + " is present in the list.");
        } else {
            System.out.println("\n" + searchName + " is not found.");
        }

        // 4. Removing a name
        nameList.remove("Aman");
        System.out.println("\nList after removing 'Aman':");
        System.out.println(nameList);

        // 5. Iterating using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String name : nameList) {
            System.out.println(name);
        }

        // 6. Size of the list
        System.out.println("\nTotal names in the list: " + nameList.size());

        //7. Adding a name

        nameList.add("Kajal");
        System.out.println("\nList after adding 'Kajal': " +  nameList.size());

      //8. Searching with the index
    int index = nameList.indexOf("Kajal");
    System.out.println("\nIndex of Kajal is :  " + index);

    String nameToFind = "Kajal";
    boolean found = false;

    for(String name : nameList) {

        if (name.equals(nameToFind)) {
            found = true;
            break;
        }
    }

    if(!found){
        System.out.println("\n" + nameToFind + " is not found.");
    }
    else {
        System.out.println("\n" + nameToFind + " is found.");

    }

    //9. Iterating using iterator
        System.out.println("\n9. Iterating using Iterator:");

        Iterator<String> iterator = nameList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        // 10. Iterating using ListIterator (backward)
        System.out.println("\n10. Backward using ListIterator:");
        ListIterator<String> listIterator = nameList.listIterator(nameList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}
