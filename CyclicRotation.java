class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] temp = new int[A.length];
        
        for(int i=0; i<A.length;i++){
            temp[(i+K) % A.length] = A[i];
        }
        
        return temp;
    }
}