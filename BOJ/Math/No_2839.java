import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class No_2839{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(func1(num)));
        bw.flush();
        bw.close();  
    }
    public static int func1(int a){
        int num1=0;
        while(a>0){
            if(a%5==0){
                num1=num1+a/5;
                return num1;
            }
            a-=3;
            num1++;
        }
        if(a!=0){
            return -1;
        }
        return num1;        
    }
}