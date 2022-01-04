package Algorithms.BOJ.Greedy_Algorithm;

import java.io.*;
import java.util.*;

public class No_13305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        List<Long> distance = new ArrayList<>();
        List<Long> money = new ArrayList<>();
        String str1 = br.readLine();
        StringTokenizer St1 = new StringTokenizer(str1," ");
        String str2 = br.readLine();
        StringTokenizer St2 = new StringTokenizer(str2," ");
        Long sum=0l;
        for(int i=0; i<N-1;i++){    
            Long A = Long.parseLong(St1.nextToken());
            distance.add(A);
        }
        for(int i=0; i<N;i++){    
            Long B = Long.parseLong(St2.nextToken());
            money.add(B);
        }
        int j=0 ;
        int i=1 ;
        Long Money=money.get(0);
        while(i<N-1){
            if(Money>money.get(i)){
                while(j<i){
                sum+=Money*distance.get(j);
                j++;
                }
                j=i;
                Money = money.get(i);
                
            }
            i++;
                
        }
        while(j<N-1){
            sum+= Money*distance.get(j);
            j++;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    
    }        
}

