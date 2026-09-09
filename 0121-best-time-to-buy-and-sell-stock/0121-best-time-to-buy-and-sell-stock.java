class Solution {
    public int maxProfit(int[] prices) {
        int Min_price =Integer.MAX_VALUE;
        int max_profit=0;
        for(int price:prices){ 
        if(price < Min_price){
            Min_price =price;
        }
        if(price-Min_price>max_profit){
            max_profit= price-Min_price;
        }

    }
    return max_profit;
}
}