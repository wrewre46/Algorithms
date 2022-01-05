package Algorithms.BOJ.DynamicProgramming;

import java.io.*;
import java.util.*;

public class No_1932 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int[][] arr = new int[N][N]; //기존 데이터를 받는 배열
        int[][] PathSum = new int[N][N]; // 경로의 합을 저장하는 배열
        for(int i=0; i<N ; i++ ){
            String str1=br.readLine();
            StringTokenizer st1 = new StringTokenizer(str1," ");
            for(int j =0; st1.hasMoreTokens(); j++){
                int A = Integer.valueOf(st1.nextToken());
                arr[i][j]=A;
            }            
        }
        int Sum=FindMax(arr,PathSum,N);
        bw.write(String.valueOf(Sum));
        bw.flush();
        bw.close();
    
    }
    public static int FindMax(int[][] arr, int[][] Hap, int N){ // 위에서 아래로 내려가면서 길의 합을 구하는 함수
        Hap[0][0]=arr[0][0]; 
        for(int i =1; i<N; i++){
            for(int j =1; j<i+1; j++){
                Hap[i][j]=Math.max(Hap[i-1][j-1]+arr[i][j], Hap[i-1][j]+arr[i][j]); // 전 단계에서 왼쪽방향과 오른쪽 방향의 합 중에 큰것을 선택한다.
                Hap[i][0]=Hap[i-1][0]+arr[i][0]; // 맨 왼쪽길만 선택하는 것은 1가지 방법이므로 초기화
            }
        }
        int max =Hap[N-1][0];
        //최댓값을 구하는 반복문
        for (int n=0; n<N; n++){
            if(max<Hap[N-1][n]){
                max=Hap[N-1][n];
            }
        }
        return max;
    }        
}

