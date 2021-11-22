import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class No_7568{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N=Integer.parseInt(str);
        int[][] arr=new int[N][2];
        for(int i=0; i<N;i++){
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        arr[i][0]=A;
        arr[i][1]=B;
        }
        int[] arr2= func(arr,N);
        for (int i =0; i<N;i++){
            bw.write(String.valueOf(arr2[i])+' ');
        }
        bw.flush();
        bw.close();
    
    }
    public static int[] func(int[][] arr, int N){
        
        int[] rank_arr= new int [N];
        for (int i=0 ; i<N;i++){
            int rank=1;
            for(int j =0; j<N;j++){
            if(arr[i][0]<arr[j][0] & arr[i][1]<arr[j][1]){
                rank++;
            }
            }
            rank_arr[i]=rank;
        }
        return rank_arr;        
    }
}
