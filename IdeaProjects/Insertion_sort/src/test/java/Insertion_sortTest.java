import Sort.Insertion_sort;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class Insertion_sortTest {
    private final Insertion_sort insertion_sort = new Insertion_sort();
    Random random = new Random();
    @Test
    public void basicsorttest() {
        Vector<Integer> UnsortedList = new Vector<Integer>(Arrays.asList(9,1,6,8,3));
        assertEquals(Arrays.asList(1,3,6,8,9),insertion_sort.sortmethod(UnsortedList));
    }
    @Test
    public void stagetest() {
        Vector<Integer> baselist = new Vector<Integer>(Arrays.asList(9,1,6,8,3));
        Vector<Integer> round1list = new Vector<Integer>(Arrays.asList(1,9,6,8,3));
        Vector<Integer> round2list = new Vector<Integer>(Arrays.asList(1,6,9,8,3));
        Vector<Integer> round3list = new Vector<Integer>(Arrays.asList(1,6,8,9,3));
        Vector<Integer> round4list = new Vector<Integer>(Arrays.asList(1,3,6,8,9));
        assertEquals(round1list,insertion_sort.sortmethodpart1(baselist,1));
        assertEquals(round2list,insertion_sort.sortmethodpart1(baselist,2));
        assertEquals(round3list,insertion_sort.sortmethodpart1(baselist,3));
        assertEquals(round4list,insertion_sort.sortmethodpart1(baselist,4));


    }
}