package dev.billigsteruser.app;


import static org.junit.Assert.*;

import org.junit.*;

public class GenericsTest {

    @Test
    public void testMergeArrsWithStrs() {
        String[] inputStrArr = new String[]{"1", "2"};
        String[] test0 = Generics.mergeArrs(inputStrArr, new String[]{"3", "4"}, new String[]{"5", "6"});
        assertArrayEquals(new String[]{"1", "2", "3", "4", "5", "6"}, test0);
    }

    @Test
    public void testMergeArrsWithInts() {
        Integer[] inputStrArr = new Integer[]{1, 2};
        Integer[] test0 = Generics.mergeArrs(inputStrArr, new Integer[]{3, 4}, new Integer[]{5, 6});
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, test0);
    }
}
