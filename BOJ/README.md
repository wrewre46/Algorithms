백준 알고리즘 풀 때 참고사항
===========================
## Python
* 하나의 정수 입력 받는 경우
```python
import sys
N=int(sys.stdin.readline())
```
* 줄 단위로 숫자 입력 받아 리스트에 넣을 경우
```python
num_list=[]
num_list.append(int(input()))
```
* 공백 단위로 숫자 입력 받아 리스트에 넣을 경우
```python
import sys
num_list=list(map(int,sys.stdin.readline().split()))
```

## JAVA
### Stream
1. 파일 데이터
2. HTTP 응답 데이터
3. 키보드 입력

* 하나의 정수 입력 받는 경우
```java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
    }
}