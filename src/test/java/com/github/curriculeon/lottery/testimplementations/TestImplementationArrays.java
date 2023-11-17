package com.github.curriculeon.lottery.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation6.ArraySolution;
import com.github.curriculeon.lottery.testcases.ImplementationTest;

public class TestImplementationArrays implements ImplementationTest {

    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new ArraySolution();
    }
}
