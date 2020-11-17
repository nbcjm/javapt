package Sort;

import java.util.*;
public class Insertion_sort {
    static Random random = new Random();


    public static Vector<Integer> createrandomListmethod(int c){
        Vector<Integer> List = new Vector<Integer>();
        for(int i=0;i<c;i++){
            List.add(random.nextInt(10));
        }
        return List;
    }

    public static Vector<Integer> sortmethod(Vector<Integer> List){
        int i,j,key;
        for(i=1;i<List.size();i++){
            key=List.get(i);

            for(j=i-1;j>=0&&List.get(j)>key;j--){
                List.set(j+1,List.get(j));
            }
            List.set(j+1,key);
        }

        Vector<Integer> sortedlist = new Vector<Integer>();
        for (i=0;i<List.size();i++){
            sortedlist.add(List.get(i));
        }
        return sortedlist;
    }
}

 /*
    public static int[] createrandomListmethod(int c){
        int[] List = new int[c];
        for(int i=0;i<c;i++){
            List[i]= random.nextInt(10);
        }
        return List;
    }
    */

    /*
    public static int[] sortmethod(int[] List){
        int i,j,key;
        for(i=1;i<List.length;i++){
            key=List[i];

            for(j=i-1;j>=0&&List[j]>key;j--){
                List[j+1]=List[j];
            }
            List[j+1]=key;
        }
        int[] sortedlist=new int[List.length];

        for(i=0;i<List.length;i++){
            sortedlist[i]=List[i];
        }

        return sortedlist;
    }
    */