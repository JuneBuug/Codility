# Solution_info

### BinaryGap
* 20170515
* 정확도 80%의 코드 (뭔가 잘못된게 있는듯)
* 문제 설명: 십진법 자연수를 이진수로 만들면 연속된 0이 나올수도 있고 아닐수도 있다. 주어진 자연수 N을 넣으면,  0이 연속된 수 중 가장 큰 수를 반환. 연속된 0이 없으면 0을 반환.
즉, 8 = 1000(2) 인데 이럴때는 3을 반환. 6= 11(2)인데 이럴땐 0을 반환.

### OddOccurrencesInArray
* 20170515
* 정확도 80% 퍼포먼스 25% (…) 생각보다 오래걸렸는데 이중 포문을 써서 복잡도가 O(n^2)이 되어버렸다.
* 문제 설명: 홀수개의 요소를 가진 배열이 있다. 같은 수를 가지면 짝지어질수있도록 배열을 준다. 그러나 홀수니까 짝지어지지 못하는 놈이 하나 나오겠지? 그 녀석의 값을 반환하는 문제다.
흑흐긓그흐긓그ㅡㅎ그 나놈…효율성 떨어지는놈..
[Codility – OddOccurrencesInArray 문제 풀이 (난이도 : 하) | 아브의 꿀오분](http://abh0518.net/tok/?p=539)
를 참고해서 HashMap을 공부해보자.

### CyclicRotation
* 20170516
* 솔직히 OddOccurencesInArray하면서 답을 봐버림…
* 문제 설명 : 배열을 오른쪽으로 하나씩 옮긴다. 맨 오른쪽의 것은 맨앞으로 하는 식으로 순환되는 규칙을 만든다. 이 규칙을 K번 반복했을때의 배열을 반환하는 문제다.
* 주어진 배열 A에 대해서, A.length 번째 마다 똑같은 답이 나오는 문제이므로 %를 활용하면 되는 문제.

###  CountFactors
* 20170531
* 약수 갯수 구하기. 일반적으로 나눠떨어지는거 카운트하면 되겠지만, sqrt(N) 되도록하라고해서. 그래도 Integer.maxValue()에 대해서 timeout떴다ㅠㅠ


###  FrogRiverOne
* 20170531
* 생각을 잘못해서 27%... 테스트 케이스만 통과해버림.
* Hashmap을 사용해는데 마지막에 잘했다고 생각한게 아니었음.

### Distinct
* 20170531
* Hashmap은 이런거에 최고라는 생각이 든다. 처음으로 100/100


### CountDiv
* 20170601
* 주어진 수 [a,b] 의 닫힌 구간 사이에 일정한 수 K로 나눠지는 수가 몇 개 있는지 구하는 문제. Worst Time Complexity 요구 사항이 O(1) 이어서 고민을 많이 했었다.
* 틀린 이유: 극히 일부의 테스트 케이스에 대해서 성급하게 일반화 시켜서 리턴해서.
* CountDiv .... 케이스 나누자  25/ 75  -> 100


###  MinPerimeterRectangle
* 20170601
* 약수들을 다 구하고, 제곱수인 경우 약수까지 구해야함.
* 루트 N 시간 복잡도 주어지면 이제 포문 돌릴줄알겠다. 100/100


### Brackets
* 20170604
* {}, [], ()  들로만 이루어진 문자열이 있다. 여는 괄호가 나오면 닫히는 괄호가 꼭 나와야하고 짝이 맞아야함. 이걸 properly nested라고하자. p.n이면 1을 리턴하고, 아니면 0 을 리턴
* 100 / 100 . 사실 답을 슬쩍 본거라ㅠㅠ 스택을 사용하면 쉽게 풀 수 있다. {,[,( 의 경우에는 push하고, 반대의 경우에는 pop해서 현재랑 짝이 맞는지 비교.


### Nesting
* 20170604
* () 로 하는 것만 다를뿐 Brackets와 완벽히 같은 문제
* 100 / 100   


### Maxprofit
* 20170604
* 주식의 가격이 배열로 저장되어있다. 최저점에서 사고 최고점에서 살 때 얻을 수 있는 이득은 A[max] - A[min] 이다. 최대로 얻을 수 있는 이득을 구하고 이득을 얻을 수 없을땐 0을 리턴하라
* 결국 루프를 돌면서 현재 값의 전 값들에서 min을 구하고, 현재값- min 한 값들 중 max를 구하면 된다고 생각했다. 
