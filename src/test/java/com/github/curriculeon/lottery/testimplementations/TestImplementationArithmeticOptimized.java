package com.github.curriculeon.lottery.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation5.ArithmeticOptimizedSolution;
import com.github.curriculeon.lottery.testcases.ImplementationTest;

public class TestImplementationArithmeticOptimized implements ImplementationTest {

    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new ArithmeticOptimizedSolution();
    }
}
