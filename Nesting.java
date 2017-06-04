// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Stack;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8

        if(S.length() % 2 != 0){
            return 0;
        }

        Stack<Character> stack = new Stack<Character>();

        for(char c: S.toCharArray()){

            if(c==')'){
                if(!stack.empty() && (stack.peek()=='(')){
                    stack.pop();
                }else{
                    return 0;
                }
            }else{
                stack.push(c);
            }
        }

        if(stack.empty()){
            return 1;
        }

        return 0;
    }
}
