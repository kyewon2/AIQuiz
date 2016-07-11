import java.util.Stack;

/**
 * Created by Kyewon on 2016. 7. 11..
 *
 * 해결전략
 * 1.문자열을 입력 받으면 띄어쓰기 기준으로 짜른다
 * 2.자른 문자열을 순서대로 스택에 넣는다
 * 3.스택을 출력한다
 */
public class ReverseChars {
    Stack<String> stack = new Stack<>();
    String sliceStr = null;

    public ReverseChars(){}

    /**
     * 문자열을 잘라서 스택에 넣는 함수
     */
    public void pushStackAftersliceChars(String str){
        String[] strSpaceLength = str.split(" ");
        for(int i = 0; i < strSpaceLength.length; i ++){ //공백 갯수만큼
                sliceStr = str.split(" ")[i]; // " "기준으로 자른다
                stack.push(sliceStr);
        }
    }

    public void printReverseChars(){
        if(!stack.isEmpty()){
            while(!stack.empty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }
}
