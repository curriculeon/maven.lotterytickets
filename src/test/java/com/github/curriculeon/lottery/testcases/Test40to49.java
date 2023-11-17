package com.github.curriculeon.lottery.testcases;

import com.github.curriculeon.lottery.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test40to49 extends LotteryTicketTestInterface {
    // given
    @Test
    default void test40to49() {
        // five 6s expected in the 40s
        test(40, 1);
        test(41, 2);
        test(42, 3);
        test(43, 4);
        test(44, 5);
        test(45, 6); // anomaly
        test(46, 6); // anomaly
        test(47, 6); // anomaly
        test(48, 6); // anomaly
        test(49, 6); // anomaly
    }

    @Test
    default void test40() {
        test(40, 1);
    }

    @Test
    default void test44() {
        test(44, 5);
    }

    @Test
    default void test45() {
        test(45, 6);
    }

    @Test
    default void test46() {
        test(46, 6);
    }


    @Test
    default void test49() {
        test(49, 6); // anomaly
    }


    @Test
    default void test19() {
        test(19, 9);
    }
}
