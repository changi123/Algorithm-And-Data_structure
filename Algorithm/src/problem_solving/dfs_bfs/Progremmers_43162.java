package problem_solving.dfs_bfs;

public class Progremmers_43162 {
	static boolean [] visited ;
	static int answer ;
	public static void main(String[] args) {
		int n = 3;
		int [][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		visited = new boolean[n];
		answer = 0 ; 
		for(int i = 0; i < n; i++) {
			
			if( !visited[i] ) {
				answer++;
				dfs(i , computers,n );
			}
			
		}
		System.out.println(answer);
	}
	
	public static void dfs(int node , int [][] computers, int n ) {
		visited[node] = true ; 
		
		for(int next  = 0  ; next < n ; next++ ) {
			if( computers[node][next] == 1 && !visited[next]) {
				dfs(next, computers, n);
			}
		}
		
	}

}

