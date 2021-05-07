#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
// Accept One Number
// print 1 to 10 numbers.

void main7()
{
	int no, i;
	printf("\n\n\t Enter a Number ");
	scanf("%d", &no);

	for (i = 1; i <= 10; i++)
		printf("\n\t%d * %d = %d",no,i,no*i);
	
	printf("\n\n");

}