package Sort;

import java.util.*;
public class Insertion_sort {

    public Vector<Integer> sortmethod(Vector<Integer> List){
        int counter=0;
        Vector<Integer> sortedList = new Vector<Integer>();
        sortedList.clear();
        sortedList=List;
        //  ol에서 sl에 add(위치,값)로 넣자
        for(int i=sortedList.size();i>counter;counter++) {

            sortmethodpart1(sortedList, counter);
            /*
            for (int i = 0; i < sortedList.size(); i++) {

                if (key<sortedList.get(i)){
                    sortedList.add(i,key);
                    continue Sort;
                }
            }

            sortedList.add(sortedList.size(),key);
            */
        }


        return sortedList;
    }
    //
    public Vector<Integer> sortmethodpart1(Vector<Integer> List, int counter){
        int keyelement=List.get(counter);
        for (int i = 0; i < List.size(); i++) {

            if (keyelement<List.get(i)){
                List.remove(counter);
                List.add(i,keyelement);
                return List;
            }
        }
        return List;
    }
    /*
    //회차별로 테스트가 가능한 정렬 메소드
    public Vector<Integer> sortmethod(Vector<Integer> List,int setround){
        Vector<Integer> sortedList = new Vector<Integer>();
        sortedList.clear();
        int nowround=(-1);
        Sort : for(Integer key : List) {

            for (int i = 0; i < sortedList.size(); i++) {

                if (nowround>=setround) continue;

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
    */


}