/**
 * Created by Kyewon on 2016. 6. 24..
 */
public class Node {
    private char data;
    private Node leftChild;
    private Node rightChild;

    public Node(char data){
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
