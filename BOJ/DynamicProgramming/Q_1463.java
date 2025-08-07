package backjun;
import java.util.*;
import java.io.*;
public class Q_1463 {
    public static void main(String[] args) throws Exception{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine());
        int N = Integer.valueOf(st.nextToken());
        int count = 0;
        while(N != 1){
            if(N % 3 != 0){
                N--;
                count++;
                continue;
            }

            if(N%3 == 0) {
                N = N/3;
                count++;
                continue;
            } else if(N%2 == 0){
                 N = N/2;
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
