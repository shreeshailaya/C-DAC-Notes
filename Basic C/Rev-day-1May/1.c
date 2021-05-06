/* find even and odd in array */
#include<stdio.h>
int main(){
    int arr[10];
    for(int i=0; i<10;i++){
        arr[i]=i;
    }

    for(int i=0; i<10;i++){
        printf("\n Arr[%d]=%d \n",i,arr[i]);  
    }

    for(int i=0;i<10;i++){
        if(arr[i]%2==0){
            printf("\n Even No %d \n", arr[i]);
        }else{
            printf("\n Odd no %d \n", arr[i]);
        }
    }

}