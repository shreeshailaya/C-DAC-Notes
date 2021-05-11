#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int sqr(int);
int main6() {
	int no;
	printf("\n\n\tEnter the number ");
	scanf("%d", &no);
	sqr(no);
	return 0;
}

int sqr(int a) {
	a = a * a;
	printf("\n\n\t%d", a);
	return 0;
}

