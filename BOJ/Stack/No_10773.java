package Algorithms.BOJ.Stack;
import java.io.*;
import java.util.*;
public class No_10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int sum=0;
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i<N; i++){
            String str1 = br.readLine();
            int num=Integer.valueOf(str1);
            if(num==0){
                st.pop();
            }
            else{
                st.push(num);
            }
        }
        System.out.println(st);
        while(st.size()!=0){
            sum+=st.peek();
            st.pop();
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    
    }  
        
}

