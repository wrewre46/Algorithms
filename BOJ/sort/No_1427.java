import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class No_1427{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N=Integer.parseInt(str);
        Integer[] arrNum = new Integer[str.length()];
        for (int i =0; i<str.length();i++){
            arrNum[i]=N%10;
            N=N/10;
        }
                
        Arrays.sort(arrNum,Collections.reverseOrder());
        for(int i=0; i<str.length();i++){
            bw.write(String.valueOf(arrNum[i]));
        }
        bw.flush();
        bw.close();
    
    }
}
