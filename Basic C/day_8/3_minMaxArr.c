#include<stdio.h>
int minMax(int [],int n);
int main(){
    int arr[5],n=5;
    printf("\n\n\tEnter the 5 digit of array");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    minMax(arr,n);
    return 0;
}
int minMax(int arr[],int n)
{
    int max,min;
    if(arr[0]>arr[1])
    {
        max=arr[0];
        min=arr[1];
    }else
    {
        max=arr[1];
        min=arr[0];
    }

    for(int i=2;i<n;i++)
    {
        if(arr[i]>max)
        {
            //printf("\n\n\t %d is Max",arr[i]);
            max=arr[i];
        }else if(arr[i]<min)
        {
            min=arr[i];
        }
    }

    printf("\n\n\t The maximum value is %d", max);
    printf("\n\n\t The minimum value is %d", min);
    printf("\n\n\t");

}
