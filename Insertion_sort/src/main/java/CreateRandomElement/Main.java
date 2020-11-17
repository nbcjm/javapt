package CreateRandomElement;

import java.util.*;

public class Main {
    static Random random = new Random();
    public static void main(String[] args){
      int[] USList =createlist(5);
      System.out.println(Arrays.toString(USList)+"\n");
      int[] SList =sortlist(USList);
      System.out.println(Arrays.toString(SList));
    }
    public static int[] createlist(int c){
        int[] USList=new int[c];
        for(int i=0;i<c;i++){
            USList[i]=random.nextInt(10);
        }
        return USList;
    }
    public static int[] sortlist(int[] List){
        int i,j,key;
        for(i=1;i<List.length;i++){
            key=List[i];

            for(j=i-1;j>=0&&List[j]>key;j--){
                List[j+1]=List[j];
            }
            List[j+1]=key;
        }
        int[] Slist=new int[List.length];

        for(i=0;i<List.length;i++){
            Slist[i]=List[i];
        }

        return Slist;
    }
}
