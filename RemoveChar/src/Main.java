import java.util.Scanner;

/**
 * Created by Kyewon on 2016. 7. 8..
 *
 * 주어진 문자열에서 input에 해당하는 모든 문자를 문자열에서 삭제하기
 * ex.
 * 문자열   : Overwatch
 * input  : vra
 * output : Oewtch
 */
public class Main {
    public static void main(String[] args){
        String str = "Overwatch";
        RemoveChar removeChar = new RemoveChar();
        RemoveChar removeChars = new RemoveChar();

        removeChar.rmChar(str, 'v');
        removeChars.rmChars(str, "vra");

    }
}
