package Algorithms.BOJ.Stack;

import java.io.*;
import java.util.*;

public class No_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        for (int i =0 ; i<N;i++){
            char[] list = br.readLine().toCharArray();
            bw.write(VPS(list)+'\n');
        }
        
        bw.flush();
        bw.close();
    
    }  
    public static String VPS(char[] ch){
        Stack<Character> stack=new Stack<>();
        for(int i =0 ; i<ch.length;i++){
            if(ch[i]=='('){
                stack.push(ch[i]);
            }
            else{
                if(stack.isEmpty())
                     return "NO";
                else stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else return "NO";
    }
        
}

