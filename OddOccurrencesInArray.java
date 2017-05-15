// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import static java.lang.System.out;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sizeA = A.length;
        int answer=0;
        int[] judge = new int[sizeA];
        
        for(int i=0;i<sizeA;i++){
            judge[i]=0;
        }
        
        for(int i =0; i<sizeA-1;i++){
            
            for(int j=i+1;j<sizeA;j++){
                
                if((A[i]==A[j])&&A[i]!=0){
                    judge[i]=1;
                    judge[j]=2;
                    break;
                }
            }
        }
        
        
        
        for(int i=0; i<sizeA; i++){
            if(judge[i]==0){
                answer= A[i];
            }
        }
        
        return answer;
    }
    
}