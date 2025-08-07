package backjun;
import java.io.*;
import java.util.*;
public class Q_3003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[6];
        int[] chess = {1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i = 0 ; i < 6 ; i++){            
            arr[i] = Integer.valueOf(st.nextToken());
        }
        
        for(int i = 0 ; i < 6 ; i++){
            System.out.print(chess[i]-arr[i]+" ");
        }
        
    }
}
