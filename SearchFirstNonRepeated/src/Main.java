import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Kyewon on 2016. 6. 23..
 * 문자열이 주어질때 처음으로 반복되지 않는 문자를 찾는 문제입니다.
 * ex) input : teeter -> output : r
 * hashTable 이용
 */
public class Main {
    private static Character firstNonRepeated(String str){
        Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();
        Character c = null;

        for(int i = 0; i < str.length(); i ++){
            c = str.charAt(i); //문자열의 인덱스에 해당하는 문자를 받는다

            if(hashtable.containsKey(c)){ //hashtable에 해당 문자가 있다면
                hashtable.put(c, hashtable.get(c)+1); //해당 문자의 count +1
            }else{
                hashtable.put(c,1);
            }
        }

        //hashtable에서 처음으로 반복되지 않은 문자열을 출력한다
        for(int j = 0; j < str.length(); j ++){
            c = str.charAt(j);
            if(hashtable.get(c) == 1){
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input :");
        String str = sc.nextLine();

        System.out.println(firstNonRepeated(str));
    }
}
