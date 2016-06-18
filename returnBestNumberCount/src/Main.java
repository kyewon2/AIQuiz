/**
 * Created by Kyewon on 2016. 6. 12..
 */
public class Main {

    //가장 많이 등장하는 값 반환
    public static int getBestNumberCount(int[] arr){
        int index = arr.length;
        int majority = 0;
        int majorityCount = 0; //가장 많이 등장하는 수

        for(int i = 0; i < index; i++){
            int val = arr[i]; //첫번째 인덱스부터 하나씩
            int count = 0;
            for(int j = 0; j < index; j++ ){ //전체 배열을 검사한다
                if(arr[j] == val){
                    count++;
                }
                if(count > majorityCount){
                    majorityCount = count;
                    majority = val;
                }
            }
        }
        return majority;
    }

    public static void main(String[] args) {

        int[] arrA = {1, 2, 3, 4, 4, 3, 2, 4, 5};

        System.out.println(getBestNumberCount(arrA));
    }
}
