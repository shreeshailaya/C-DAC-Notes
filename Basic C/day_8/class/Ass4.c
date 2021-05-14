#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

// Accept and Display Array

void main4()
{
	int i, a[5] = {9,4,5,3,7 };
	// Accept Array
	/*printf("\n\n\t Enter 10 Elements ");
	for (i = 0; i < 10; i++)
	{
		scanf("%d", &a[i]);
	}*/
	// Display Array
	printf("\n\n\t Array Is \n\n");
	for (i = 0; i < 5; i++)
		printf("\n\n\t%d\t%u   ", a[i],&a[i]);
	
	printf("\n\n\t %u", a);

	printf("\n\n\n");
}