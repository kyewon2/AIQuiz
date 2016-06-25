/**
 * Created by Kyewon on 2016. 6. 24..
 */
public class Tree {

    public Tree(){}
    public static void addLeftChild(Node parent, Node child){
        //부모의 왼쪽 노드가 비어 있다면
        if(parent.getLeftChild() == null){
            parent.setLeftChild(child);
        }else{
            System.out.println(parent.getData() + "의 왼쪽 노드에 데이터가 있습니다.");
            parent.getLeftChild();
        }

    }
    public static void addRightChild(Node parent, Node child){

        //부모의 오른쪽 노드가 비어 있다면
        if(parent.getRightChild() == null){
            parent.setRightChild(child);
        }else{
            System.out.println(parent.getData() + "의 오른쪽 노드에 데이터가 있습니다.");
            parent.getRightChild();
        }
    }

    //순회하면서 출력 (parent -> left -> right)
    public static void printPreorder(Node parentNode){
        if(parentNode != null){
            System.out.print(parentNode.getData());
            printPreorder(parentNode.getLeftChild());
            printPreorder(parentNode.getRightChild());
        }
    }

    //순회하면서 출력 (left -> parent -> right)
    public static void printInorder(Node parentNode){
        if(parentNode != null){
            printInorder(parentNode.getLeftChild());
            System.out.print(parentNode.getData());
            printInorder(parentNode.getRightChild());
        }
    }

    //순회하면서 출력 (left -> right -> parent)
    public static void printPostorder(Node parentNode){
        if(parentNode != null){
            printPostorder(parentNode.getLeftChild());
            printPostorder(parentNode.getRightChild());
            System.out.print(parentNode.getData());
        }
    }

}
