/**
 * Created by Kyewon on 2016. 6. 29..
 */
public class Node {
    private int numV; //정점
    private Node numE; //간선(numV로부터 이어지는 정점)

    public Node(){}
    public Node(int numV){
        this.numV = numV;
        this.numE = null;
    }

    public int getNumV() {
        return numV;
    }

    public void setNumV(int numV) {
        this.numV = numV;
    }

    public Node getNumE() {
        return numE;
    }

    public void setNumE(Node numE) {
        this.numE = numE;
    }
}
