//factorial number 5=5*4*3*2*1
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main6() {
	int no,sum=1;
	printf("Enter the number ");
	scanf("%d", &no);
	for (int i = no; i >= 1; i--) {
		printf("\n\n\t%d", i);
		sum = sum * i;
	}
	printf("\n\n\tThe factorial is:-%d", sum);
}