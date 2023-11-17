package com.github.curriculeon.lottery.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation4.ArithmeticSolution;
import com.github.curriculeon.lottery.testcases.ImplementationTest;

public class TestImplementationArithmetic implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new ArithmeticSolution();
    }
}
