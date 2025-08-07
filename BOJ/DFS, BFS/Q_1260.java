import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Q_2460{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        int V = Integer.valueOf(st.nextToken());
        
        boolean[] visited = new boolean[N+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> vertex = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 0 ; i<=N; i++){
            vertex = new ArrayList<Integer>();
            vertex.add(0);
            graph.add(vertex);
        }
        

        for(int i = 0 ; i<M; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());  
            int node1 = Integer.valueOf(st1.nextToken()); 
            int node2 = Integer.valueOf(st1.nextToken()); 
            //
            vertex = graph.get(node1);
            vertex.add(node2);
            graph.set(node1, vertex);
            //
            vertex = graph.get(node2);
            vertex.add(node1);
            graph.set(node2, vertex);
            
        }
        for(int i = 1; i<graph.size(); i++){
            Collections.sort(graph.get(i));
        }

        dfs(V, visited, graph); 
        System.out.println();
        //visited 초기화
        Arrays.fill(visited, false);
        bfs(V, visited, graph, queue); 
        return;
    }
    public static void dfs(int x, boolean[] visited, ArrayList<ArrayList<Integer>> graph){
        visited[x] = true;
        System.out.print(x + " ");
        for(int i = 1 ;i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y, visited, graph);
        }

    }
    public static void bfs(int x, boolean[] visited, ArrayList<ArrayList<Integer>> graph, Queue<Integer> queue){
        visited[x] = true;
        queue.offer(x);
        visited[x] = true;
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for(int i = 1 ; i<graph.get(vertex).size(); i++){
                int y = graph.get(vertex).get(i);
                if(!visited[y]){
                    queue.offer(y);
                    visited[y]=true;
                }
            }
            
        }
        

    }
}