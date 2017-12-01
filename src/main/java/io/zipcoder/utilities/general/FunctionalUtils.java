package io.zipcoder.utilities.general;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Created by leon on 12/1/17.
 */
public class FunctionalUtils {
    /**
     * @param fn binary function
     * @param val1 first input
     * @param val2 second input
     * @param <T> type of first input
     * @param <K> type of second input
     * @param <R> return type
     * @return result of function wrapped in Supplier
     */
    public static <T, K, R> Supplier<R> bind(BiFunction<T,K, R> fn, T val1, K val2) {
        return () -> fn.apply(val1, val2);
    }
}
