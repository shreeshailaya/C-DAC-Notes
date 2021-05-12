#include<stdio.h>
int prime();
int main(){
    int no,pri;
    printf("Enter the number");
    scanf("%d",&no);
    prime(no);
    pri=prime(no);
    return 0;
}

int prime(int no){
    for(int i=2;i<no;){
        if(no%i==0){


        }
    }
}