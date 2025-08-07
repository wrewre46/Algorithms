import java.io.*;
import java.util.*;
public class Q_2468 {
    static int mx, my, N, count;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int result;
    static int[][] graph;
    static boolean[][] visited ;    
    static ArrayList<Integer> list;

    public static void main(String[] args) throws Exception{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = new StringTokenizer(bw.readLine());

        N = Integer.parseInt(st.nextToken());

        
        graph = new int[N][N];
        list = new ArrayList<>();
        
        for(int i = 0 ; i<N ; i++){
            st = new StringTokenizer(bw.readLine(), " ");
            for(int j = 0; j<N ; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());                
                if(!list.contains(graph[i][j])){
                    list.add(graph[i][j]);                    
                }
            }
        }
        System.out.println("N : " + N);
        result = 1;
        for(Integer height : list){
            count = 0;
            visited =  new boolean[N][N];
            for(int i = 0 ; i < N ; i++){
                for(int j=0 ; j < N ; j++){
                    if(!visited[i][j] && graph[i][j] >= height){
                        count++;
                        dfs(height, i ,j);
                    }
                }
            }
            result = Math.max(result, count);
            System.out.println(result);
        }
        System.out.println(result);

    }

    static void dfs(int height, int x, int y){        
        visited[x][y] = true;
        for(int i = 0 ; i<4; i++){
            mx = x + dx[i];
            my = y + dy[i];
            if (mx >=0 && my >=0 && mx < N && my <N){
                if(!visited[mx][my]){
                    if(graph[mx][my] >= height){
                        dfs(height, mx, my);
                    }
                }
            }
        }
    }

}
