/**
 * Created by Kyewon on 2016. 6. 30..
 */
public class AdjList {

    GraphNode head[] = new GraphNode[10]; //배열형태의 노드
    int numOfVertex;

    /**
     * 정점 추가
     */
    public void addVertex(int num){
        for(int i = 0; i < num; i ++){
            numOfVertex++;
        }
    }

    /**
     * (u, v) 정점을 잇는 간선 추가
     * 추가할때마다 GraphNode 동적할당
     */
    public void addEdge(int u, int v){
        if(u >= numOfVertex || v >= numOfVertex){
            System.out.println("그래프의 범위를 벗어남");
        }
        GraphNode graphNode = new GraphNode();
        graphNode.vertex = v;
        graphNode.link = head[u];
        head[u] = graphNode;
    }

    public void printAdjList(){
        GraphNode gNode;
        for(int i = 0; i < numOfVertex; i ++){
            System.out.printf("\n 정점 %c의 인접리스트", i + 65); //문자로 변환해서 출력
            gNode = head[i];
            while(gNode != null){
                System.out.printf("-> %c", gNode.vertex + 65);
                gNode = gNode.link;
            }
        }
    }
}
