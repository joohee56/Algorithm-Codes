# 🗂️ Algorithm-Codes
알고리즘 기초 코드 저장소입니다.
</br>
</br>
</br>

## Sorting
※ 값이 같은 원소의 전후관계가 바뀌지 않는 정렬 알고리즘을 안정 정렬(stable sort)이라고 합니다.
* Insertion Sort(삽입 정렬) - O(n^2), stable
* Bubble Sort(거품 정렬) - O(n^2), stable
* Quick Sort(퀵 정렬) - unstable
  * Java Sort Library
    * Arrays.sort
    * [Collections.sort](/Codes/collections_sort.md)
* [Merge Sort(병합 정렬)](/Codes/mergeSort.md) - O(nlogn), unstable
* Heap Sort (힙 정렬) - O(nlogn)
* Topological Sort (위상 정렬)
* Selection Sort (선택 정렬) - unstable
* Counting Sort (계수 정렬)
* [객체 정렬(Comparable, Comparator)](/Codes/objectSort.md)
</br>
</br>

## Probability Theory
* Permutation(순열)
  * [Array](Codes/perm.java)
  * [Bit](Codes/permuation_flag.java)
  * [NextPermuation](Codes/permuNP.java) 
* Combination(조합)
   * [Array](Codes/combi.java)  
   * [NextPermutation](Codes/combiNP.java) 
* Subset(부분 집합)
   * [Array](Codes/subSet.java)
   * [Bit](Codes/subSet_bit.java)
   * [SubSetSum](Codes/subSetSum.java)
   * [SubSetSum-Backtracking](Codes/subSetSum_back.java) 
* [중복 순열, 순열, 중복 조합, 조합](Codes/diceTest.java)
</br>
</br>

## Recursive (Backtracking) 🌟
* [Hanoi](Codes/hanoi.md)
* [NQueenBackTracking](Codes/nqueenback.java)
</br>
</br>

## Searching
* BFS 🌟
  * [Queue](Codes/bfs.md)
* DFS 🌟
  * [재귀](Codes/dfs_recur.md)
  * Stack
  * 반복문
* [Binary Search(이분 탐색)](Codes/binarysearch.java) 🌟
  * [LIS (가장 긴 증가하는 부분 수열)](/Codes/LIS.md)
* [Parametric Search(매개변수 탐색)](Codes/parametricSearch.md) 🌟
</br>
</br>

## Data Structure
* [Heap(P.Q)](/Codes/priorityQueue.md) 🌟
* [Segment Tree](Codes/segmentTree.md) ⭐
* [Stack(Node)](Codes/stack.java)
* [Queue(Node)](Codes/queue.java)
* [Map](Codes/map.md)
* [Set](Codes/set.md)
</br>
</br>

## Graph
### MST
* [Kruskal (union-find)](Codes/kruskal.java) 🌟
* [Prim](Codes/prim.java)
  * [P.Q](Codes/prim_pq.java)

### Shortest Path (최단경로)
* Dijkstra
  * [adjList](Codes/dijkstra_adjList.java) 
  * [adjMatrix](Codes/dijkstra_adjMatrix.java)
  * [adjMatrix - P.Q](Codes/dijkstra_pq.java) 🌟
  * [adjMatrix(Node) - P.Q](Codes/dijkstra_node_pq.java) 🌟
* [Bellman-Ford](Codes/bellmanford.java)
* [Floyd-warhsall](Codes/floyd.java) 🌟
</br>
</br>

## Greedy 🌟
</br>
</br>

## DP ⭐
* [0-1 Knapsack Problem](Codes/zerooneknapsack.java)
* [LIS(Longest Increasing Subsequence)](Codes/lis.java)
  * [Longest Bitonic Subsequence](Codes/LBS.md)
* LCS(Longest Common Subsequence)
* [Fibonacci-Top-Bottom](Codes/fibonacci.java)
* [Fibonacci-Bottom-Up](Codes/fibonacci2.java)
* [MinCoinChange](Codes/minCoinChange.java)
</br>
</br>

## String
* [KMP](Codes/kmp.java)
* Rabin-Karp
* [Trie](Codes/trie.md) ⭐
</br>
</br>

## Number Theory
* [Sieve of Eratosthenes(에라토스테네스의 체(소수판별))](Codes/Eratosthenes.java)
* [Euclidean algorithm(유클리드 호제법(최대 공약수, 최소 공배수))](Codes/Euclidean.md)
</br>
</br>

## Devide and Conquer
* [SquareNumberDivideTest](Codes/divideTest.java)
</br>
</br>

## Miscellaenous
* [Sliding Window](Codes/slidingWindow.md) 🌟
* [Two Pointer](Codes/twoPointer.md) 🌟
* Hash 🌟
* [Flood fill(seed fill)](Codes/floodFill.md)🌟
* [Prefix Sum (누적 합 / 구간 합)](Codes/prefixSum.md)
</br>
</br>
