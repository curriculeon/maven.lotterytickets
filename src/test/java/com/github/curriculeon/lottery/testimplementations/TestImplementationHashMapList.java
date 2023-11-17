package com.github.curriculeon.lottery.testimplementations;

import com.github.curriculeon.lottery.LotteryTicketSolutionInterface;
import com.github.curriculeon.lottery.implementation1.HashMapListSolution;
import com.github.curriculeon.lottery.testcases.ImplementationTest;

public class TestImplementationHashMapList implements ImplementationTest {
    @Override
    public LotteryTicketSolutionInterface getImplementation() {
        return new HashMapListSolution();
    }
}