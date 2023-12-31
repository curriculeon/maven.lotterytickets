package com.github.curriculeon.lottery.testcases;

import com.github.curriculeon.lottery.LotteryTicketTestInterface;
import org.junit.jupiter.api.Test;

public interface Test1to9 extends LotteryTicketTestInterface {
    @Test
    default void test1to9() {
        // nine 1s expected in the 0s
        for (int i = 1; i < 9; i++) {
            test(i, i);
        }
    }
}
