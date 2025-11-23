package ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {


    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Original " + list);

//---------------Reverse Logic start-----------------

        int i = 0;
        int j = list.size()-1;
        while(i < j){
            Integer temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        System.out.println("Reversed " + list);


    }
}
