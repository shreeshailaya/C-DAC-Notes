#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main1() {
	int i, j;
	for (i = 1; i <= 5; i++)
	{
		printf("\n\n");
		for (j = 5; j >= i; j--)
			printf(" * ");
	}

}

