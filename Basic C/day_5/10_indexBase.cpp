#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void indexBase(int, int);
void main10() {
	int base, index, ans;
	printf("\n\n\t Enter base of number:- ");
	scanf("%d", &base);
	printf("\n\n\tEnter index of number:- ");
	scanf("%d", &index);
	indexBase(base, index);
}
void indexBase(int base, int index) {
	for (int i = index; i >= 1; i--) {

		printf("\n\n\tThe answer is:- %d", base * base);
		break;
	}
}

