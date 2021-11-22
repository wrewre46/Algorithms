import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class No_1436{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N=Integer.parseInt(str);
        bw.write(String.valueOf(func(N)));
        bw.flush();
        bw.close();
    
    }
    public static int func(int N){
        int[] arr = new int[10000];
        String a="666";
        int i =0;
        int j=666;
        while(i!=10000){
            String str=Integer.toString(j);
            if(str.indexOf(a)>=0){ //j를 문자열로 변환했을 때 그 문자열에 666이 들어있는지 판별하는 조건문
                arr[i]=j;
                i++;                    
            }
            j++;           
        }
        return arr[N-1];        
    }
}
