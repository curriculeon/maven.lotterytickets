package com.github.curriculeon.lottery.implementation6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.cnblogs.com/createman/p/17308284.html
public class TicketEvaluator {
    private final Integer numberOfLotteryTickets;

    public TicketEvaluator(Integer numberOfLotteryTickets) {
        this.numberOfLotteryTickets = numberOfLotteryTickets;
    }

    public int getSizeOfListOfLargestNumberOfWinners() {
        int sizeOfListOfLargestNumberOfWinners = 0;
        final List<Integer> list = getListOfWinners();
        final Integer largestWinnerSize = Collections.max(list);
        for (final Integer currentWinnerValue : list) {
            final boolean isValueLargestWinnerSize = largestWinnerSize == currentWinnerValue.intValue();
            if (isValueLargestWinnerSize) {
                sizeOfListOfLargestNumberOfWinners++;
            }
        }
        return sizeOfListOfLargestNumberOfWinners;
    }

    private List<Integer> getListOfWinners() {
        final List<Integer> list = new ArrayList<>();
        final int[] ticketSums = getTicketSums();
        final int count = Arrays.stream(ticketSums).max().getAsInt();
        for (int j = 1; j <= count; j++) {
            int val = 0;
            for (final int k : ticketSums) {
                if (j == k) {
                    val++;
                }
            }
            list.add(val);
        }
        return list;
    }

    private int[] getTicketSums() {
        final int[] arr = new int[numberOfLotteryTickets];
        for (int i = 1; i <= numberOfLotteryTickets; i++) {
            int sum = 0;
            final String[] strs = String.valueOf(i).split("");
            for (final String str : strs) {
                sum += Integer.parseInt(str);
            }
            arr[i - 1] = sum;
        }
        return arr;
    }
}
