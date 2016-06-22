import java.util.Scanner;

/**
 * Created by Kyewon on 2016. 6. 22..
 * 거스름돈을 이용한 탐욕알고리즘 예제 문제입니다
 */
public class Main {
    public static void main(String[] args){

        int[] coinKind = {10,7,1}; //큰 수부터 정렬되어 있어야함
        int[] coinCount = {0,0,0};
        int input;
        int i = 0; //배열 인덱스 비교
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("금액 :");
        input = sc.nextInt();

        while(i < 3){
            if(input < coinKind[i]) { //coin의 큰 단위부터 비교한다
                i++;
            }else if(input > coinKind[i]) { //coin종류에 해당하는게 범위가 있다면
                input -= coinKind[i];
                coinCount[i]++;
            }else{ //금액과 coin종류가 같을때
                flag = true;
                coinCount[i]++;
                break;
            }
        }

        if(flag == true){
            System.out.println(coinKind[0]+"원 "+ coinCount[0]+"개 "+coinKind[1]+"원 "+ coinCount[1]+"개 "
                    +coinKind[2]+"원 "+ coinCount[2]+"개 ");
        }else{
            System.out.println("error");
        }
    }
}
