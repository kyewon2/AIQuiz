import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Kyewon on 2016. 6. 11..
 */
public class Main {
   public static void main(String[] args) {

       //배열 A
       /*int[][] arrA = {
       //       [0][1][2]
               { 1, 2, 3},
               { 4, 5, 6},
               { 7, 8, 9},
               {10,11,12}
                };
       */
       int[][] arrA = new int[4][3];//4행3열
       int[][] arrB = new int[3][4];//3행4열

       int a1 = 4, a2 = 3;
       int b1 = 0, b2 = 0;
       int num = 0; //값

       //배열 a 값 채우기
       for (int i = 0; i < a1; i++) {
           for (int j = 0; j < a2; j++) {
               num = num + 1;
               arrA[i][j] = num;
           }
       }

       //배열 b 값 채우기
       for (int i = 0; i < a1; i++) {
           for (int j = 0; j < a2; j++) {
               arrB[b1][b2] = arrA[i][j];
               b2 = b2 + 1;
               if (b2 >= 4) {  //3열이거나 커질때
                   b1 = b1 + 1;
                   b2 = 0;
               }
           }
       }

       printArr(arrA,"a");
       printArr(arrB,"b");
   }

       //배열 값 출력
       public static void printArr(int[][] arr, String s){
           String str = s;
           System.out.println("arr => "+str);
           for(int i = 0; i < arr.length; i++){
               for(int j = 0; j < arr[i].length; j++){
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }
       }
}
