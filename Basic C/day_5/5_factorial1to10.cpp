#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void main5()
{
	int no, i, fact;

	//printf("\n\n\t Enter Number ");
	//scanf("%d", &no);
	for (no = 1; no <= 10; no++)
	{
		fact = 1;
		for (i = no; i > 0; i--)
		{
			fact = fact * i;
		}
		printf("\n\n\t %d Factorial is %d", no, fact);
	}
	printf("\n\n\n");
}

