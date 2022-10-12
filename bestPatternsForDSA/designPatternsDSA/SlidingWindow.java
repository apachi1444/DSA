package designPatternsDSA;


public class SlidingWindow {
    public int slidingWindowForMaxSum(int[] a , int n , int k){
        int max_sum = Integer.MIN_VALUE;
        // how many  times the sliding window will be repeated
        for ( int i = 0 ; i < n-k +1 ; i++){
            int cur_sum = 0;
            for ( int j = 0 ; j < k ; j++){
                cur_sum+= a[j];
            }
            max_sum = Math.max(cur_sum , max_sum);
        }
        return max_sum;
    }
}
