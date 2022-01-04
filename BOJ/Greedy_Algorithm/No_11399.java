package Algorithms.BOJ.Greedy_Algorithm;

import java.io.*;
import java.util.*;

public class No_11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        String str1 = br.readLine();
        StringTokenizer St = new StringTokenizer(str1," ");
        List<Integer> list = new ArrayList<>();
        int sum=0;
        for(int i=0; i<N;i++){    
            int A = Integer.parseInt(St.nextToken());
            list.add(A);
        }
        Collections.sort(list);
        for(int i = 0; i<N;i++){
            sum = sum + list.get(i)*(N-i);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    
    }  
          
    
        
}

