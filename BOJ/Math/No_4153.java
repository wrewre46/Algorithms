import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class No_4153{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        if(A==0&B==0&C==0){break;}
        bw.write(String.valueOf(func1(A,B,C))+'\n');
        bw.flush();
    }       
    bw.close();
    
    }
    public static String func1(int A, int B, int C){
       
        if(A*A+B*B==C*C){
            return "right";
            }
        else if(B*B+C*C==A*A){
            return "right";
        }
        else if(C*C+A*A==B*B){
            return "right";
        }
        else {
            return "wrong";
        }
        
    }
}
