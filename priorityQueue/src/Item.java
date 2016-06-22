/**
 * Created by Kyewon on 2016. 6. 22..
 */
public class Item implements Comparable<Item>{
    private String key;
    private int value;

    public Item(String key, int value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Item item) {
        System.out.println("---------------------compareTo");
        System.out.println(this.getKey());
        System.out.println(item.getKey());
        System.out.println(this.getKey().compareTo(item.getKey()));
        System.out.println("-------------------------------");

        return this.getKey().compareTo(item.getKey());
    }
}
