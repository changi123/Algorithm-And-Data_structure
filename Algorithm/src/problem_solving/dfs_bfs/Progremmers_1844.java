package problem_solving.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Progremmers_1844 {
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		
		int [][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int n = maps.length;
		int m = maps[0].length;
		int [][] visited = new int[n][m] ;
		
		Queue<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {0,0});
		
		visited[0][0] = 1;;
		
		while(!q.isEmpty()) {
			int[] current = q.poll();
			
			int x = current[0];
			int y = current[1];
			
			
			for(int i = 0 ; i < 4 ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if( nx >= 0 && ny>= 0 && nx < n && ny < m) {
					if( maps[nx][ny] == 1 && visited[nx][ny] == 0 ) {
						visited[nx][ny] = visited[x][y] +1 ; 
						q.offer(new int[]{nx, ny});
					}
					
					
				}
			}
			
			
		}
		int answer = visited[n-1][m-1];
		
		System.out.println(answer == 0? -1 :answer);
		
		
	}
	

}

