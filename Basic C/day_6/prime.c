#include<stdio.h>
int main(){
    int no,flag=0;
    printf("\n\n\t Enteer the number");
    scanf("%d",&no);
    for(int i=2;i<no;i++)
    {
        if(no%i==0){
            flag=1;
        }
    }
    if(flag==1){
        printf("\n\n\t The number is not prime");
    }else{
        printf("\n\n\t The number is prime");
    }
    return 0;
}