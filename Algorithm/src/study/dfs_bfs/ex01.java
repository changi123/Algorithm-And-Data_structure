package study.dfs_bfs;

public class ex01 {

	public static void main(String[] args) {
		/*
		탐색이란 ? 
		ㄴ 많은 양의 데이터 중에서 원하는 데이터를 찾는 과정을 의미한다.

		자료구조란 ?
		ㄴ 데이터를 표현하고 관리하고 처리하기 위한 구조
			ㄴ 삽입 : 데이터를 삽입한다.
			ㄴ 삭제 : 데이터를 삭제한다.
		
		 
		스택
		ㄴ 박스 쌓기에 비유 할 수 있다
		ㄴ 아래에 있는 박스를 치우기 위해선 위에 박스부터 치워야한다 
			ㄴ 선입후출 구조 또는 후입선출 구조라고한다 (LIFO)
			
		큐
		ㄴ 대기 줄에 비유할 수 있다.
		ㄴ 우리가 아는 놀이공원에 줄과 같다고 생각하면 된다. 새치기는 없다!
			ㄴ 나중에 온 사람일수록 나중에 들어가기 때문에 흔히 공정한 자료구조라고 비유된다.
			ㄴ 이러한 구조를 선입선출 (FIFO) 라고 한다.
		
		재귀 함수
		ㄴ DFS와 BFS 를 구현하려면 재귀함수가 필수다!
		ㄴ 재귀 함수란 자기 자신을 다시 호출하는 함수를 의미한다.
		ㄴ 재귀 함수는 물제풀이에 사용할 때 반드시 재귀 함수가 언제 끝날지, 종료 조건을 꼭 명시해야 한다.
	
		탐색 알고리즘 DFS/BFS 
		ㄴ DFS (depth-First Search, 깊이 우선 탐색 이라고도 부르며, 그래프에서 깊은 부분을 우선적으로 탐색하는
		  알고리즘이다.
		ㄴ 인접 행렬 
			ㄴ 2차원 배열로 그래프의 연결 관계를 표현하는 방식
		ㄴ 인접 리스트
			ㄴ 리스트로 그래프의 연결 관계를 표현하는 방식
		
		DFS
		ㄴ DFS는 깊이 우선 탐색 알고리즘이다. 이 알고리즘은 특정한 경로로 탐색하다가 특정한 상황에서
		  최대한 깊숙이 들어가서 노드를 방문한 후, 다시 돌아가 다른 경로로 탐색하는 알고리즘이다.
		  
		ㄴ 구체적인 동작 방식
			(1) 탐색 시작 노드를 스택에 삽입하고 방문 처리를 한다 
				( 방문 처리란 ? 스택에 한 번 삽입되어 처리된 노드가 다시 삽입되지 않게 체크하는 것을 의미한다.
				  방문 처리를 함르로써 각 노드를 한 번씩만 처리할 수 있다)
			(2) 스택의 최상단 노드에 방문하지 않은 인접 노드가 있으면 그 인접 노드를 스택에 넣고 방문 처리를 한다.
			    방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼낸다.
			(3) 3,2 번의 과정을 더 이상 수행할 수 없을 때까지 반복한다.
			
			
		BFS (Breadth First Search)
		ㄴ 너비 우선 탐색이라는 의미를 가진다. 쉽게 말해 가까운 노드부터 탐색하는 알고리즘이다.
		
		ㄴ 구체적인 동작 방식
			(1) 탐색 시작 노드를 큐에 삽입하고 방문 처리를 한다.
			(2) 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고
				방문 처리를 한다
			(3) 2번의 과정을 더 이상 수행할 수 없을 때까지 반복한다.
			
			
		가장 간결한 해결방식
		DFS 
		ㄴ 스택
		ㄴ 재귀 함수 이용
		
		BFS 
		ㄴ 큐
		ㄴ 큐 자료구조 이용
		*/
	}

}