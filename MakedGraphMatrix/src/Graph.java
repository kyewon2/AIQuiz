/**
 * Created by Kyewon on 2016. 6. 30..
 */
public class Graph {

    int[][] adjMatrix;
    int numOfVertex; //정점 갯 수

    public Graph(int rowVertex, int columnVertex){
        adjMatrix = new int[rowVertex][columnVertex];

        for(int i = 0; i < rowVertex; i++){
            for(int j = 0; j < columnVertex; j++){
                adjMatrix[i][j] = 0;
            }
        }
    }

    /**
     * 배열에 정점 추가
     */
    public void addVertex(int num){

        for(int i = 0; i < num; i ++){
            numOfVertex ++;
        }
        System.out.println("정점의 갯수 : "+numOfVertex);
    }

    /**
     * (u, v) 정점을 잇는 간선 추가
     * 간선이 이어지면 행렬의 값 = 1
     */
    public void addEdge(int u ,int v){
        //행렬의 범위를 벗어나면
        if(u >= numOfVertex || v >= numOfVertex || u < 0 || v < 0){ //u,v는 0부터 시작
            System.out.println("그래프의 정점의 범위를 벗어남");
            return;
        }
        adjMatrix[u][v] = 1;
    }

    public void printGraphMatrix(){
        for(int i = 0; i < numOfVertex; i++){
            for(int j = 0; j < numOfVertex; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
