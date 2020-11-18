package Sort;

import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
      //  int[] UnSortedList=Insertion_sort.createrandomListmethod(5);
      //  int[] SortedList=Insertion_sort.sortmethod(UnSortedList);
      //  System.out.println(Arrays.toString(SortedList));
        Vector<Integer> S1 = new Vector<Integer>(Arrays.asList(5,7,2,4,7));
        Vector<Integer> S2 = new Vector<Integer>(Arrays.asList(2,5,7,4,7));
        Insertion_sort.sortmethod(S1);
        for(Integer i : Insertion_sort.sortmethod(S1,1)){
            System.out.println(i);
        }
        System.out.println("\n");
        for(Integer i : Insertion_sort.sortmethod(S1,2)){
            System.out.println(i);
        }
        System.out.println("\n");
        for(Integer i : Insertion_sort.sortmethod(S1,3)){
            System.out.println(i);
        }
        System.out.println("\n");
        for(Integer i : Insertion_sort.sortmethod(S1,4)){
            System.out.println(i);
        }

    }
}
