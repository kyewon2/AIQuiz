/**
 * Created by Kyewon on 2016. 6. 24..
 * 문자를 저장 할 수 있는 트리를 직접 구현
 */
public class Main {
    public static void main(String[] args){

        Node root= new Node('A'); //트리의 루트 노드 생성

        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');

        Tree.addLeftChild(root,B);
        Tree.addRightChild(root, C);
        Tree.addLeftChild(B, D);
        Tree.addRightChild(B, E);
        Tree.addLeftChild(C, F);
        Tree.addRightChild(C, G);

        Tree.printPreorder(root);
        System.out.println();
        Tree.printInorder(root);
        System.out.println();
        Tree.printPostorder(root);
    }
}
