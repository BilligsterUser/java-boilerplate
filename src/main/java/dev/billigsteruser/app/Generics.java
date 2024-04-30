package dev.billigsteruser.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Generics {
    final private static Logger l = LoggerFactory.getLogger(app.class);

    public static <T> T[] mergeArrs(T[] arr, T[]... rest) {
        // int len=Arrays.stream(rest).reduce(0,(acc,cur)-> acc+ cur.length,Integer::sum);
        int len = (Arrays.stream(rest).map(x -> x.length)).reduce(0, Integer::sum) + arr.length;
        l.info("len: {}", len);
        T[] result = Arrays.copyOf(arr, len);
        int idx = arr.length;
        for (T[] subArr : rest) {
            for (T t : subArr) {
                result[idx] = t;
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] inputStrArr = new String[]{"1", "2"};
        String[] test0 = Generics.mergeArrs(inputStrArr, new String[]{"3", "4"}, new String[]{"5", "6"});
        Generics.l.info("string arr: {}", test0.toString());
        for (String s : test0) {
            Generics.l.info(s);
        }


        Integer[] inputIntArr = new Integer[]{1, 2};
        Integer[] test1 = Generics.mergeArrs(inputIntArr, new Integer[]{3, 4}, new Integer[]{5, 6});
        Generics.l.info("int arr: {}", test1.toString());
        for (Integer i : test1) {
            Generics.l.info("int: {}", i);
        }
    }
}
