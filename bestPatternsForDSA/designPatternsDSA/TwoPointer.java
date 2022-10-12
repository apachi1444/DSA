package designPatternsDSA;

public class TwoPointer {
    public int twoPointerForPairSum(int A[] , int N , int X){
        int i = 0;
        int j = N - 1;

        while(i < j){
            if(A[i] + A[j] == X){
                return 1;
            }
            else if (A[i] + A[j] > X){
                j--;
            }
            else i++;
        }
        return 0;
    }
}
