import java.util.ArrayList;

/**
 * Created by Kyewon on 2016. 6. 29..
 * 인접리스트로 구현한 그래프
 */
public class Main {

    static ArrayList<Node> graphList;
    
    public static void main(String args[]){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        Graph graph = new Graph();
        graphList = graph.createGraph(); //graphList 생성

        graph.addVertex(graphList,a);
        graph.addVertex(graphList,b);
        graph.addVertex(graphList,c);
        graph.addVertex(graphList,d);
        graph.addVertex(graphList,e);

        graph.addEdge(a,graph.createEdge(a,b));
        graph.addEdge(a,graph.createEdge(a,c));
        graph.addEdge(c,graph.createEdge(c,d));
        graph.addEdge(d,graph.createEdge(d,e));

    }
}
