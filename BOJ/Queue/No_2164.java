package Algorithms.BOJ.Queue;

import java.io.*;
import java.util.*;

public class No_2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        Queue<Integer> que= new LinkedList<>();
        for(int i = 1 ;i<=N;i++){
            que.offer(i);
        }
        while(que.size()!=1){
            que.poll();
            que.offer(que.peek());
            que.poll();
        }
        bw.write(String.valueOf(que.peek()));
        bw.flush();
        bw.close();
    
    }
    
}

