//accept the number and print the table
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main2() {
	printf("Enter the number ");
	int no;
	scanf("%d", &no);
	for (int i = 0; i <= 10; i++) {
		printf("\n\n\t%d", i * no);
	}
}