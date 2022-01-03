package Algorithms.BOJ.Stack;

import java.io.*;
import java.util.*;

public class No_17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        String str1 = br.readLine();
        StringTokenizer St = new StringTokenizer(str1," ");
        int[] list = new int[N];
        int[] ans = new int[N];
        for(int i=0; i<N;i++){    
            int A = Integer.parseInt(St.nextToken());
            list[i]=A;
        }
        NGE(list,ans);        
        for(int i =0; i<N; i++){
            bw.write(String.valueOf(ans[i])+" ");
        }
        bw.flush();
        bw.close();
    
    }  
    public static void NGE(int[] num,int[] ans){
        Stack<Integer> stack=new Stack<>();
        for(int i =num.length-1; i>=0; i--){ //배열 마지막부터 실행
           
            while(!stack.isEmpty()&&stack.peek()<=num[i]){// 배열의 특정 원소보다 스택의 peek()의 값이 작으면 삭제
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=-1; //배열의 마지막 원소는 항상 답이 -1 이므로 처음 반복문을 돌면 이 조건문에 의해서 -1이 저장된다.
            else ans[i]=stack.peek();

            stack.push(num[i]);
           
        }        
    }
        
}

