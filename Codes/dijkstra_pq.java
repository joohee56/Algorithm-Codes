public class DijkstraTest2_PQ {
	
	static class Vertex implements Comparable<Vertex>{
		int no, minDistance;	// 정점번호, 출발지에서 자신으로의 최소비용

		public Vertex(int no, int minDistance) {
			super();
			this.no = no;
			this.minDistance = minDistance;
		}

		@Override
		public int compareTo(Vertex o) {
			return this.minDistance - o.minDistance;		// 크기가 작은 게 우선
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(in.readLine());
		
		int[][] adjMatrix = new int[V][V];
		int start = 0;
		
		StringTokenizer st = null;
		for(int i=0; i<V; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for(int j=0; j<V; j++) {
				adjMatrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] distance = new int[V]; // 출발지에서 자신으로 오는 최소비용
		boolean[] visited = new boolean[V]; 	// 최소비용 확정 여부
		PriorityQueue<Vertex> pQueue = new PriorityQueue<Vertex>();
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[start] = 0;		// 시작점 0으로
		pQueue.offer(new Vertex(start, distance[start]));
		
		while(!pQueue.isEmpty()){
			// 단계 1 : 최소비용이 확정되지 않은 정점 중 최소비용의 정점 선택
			Vertex current = pQueue.poll();
			if(visited[current.no]) continue;
			
			visited[current.no] = true;
			
			// 단계 2 : 선택된 정점을 경유지로 하여 아직 최소비용이 확정되지 않은 다른 정점의 최소비용을 고려
			for(int j=0; j<V; j++) {
				if(!visited[j] && adjMatrix[current.no][j] != 0 && distance[j] > distance[current.no] + adjMatrix[current.no][j]) {
					distance[j] = distance[current.no] + adjMatrix[current.no][j];
					pQueue.offer(new Vertex(j, distance[j]));
				}
			}
		}
		
		System.out.println(Arrays.toString(distance));
		in.close();
	}
}
