import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Kyewon on 2016. 6. 29..
 */
public class Graph {

    public Graph(){}
    //그래프 생성
    public ArrayList<Node> createGraph(){
        ArrayList<Node> arrayList = new ArrayList<>();
        return arrayList;
    }

    //그래프에 정점 추가
    public void addVertex(ArrayList<Node> arrayList, Node node){
        arrayList.add(node);
    }

    //그래프에 간선 추가
    public Node createEdge(Node fromV, Node toV){
        Node newNode = new Node();
        newNode.setNumV(fromV.getNumV());
        newNode.setNumE(toV);
        return newNode;
    }

    //그래프의 정점들 사이 간선 잇기
    public void addEdge(Node fromV, Node createEdge){

        if(fromV.getNumE() == null) {
            fromV.setNumE(createEdge.getNumE());//fromV -> toV를 가리킴
            createEdge.setNumE(fromV); //toV -> fromV를 가리킴
            System.out.println(fromV.getNumV()+ "에 연결된 정점 " + fromV.getNumE().getNumV());

        }else{
            fromV.getNumE().setNumE(createEdge.getNumE()); //그 다음 노드에 이어서 추가
            createEdge.setNumE(fromV);
            System.out.println(fromV.getNumV()+ "에 연결된 정점 " + fromV.getNumE().getNumE().getNumV());

        }

    }

}
