#include<stdio.h>
int minMax(int []);
int main(){
    int arr[5];
    printf("\n\n\tEnter the 5 digit of array");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    minMax(arr);

    return 0;
}
int minMax(int arr[])
{
    int min=arr[0],max;
    for(int i=0;i<5;i++)
    {
        for(int j=i;j<5;j++)
        {
            if(min<arr[j])
            {
                min=arr[j];
            }
        }
    }
    printf("\n\n\t %d",min);
}
