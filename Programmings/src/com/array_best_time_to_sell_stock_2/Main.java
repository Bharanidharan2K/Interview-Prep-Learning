package com.array_best_time_to_sell_stock_2;

public class Main {

	public static void main(String[] args) {
		int []prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}
	public static int maxProfit(int[] prices) {
		int profit = 0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i-1] < prices[i]) {
				int diff = Math.abs(prices[i-1] - prices[i]);
				profit += diff;
			}
		}
		return profit;
	}

}
