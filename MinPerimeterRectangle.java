// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        
        int i=1;
        int min = Integer.MAX_VALUE;
        for(i=1; i*i<N;i++){
            if(N%i==0){ 
                if(2*(i+N/i)<min)
                  min =  2*(i + N/i);
            }
        }
        
        if(i*i==N){
            if(4*i <min){
                min = 4*i;
            }
        }
        
        return min;
        
    }
}