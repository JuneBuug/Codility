// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int max_binary_gap=0;
        int dividee = N;
        int remainder = 0;
        int current_gap =0;
        List base2 = new ArrayList();
        
        while(dividee>1){
            remainder = dividee % 2;
            base2.add(remainder);
            dividee = dividee / 2;    
        }
        
        for(int i=0; i<base2.size();i++){
            if(Integer.parseInt(base2.get(i).toString())==0){
                current_gap++;
                max_binary_gap = Math.max(max_binary_gap,current_gap);
            }else{
                current_gap = 0;
            }
        }
        
        return max_binary_gap;
    }
}