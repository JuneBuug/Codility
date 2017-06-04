import java.util.Stack;

class Solution {
    public int solution(String S) {

        if(S.length() % 2 != 0){
            return 0;
        }

        Stack<Character> stack = new Stack<Character>();

        for(char c: S.toCharArray()){
            if(c==')'){
                checkpop(stack,'(');
            }else if(c==']'){
                checkpop(stack,'[');
            }else if(c=='}'){
                checkpop(stack,'{');
            }else{
                stack.push(c);
            }
        }

        if(stack.empty()){
          return 1;
        }

        return 0;
    }

    public void checkpop(Stack s,char c){

        if(!s.empty()&&(s.peek().equals(c))){
            s.pop();
        }
    }
}
