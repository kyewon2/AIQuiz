import java.util.Scanner;

/**
 * Created by Kyewon on 2016. 7. 11..
 *
 * 주어진 문자열의 단어의 순서를 반전하는 알고리즘 문제
 * ex.
 * input  : "This is a cup"
 * output : "cup a is This"
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String str = sc.nextLine();

        ReverseChars reverseChars = new ReverseChars();
        reverseChars.pushStackAftersliceChars(str);
        reverseChars.printReverseChars();
    }
}
