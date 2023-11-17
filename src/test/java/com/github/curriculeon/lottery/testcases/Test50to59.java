package com.github.curriculeon.lottery.testcases;

import com.github.curriculeon.lottery.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test50to59 extends LotteryTicketTestInterface {
    // given
    @Test
    default void test50to59() {
        // six 5s expected in the 50s
        test(50, 1);
        test(51, 2);
        test(52, 3);
        test(53, 4);
        test(54, 5); // anomaly
        test(55, 5); // anomaly
        test(56, 5); // anomaly
        test(57, 5); // anomaly
        test(58, 5); // anomaly
        test(59, 5); // anomaly
    }

    @Test
    default void test50() {
        test(50, 1);
    }

    @Test
    default void test53() {
        test(53, 4);
    }

    @Test
    default void test54() {
        test(54, 5);
    }

    @Test
    default void test59() {
        test(59, 5);
    }

}
