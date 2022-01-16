package Algorithms.BOJ.Math;

import java.io.*;
import java.util.*;
public class No_1929{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[N+1];
        arr[0]=true;
        arr[1]=true;
        for(int i =2; i*i<=N ; i++){
           for(int j = i*i; j<N+1;j+=i) arr[j]=true;
        }
        for(int i = M;i<N+1;i++){
            if(arr[i]==false) bw.write(String.valueOf(i)+'\n');
        }
        bw.flush();
        bw.close();
    }    
}
