/* Prime No in array */
#include<stdio.h>
int main(){
    int arr[5],i,j,f,n;
    for(i=0;i<5;i++){
        printf("Enter %d Number  ",i);
        scanf("%d",&arr[i]);
    }

    for(i=0;i<5;i++){
        n=arr[i];
        f=0;
        for(j=2;j<n;j++)
        {
            if(n%j==0)
            {
                f==1;
                break;
            }
            if(f==0){
                printf( "%d is prime number \n",  n);
                break;
            }
        } 
    }
    return 0;
}
