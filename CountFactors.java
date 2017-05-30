class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int factorNum =0; 
       
        int i=1;
        for(i=1;i*i<N;i++){
            if(N%i==0)
                factorNum++;
        }
        if(i*i==N){
            factorNum = factorNum*2 +1;
        }else{
            factorNum = factorNum*2;
        }
        
    return factorNum;
    }
}