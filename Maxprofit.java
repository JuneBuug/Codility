// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        int result = Integer.MIN_VALUE;
        for(int stock: A){

            if(stock < min){
                min = stock;
            }

            if(result< (stock-min)){
                result = stock -min ;
            }
        }

        if(result<=0){
            return 0;
        }

        return result;
    }
}
