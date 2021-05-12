#include<stdio.h>
void main() 
{
	int flag = 0;
	for (int i = 1; i <= 100; i++) 
    {
		for (int j = 2; j < i; j++)
         {
			if (i % j == 0) 
            {
                flag=0;
				//printf("\n%d", i);
				break;
			}
			else 
            {
                flag=1;
				//printf("\n\n\t%d", i);
			}
         }
            if (flag==1)
                printf("\n\n\t%d",i);
	}
}
