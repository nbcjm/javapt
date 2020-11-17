import Sort.Insertion_sort;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class Insertion_sortTest {
    private final Insertion_sort insertion_sort = new Insertion_sort();
    Random random = new Random();
    /*
    @Test
    public void createListtest(){
       assertNotNull(Insertion_sort.createrandomListmethod(5));
    }
    */
    /*
    @Test
    public void sortmethodtest(){
        int[] List ={6,8,1,3,7};
        int[] sortedList={1,3,6,7,8};
        assertArrayEquals(Insertion_sort.sortmethod(List),sortedList);
    }
    */
    @Test
    public void createListtest(){
        assertNotNull(Insertion_sort.createrandomListmethod(5));
    }
    @Test
    public void sortmethodtest(){
        Vector<Integer> List = new Vector<Integer>(Arrays.asList(6,8,1,3,7));
        Vector<Integer> sortedList = new Vector<Integer>(Arrays.asList(1,3,6,7,8));
        assertEquals(Insertion_sort.sortmethod(List),sortedList);
    }
    @Test
    public void test1(){
        Vector<Integer> L1 = new Vector<Integer>(Arrays.asList(5, 7, 2, 4, 7));
        Vector<Integer> RightL1 = new Vector<Integer>(Arrays.asList(2,4,5,7,7));
        Vector<Integer> L2 = new Vector<Integer>(Arrays.asList(0, 3, 3, 1, 1));
        Vector<Integer> RightL2 = new Vector<Integer>(Arrays.asList(0, 1, 1, 3, 3));
        Vector<Integer> L3 = new Vector<Integer>(Arrays.asList(6, 0, 5, 7, 6));
        Vector<Integer> RightL3 = new Vector<Integer>(Arrays.asList(0, 5, 6, 6, 7));
        Vector<Integer> L4 = new Vector<Integer>(Arrays.asList(7, 6, 3, 0, 0));
        Vector<Integer> RightL4 = new Vector<Integer>(Arrays.asList(0, 0, 3, 6, 7));
        Vector<Integer> L5 = new Vector<Integer>(Arrays.asList(3, 1, 8, 7, 1));
        Vector<Integer> RightL5 = new Vector<Integer>(Arrays.asList(1, 1, 3, 7, 8));
        Vector<Integer> L6 = new Vector<Integer>(Arrays.asList(3, 4, 4, 5, 4));
        Vector<Integer> RightL6 = new Vector<Integer>(Arrays.asList(3, 4, 4, 4, 5));
        Vector<Integer> L7 = new Vector<Integer>(Arrays.asList(5, 7, 7, 5, 7));
        Vector<Integer> RightL7 = new Vector<Integer>(Arrays.asList(5, 5, 7, 7, 7));
        Vector<Integer> L8 = new Vector<Integer>(Arrays.asList(7, 4, 1, 8, 2));
        Vector<Integer> RightL8 = new Vector<Integer>(Arrays.asList(1, 2, 4, 7, 8));
        Vector<Integer> L9 = new Vector<Integer>(Arrays.asList(4, 5, 0, 2, 3));
        Vector<Integer> RightL9 = new Vector<Integer>(Arrays.asList(0, 2, 3, 4, 5));
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
        assertEquals(Insertion_sort.sortmethod(L1),RightL1);
    }
}