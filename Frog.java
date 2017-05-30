
import java.util.HashMap;

public class Frog {

	public static void main(String[] args) {
		
		
		int[] A = {1,3,1,4,2,3,5,4};
		System.out.println(solution(5,A));
	}
	

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //해쉬맵을 써볼까? 잎이 내린 자리를 key로, 그 갯수를 value로.
        
        for(int i=0;i<A.length;i++){
            
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i]));
            }else{
                map.put(A[i],1);
            }
           
        }
        
        //map에 배열을 옮긴다.
        
        
        for(int i=1;i<=X ;i++){
            if(!map.containsKey(i))
                return -1; 
        }
        //1부터 X번까지 한번이라도 자리가 없으면 그냥 -1를 리턴해야. 즉 1 3 4 5면 2가 없어서 못건넘.
        
        for(int i=0;i<A.length;i++){
            if(A[i]==map.keySet().size()){
                return i;
            }
        }
        
        // 마지막으로 map에 저장된 녀석이 ..헉 이러면 안되는뎅 keySet중에 x보다 작고..그럴때인줄. 
           
        
        // with X, we need from 1 ~ X-1 before X need to be satisfied
        
        return -1;
    }

}
