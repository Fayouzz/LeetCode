package com.fayouz;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] acc = {
                {56, 78},
                {3, 4, 5},
                {74, 4}

        };
        System.out.println(highwealth(acc));
    }

    static int highwealth(int[][] accounts) {
        int maxwealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];

            }
            if (rowsum > maxwealth) {
                maxwealth = rowsum;
            }

        }
        return maxwealth;
    }
}
