package Algorithms.BOJ.sort;

import java.io.*;
import java.util.*;
class StrComparator implements Comparator<String>{
   
    @Override
    public int compare(String o1, String o2) {
        if(o1.length()==o2.length()){
            return o1.compareTo(o2);
        }
        else {
            return o1.length()-o2.length();
        }
    }

    }

public class No_1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        Set<String> tree= new TreeSet<>(new StrComparator());
        for(int i=0; i<N;i++){
            String str1 = br.readLine();
            tree.add(str1);
        }
        for(String s : tree){
            bw.write(s.toString()+'\n');
        }
        
        bw.flush();
        bw.close();
    
    }  
        
}
