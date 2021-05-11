#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void max(int,int,int);
void main() {
	int a, b, c;
	printf("\n\n\tEnter three number");
	scanf("%d%d%d", &a, &b, &c);
	max(a, b, c);
}
void max(int a, int b, int c) {
	if (a > b && a > c) {
		printf("\n\n\t A is greater ");
	}
	else if (b > c && b > a) {
		printf("\n\n\t B is greater");
	}
	else {
		printf("\n\n\t C is greater");
	}
}

