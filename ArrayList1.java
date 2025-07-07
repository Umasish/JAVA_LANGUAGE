import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);// O(1)
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(9);

        list.add(1,12); // it will add  element at index 1 and others element are shift by 1 position
        //System.out.println(list);
        System.out.println(list.size());

        //print the al
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Get Element O(1)
        //System.out.println(list.get(2));

        //Remove Element O(n)
        //System.out.println(list.remove(3));

        //set O(n)
        // list.set(3,34);
        // System.out.println(list);

        //Element exsist
        // System.out.println(list.contains(3));
        // System.out.println(list.contains(17));

        //reverse of  a array list
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
