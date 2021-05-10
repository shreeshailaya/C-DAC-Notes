//power of given number enter base and index
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main7() {
	int base, index,ans;
	printf("\n\n\t Enter base of number:- ");
	scanf("%d", &base);
	printf("\n\n\tEnter index of number:- ");
	scanf("%d", &index);
	for (int i = index;i>=1; i--) {
		
		printf("\n\n\tThe answer is:- %d", base*base);
		break;
	}
}