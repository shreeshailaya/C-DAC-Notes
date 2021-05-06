/* Prime Number */
#include<stdio.h>
int main(){
    int i,no,count=0;
    printf("Enter the number ");
    scanf("%d",&no);

    for(i=1;i<=no;i++){
        if(no%i==0){
            count++;
        }
    }
    if(count==2){
        printf("Prime No\n");
    }else{
        printf("Not Prime\n");
    }
}