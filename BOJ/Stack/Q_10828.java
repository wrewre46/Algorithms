package backjun;
import java.util.*;
import java.io.*;
public class Q_10828 {
    public static void main(String[] args) throws Exception{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.valueOf(bw.readLine());

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(bw.readLine(), " ");
            String method = st.nextToken();

            if(method.equals("push")){
                int value = Integer.valueOf(st.nextToken());
                stack.push(value);
            } else if(method.equals("pop")){
                if(stack.size() < 1) System.out.println(-1);
                else {
                    System.out.println(stack.pop());
                }
            } else if(method.equals("size")){
                System.out.println(stack.size());
            } else if(method.equals("empty")){
                if(stack.size()<1) System.out.println(1);
                else System.out.println(0);
            } else if(method.equals("top")){
                if(stack.size() < 1) System.out.println(-1);
                else {
                    System.out.println(stack.peek());
                }
            } 
        }
    }
}
