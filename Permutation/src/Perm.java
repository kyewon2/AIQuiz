/**
 * Created by Kyewon on 2016. 7. 6..
 *
 * 해결전략.
 * 1.depth는 0부터 배열의 lenth 만큼 증가한다.
 * 2.depth가 증가할때마다 swap()한다
 * 3.depth가 최하위일때 print한다.
 */
public class Perm {
    public Perm(){}

    public void permRecersive(int[] arr, int depth){

        if(depth == arr.length-1){ //마지막 depth에 도달했을때 출력
            printArr(arr);
        }
        for(int i = depth; i < arr.length; i++){
            swap(arr,i,depth);
            permRecersive(arr, depth + 1);
            swap(arr,i,depth);
        }
    }

    public void swap(int[] arr, int index, int depth){
        int temp = arr[index];
        arr[index] = arr[depth];
        arr[depth] = temp;
    }

    public void printArr(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
