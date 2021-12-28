package Algorithms.BOJ.Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class No_2869{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        bw.write(String.valueOf(func1(A, B, V)));
        bw.flush();
        bw.close();
    }
    public static int func1(int A, int B, int V){
        int day=(V-A)/(A-B);
        if((V-A)%(A-B)==0){
            return day+1;
            }
        else {
            return day+2;
        }
        
    }
}
