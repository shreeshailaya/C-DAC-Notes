#include<stdio.h>

int acceptArray();
int addArray(int[],int,int[],int);
int display(int [],int);
int main()
{   
    acceptArray();
}
int acceptArray()
{
    int size1,size2;
    printf("\n\n\tEnter the 1st array size");
    scanf("%d",&size1);

    int arr1[size1];

    printf("\n\n\tEnter the values in 1st array");
    for(int i=0;i<size1;i++)
    {
        printf("\n\n\t Enter %d value",i);
        scanf("%d",&arr1[i]);
    }



    printf("\n\n\t Enter the 2nd array size");
    scanf("%d",&size2);
    int arr2[size2];

    printf("\n\n\t Enter the Values in 2nd array");
    for(int i=0;i<size2;i++)
    {
        printf("\n\n\t Enter %d value",i);
        scanf("%d",&arr2[i]);
    }

    addArray(arr1,size1,arr2,size2);

}
int addArray(int arr1[],int size1,int arr2[],int size2)
{
    int size3=size1+size2;
    int arr3[size3],count=0;
    for(int i=0;i<size1;i++)
    {
        arr3[i]=arr1[i];
    }
    for(int j=size1;j<size3;j++)
    {
        arr3[j]=arr2[count];
        count++;
    }
    display(arr3,size3);
    return 0;
}
int display(int arr3[],int size3)
{
    for(int i=0;i<size3;i++){
        printf("  %d  ",arr3[i]);
    }
    return 0;
}
