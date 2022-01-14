package Algorithms.BOJ.Queue;

import java.io.*;
import java.util.*;

public class No_11866{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        Queue<Integer> que= new LinkedList<>();
        for(int i = 1 ;i<=N;i++){
            que.offer(i);
        }
        bw.write("<");
        while(que.size()!=1){
            for(int i=1; i<K ;i++){
                que.offer(que.peek());
                que.poll();
            }
            bw.write(String.valueOf(que.peek())+", ");
            que.poll();
        }
        bw.write(String.valueOf(que.peek())+">");
        bw.flush();
        bw.close();
    
    }
    
}

