//
//  main.c
//  GCD
//
//  Created by 서계원 on 2016. 7. 8..
//  Copyright © 2016년 서계원. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int a,b;
    int max, min;
    int r;
    
    //두수를 입력 받는다
    printf("두 수 입력 : ");
    scanf("%d %d",&a,&b);
    if(a>b){
        max = a;
        min = b;
    }else{
        max = b;
        min = a;
    }
    
    r = max % min;
    if(r == 0){  //큰수를 작은 수로 나눈 나머지가 0일때
        printf("최대 공약수 : %d", min);
    }else{              //나머지로 작은 수를 나눈다
        while(r != 0){  //나머지가 0이되면 끝낸다
            max = min;
            min = r;
            r = max % min;
        }
        printf("최대 공약수 : %d", min);
    }
    return 0;
}
