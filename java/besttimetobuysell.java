public class besttimetobuysell {
  public static int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE; // Track the lowest price
      int maxProfit = 0; // Track the maximum profit

      for (int price : prices) {
          // Update the minimum price if a lower price is found
          minPrice = Math.min(minPrice, price);
          
          // Calculate the profit if sold today
          int profit = price - minPrice;
          
          // Update the maximum profit
          maxProfit = Math.max(maxProfit, profit);
      }

      return maxProfit;
  }

  public static void main(String[] args) {
      int[] prices = {7, 1, 5, 3, 6, 4};
      System.out.println("Max Profit: " + maxProfit(prices)); // Output: 5
  }
}
