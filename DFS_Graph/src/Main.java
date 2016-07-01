/**
 * Created by Kyewon on 2016. 7. 1..
 *
 * 인접행렬과 배열로 구현한 DFS 이며
 * 방문여부 체크에 목적이 있습니다.
 */
public class Main {
    public static void main(String[] args){
        Graph graph = new Graph(6,6);

        graph.addVertex(6); //갯수

        graph.addEdge(0,2);
        graph.addEdge(0,5);
        graph.addEdge(1,5);
        graph.addEdge(1,4);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,2);
        graph.addEdge(3,1);
        graph.addEdge(4,1);
        graph.addEdge(5,0);
        graph.addEdge(5,1);

        //graph.printGraphMatrix();

        DFS dfs = new DFS(graph.returnAdjMatrix(), 6);
        dfs.dfsRecusive(0);

    }
}
