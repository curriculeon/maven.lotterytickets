package com.github.curriculeon.lottery.testcases;

import com.github.curriculeon.lottery.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test20to29 extends LotteryTicketTestInterface {
    // given
    @Test
    default void test20to29() {
        // three 8s expected in the 20s
        test(20, 1);
        test(21, 2);
        test(22, 3);
        test(23, 4);
        test(24, 5);
        test(25, 6);
        test(26, 7);
        test(27, 8); // anomaly
        test(28, 8); // anomaly
        test(29, 8); // anomaly
    }

    @Test
    default void test20() {
        test(20, 1);
    }

    @Test
    default void test21() {
        test(21, 2);
    }

    @Test
    default void test27() {
        test(27, 8);
    }


    @Test
    default void test28() {
        test(28, 8);
    }


    @Test
    default void test29() {
        test(29, 8);
    }
}
