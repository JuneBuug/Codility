
class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
    
        return (B-A)/K + 1; 
        
        
    }
}


// 100 / 100

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = B/K + 1;
        if(A != 0){
            result -= ((A-1)/K + 1);
        }
        return result;
    }
}