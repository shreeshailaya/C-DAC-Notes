#include<stdio.h>
int main(){
    printf("\n\n\tProgram start here ");
    int flag=0;
    for(int i=1;i<=100;i++)
    {
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                flag=0;
                break;
            }else
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            printf("\n\n\t%d",i);
        }
    }
    return 0;
}