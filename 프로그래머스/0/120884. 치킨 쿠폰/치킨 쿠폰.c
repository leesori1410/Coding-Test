#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int chicken) {
    int answer = 0;
    int ch = 0;
    while(chicken/10!=0){
        ch = chicken % 10;
        chicken /= 10;
        answer += chicken;
        chicken += ch;
        
    }
    return answer;
}