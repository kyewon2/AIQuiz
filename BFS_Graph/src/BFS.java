import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kyewon on 2016. 7. 2..
 *
 * 인접행렬에서 큐에 저장 후 방문기록을 체크한다
 *
 * 1.시작 노드에서 방문 가능한 모든 노드를 찾는다
 * 2.찾은 노드들을 큐에 저장한다
 * 3.큐에서 노드 하나를 꺼내서 방문여부를 체크한다
 * 4.다시 그 노드가 방문 가능한 모든 노드를 찾는다. (1,2,3)반복
 */
public class BFS {
    int[][] completeAdjMatrix; //완성된 그래프 행렬
    int numOfVertex; //정점 갯수
    boolean[] isCheckedVisit =new boolean[30]; //방문 여부 체크
    Queue<Integer> queue = new LinkedList<Integer>();

    public BFS(int[][] completeAdjMatrix, int numOfVertex){
        this.completeAdjMatrix = completeAdjMatrix;
        this.numOfVertex = numOfVertex;
    }

    public void bfsRecusive(int start){
        isCheckedVisit[start] = true; //방문 여부를 체크
        if(isCheckedVisit[start]){
            System.out.printf("%c에 방문 \n", start + 65);
        }

        for(int j = 0; j < numOfVertex; j++){
            if(completeAdjMatrix[start][j] == 1 && !isCheckedVisit[j]){ //정점 visitVertex와 정점 j가 연결 되었고, 정점 j의 방문 한적이 없다면
                queue.offer(j); //방문 가능한 모든 노드를 큐에 저장
                isCheckedVisit[j] = true; //한번 큐에 넣었던 노드는 다시 넣지 않는다
            }
        }
        if(!queue.isEmpty()){
            start = queue.poll(); //큐에서 맨 앞의 데이터를 가져온다
            //System.out.printf("%c을 큐에서 꺼냄 \n", start + 65);
            bfsRecusive(start);
        }
    }

}
