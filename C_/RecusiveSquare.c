//
//  main.c
//  RecusiveSquare
//
//  Created by 서계원 on 2016. 7. 9..
//  Copyright © 2016년 서계원. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int num;
    int squareN = 1;
    printf("정수입력 : ");
    scanf("%d",&num);
    printf("%d", square(squareN,num));
    return 0;
}

int square(int squareN, int num){
    if(num == 0){ //탈출 조건
        return squareN;
    }
    squareN = squareN * 2; //if문보다 위에 두면 위치 차이로 *2가 한번 더 붙는다
    return square(squareN,num-1);
}