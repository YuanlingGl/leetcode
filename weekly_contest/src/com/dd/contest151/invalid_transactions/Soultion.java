package com.dd.contest151.invalid_transactions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> list = new ArrayList<String>();
        for (String x:
             transactions) {
            list.add(x);
        }

        return list;
    }
}