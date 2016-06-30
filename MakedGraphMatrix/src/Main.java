/**
 * Created by Kyewon on 2016. 6. 30..
 *
 * 인접행렬로 구현한 그래프
 */
public class Main {
    public static void main(String[] args){
        Graph graph = new Graph(4,4);

        graph.addVertex(4); //갯수

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,0);
        graph.addEdge(1,3);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(3,2);

        graph.printGraphMatrix();

    }
}
