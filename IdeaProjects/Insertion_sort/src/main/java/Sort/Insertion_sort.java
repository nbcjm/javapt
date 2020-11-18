package Sort;

import java.util.*;
public class Insertion_sort {

    static Random random = new Random();

    public Vector<Integer> sortmethod(Vector<Integer> List){
        Vector<Integer> sortedList = new Vector<Integer>();
        sortedList.clear();
        //  ol에서 sl에 add(위치,값)로 넣자
        Sort : for(Integer key : List) {

            for (int i = 0; i < sortedList.size(); i++) {

                if (sortedList.get(0) == null) {
                    sortedList.add(key);
                    continue;
                }

                if (key<sortedList.get(i)){
                    sortedList.add(i,key);
                    continue Sort;
                }
            }

            sortedList.add(sortedList.size(),key);
        }


        return sortedList;
    }
    //회차별로 테스트가 가능한 정렬 메소드
    public Vector<Integer> sortmethod(Vector<Integer> List,int setround){
        Vector<Integer> sortedList = new Vector<Integer>();
        sortedList.clear();
        int nowround=(-1);
        Sort : for(Integer key : List) {

            for (int i = 0; i < sortedList.size(); i++) {

                if (nowround>=setround) continue;

                if (sortedList.get(0) == null) {
                    sortedList.add(key);
                    continue;
                }

                if (key<sortedList.get(i)){
                    sortedList.add(i,key);
                    nowround++;
                    continue Sort;
                }

            }

            sortedList.add(sortedList.size(),key);
            nowround++;
        }

        return sortedList;
    }


}