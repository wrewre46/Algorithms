import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class No_1011{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(func1(a,b))+'\n');
        }
        bw.flush();
        bw.close();  
    }
    public static int func1(int a, int b){
        int distance=b-a;
        double max = Math.round(Math.sqrt(distance));

        if (distance > Math.pow(max, 2)) {
            return (int)max * 2;
        } else {
            return (int)max * 2 - 1;
        }
    }
}