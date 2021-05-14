#include<stdio.h>
int oddEven(int []);
void main()
{
    int arr[5];
    printf("\n\n\n\t Printf the 5 no arraay");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    oddEven(arr);
}

int oddEven(int arr[])
{
    int odd=0,even=0;
    for(int i=0;i<5;i++)
    {
        if(arr[i]%2==0)
        {
            //printf("\n\n\t the Even numbers are %d",arr[i]);
            even++;
        }
        else 
        {
            //printf("\n\n\t the Odd numbers are %d",arr[i]);
            odd++;
        }
 
    }
    printf("\n\n\t Even No:-%d Odd No:-%d",even,odd);
}