#include<stdio.h>
int prime(int);
int main(){
    int no,pri;
    printf("Enter the number");
    scanf("%d",&no);
    prime(no);
    pri=prime(no);
    if(pri==1){
        printf("The number %d is not prime",no);
    }else{
        printf("The number %d is prime",no);
    }
    printf("\n\n");
    return 0;
}

int prime(int no){
    int flag=0;
    for(int i=2;i<no;i++){
        if(no%i==0)
        {
            flag=1;
        }
    }
    printf("\n\n");
    return flag;
}