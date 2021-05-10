//sum of digits in given number 
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main3() {
	int no,mod,sum=0;
	printf("Enter the number");
	scanf("%d", &no);
	while (no > 0) {
		mod = no % 10;
		no = no / 10;
		sum = sum + mod;
	}

	printf("\n\n\t%d", sum);
}