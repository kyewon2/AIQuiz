/**
 * Created by Kyewon on 2016. 7. 6..
 *
 * 문자열 순열 문제.
 * 출력 순서와 상관없이 어떤 문자열이 주어질때 문자들을 나열 할 수 있는 모든 경우 출력
 * (같은 문자도 다른 문자열로 처리)
 * ex)input: "abc"
 *    ouput: "abc","acb","bac","bca","cab","cba"
 */
public class Main {
    public static void main(String[] args){

        int[] arr = {1,2,3};
        int depth = 0;
        Perm perm = new Perm();
        perm.permRecersive(arr,depth);
    }
}
