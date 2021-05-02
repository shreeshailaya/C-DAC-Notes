/* Write a program to create array of intergers and perform following operations
 on that array like finding the sum,avg,maximum,min and accepts the nubers from user */

 #include<stdio.h>
 int sum();
 int avg();
 int large();
 int small();
 int main()
 {  
     int arr[5];
     for(int i=0;i<5;i++){
         printf("Enter thr %d array  ",i);
         scanf("%d",&arr[i]);
     }
     sum(arr);
     avg(arr);
     large(arr);
     small(arr);
    printf("Please Enter the value\n");
    printf("\n 1.sum \n 2.avg \n 3.large \n 4.small\n");
    int num;
    scanf("%d",&num);
     switch (num)
     {
     case 1:
         sum(arr);
         break;
      case 2:
        avg(arr);
        break;
      case 3:
        large(arr);
        break;
      case 4:
        small(arr);
        break;     
     default:
         printf("please enter valid number \n");
         break;
     }

     
     return 0;
 }

int sum(int arr[]){    
    int count=0;
    for(int i=0;i<5;i++){
         count+=arr[i];
     }
     printf("Sum is %d \n",count);
     return 0;
     
 }
 int avg(int arr[]){
     float count=0;
     float x;
     for(int i=0;i<5;i++){
         count+=arr[i];
        x=count/5;

     }
     printf("The avg of array is %f  \n",x);
     return 0;
 }

 int large(int arr[])
 {
     int i,l;
     l=arr[0];
     for(i=0;i<5;i++){
         if(l<arr[i]){
             l=arr[i];
         }
     }
     printf("largest number is %d \n", l);
     return 0;
 }

int small(int arr[]){
     int s,i;
     s=arr[0];
     for(i=0;i<4;i++){
         if(s>arr[i]){
             s=arr[i];
         }
     }
    printf("smallest no is %d\n",s);
    return 0;
 }
