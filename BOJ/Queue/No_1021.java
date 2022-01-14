package Algorithms.BOJ.Queue;

import java.io.*;
import java.util.*;

public class No_1021 {
    static int count =0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        List<Integer> list = new LinkedList<>();
        
        Deque<Integer> deq= new ArrayDeque<>(N);
        for(int i = 0 ;i<N;i++){
            deq.add(i+1);
        }
        String str1=br.readLine();
        StringTokenizer st1=new StringTokenizer(str1," ");
        for(int i = 0 ;i<M;i++){
            int A = Integer.valueOf(st1.nextToken());
            list.add(A);
        }
        
        while(!list.isEmpty()){
            int index=0;
            Iterator<Integer> iter = deq.iterator();
            while(iter.hasNext()) {
                if(iter.next()==list.get(0)) break;
                else index++;       
                
            }
            if(index<=(deq.size()/2)){
                while(deq.peek()!=list.get(0)){
                     Left(deq);
                }
                deq.removeFirst();
                list.remove(0);
            }
            else{
                while(deq.peek()!=list.get(0)){
                    Right(deq);
                }
                deq.removeFirst();
                list.remove(0);
            }  
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    
    }
    public static void Left(Deque deq){
        deq.addLast(deq.getFirst());
        deq.removeFirst();
        count++;        
    }
    public static void Right(Deque deq){
        deq.addFirst(deq.getLast()); 
        deq.removeLast();
        count++;        
    }
    
}

