//count no of digits
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main5() {
	int no,mod,sum=0;
	printf("\n\n\tEnter the number");
	scanf("%d", & no);
	while (no > 0) {
		mod = no % 10;
		no = no / 10;
		sum++;
	}
	printf("\n\n\t%d", sum);
}