#include<stdio.h>
int sumArr(int []);
int main(){
    int arr[5],sum;
    printf("\n\n\t Enter the 5 Number of array ");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }

    sum=sumArr(arr);
    printf("\n\n\t the sum is  %d",sum);

}

int sumArr(int arr[])
{
    int sum=0;
    for(int i=0;i<5;i++)
    {
        sum = sum+arr[i];
    }
    return sum;
}

