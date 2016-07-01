/**
 * Created by Kyewon on 2016. 7. 1..
 *
 * 인접행렬에서 방문여부를 체크 한다
 */
public class DFS {
    int[][] completeAdjMatrix; //완성된 그래프 행렬
    int numOfVertex; //정점 갯수
    boolean[] isCheckedVisit =new boolean[30]; //방문 여부 체크

    public DFS(int[][] completeAdjMatrix, int numOfVertex){
        this.completeAdjMatrix = completeAdjMatrix;
        this.numOfVertex = numOfVertex;
    }

    /**
     * DFS 알고리즘
     */
    public void dfsRecusive(int start){
        isCheckedVisit[start] = true; //해당 정점의 방문을 기록한다

        for(int j = 0; j < numOfVertex; j ++){
            if(completeAdjMatrix[start][j] == 1 && !isCheckedVisit[j]){ //정점 visitVertex와 정점 j가 연결 되었고, 정점 j의 방문 한적이 없다면
                System.out.printf("%c에서 %c로 이동 \n", start + 65, j + 65);
                dfsRecusive(j);
            }

        }
    }
}
