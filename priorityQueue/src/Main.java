import java.util.PriorityQueue;

/**
 * Created by Kyewon on 2016. 6. 22..
 *
 * (key,value)형태의 데이터를 우선순위 큐를 이용하여 정렬
 */
public class Main {
    public static void main(String[] args){

        PriorityQueue<Item> prq = new PriorityQueue<Item>();
        prq.add(new Item("e",5));
        prq.add(new Item("a",4));
        prq.add(new Item("a",3));
        prq.add(new Item("b",2));
        prq.add(new Item("c",1));

        Item highestValueItem = prq.peek(); //우선순위가 가장 높은 아이템
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(highestValueItem.getKey()+ " " + highestValueItem.getValue());
    }
}
