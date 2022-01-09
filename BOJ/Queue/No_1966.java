import java.io.*;
import java.util.*;

public class No_1966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int N = Integer.valueOf(st.nextToken());
        
        for(int i = 0 ;i<N;i++){
            Queue<Integer> que= new LinkedList<>();
            int cnt=1;
            int Max=0;    // 큐에서 가장 큰 값
            int target=0; // B번째에 해당하는 값
            String str1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(str1," ");    
            int A = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st1.nextToken());
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2," ");
            for(int j = 0; j<A ;j++){
                int C = Integer.parseInt(st2.nextToken());
                if(B==j){//B번째 값을 target에 저장한다.
                    target=C; 
                }
                que.offer(C);
            }
            for(;!que.isEmpty();){ //큐의 크기가 0이 되면 반복문 탈출
                Max=FindMax(que);
                if(target==Max && B==0) break; //타겟 값이 최대값이고 B의 값이 0일때 for문 탈출
                if(que.peek()==Max) {
                    que.poll();
                    B--;
                    
                    cnt++;
                }
                else {
                    que.offer(que.peek());
                    if(B==0 && target!=Max){
                        B=que.size()-2; //que에 offer를 해줬기 때문에 que.size()의 값에서 2를 뺀다.
                        que.poll();
                        continue;
                    } 
                      que.poll();
                      B--;
                }
                      
            }
            bw.write(String.valueOf(cnt)+'\n');
        }
              
        bw.flush();
        bw.close();
    
    }
    public static int FindMax(Queue<Integer> que){
        int Max=0;
        for (int i = 0 ; i<que.size(); i++){
            if(Max<que.peek()) Max=que.peek();
            que.offer(que.peek());
            que.poll();
            
        }
        return Max;
    }    
}

