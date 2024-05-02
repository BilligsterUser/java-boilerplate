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
}
