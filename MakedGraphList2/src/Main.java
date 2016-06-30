/**
 * Created by Kyewon on 2016. 6. 30..
 *
 * 이전 MakedGraphList에서는 ArrayList와 Node로 표현했다면
 * 여기서는 노드와 그 노드의 배열로 표현해봄
 */
public class Main {
    public static void main(String[] args){

        AdjList adjList = new AdjList();

        adjList.addVertex(4); //갯수

        adjList.addEdge(0,1);
        adjList.addEdge(0,2);
        adjList.addEdge(1,0);
        adjList.addEdge(1,3);
        adjList.addEdge(2,0);
        adjList.addEdge(2,3);
        adjList.addEdge(3,1);
        adjList.addEdge(3,2);

        adjList.printAdjList();
    }
}
