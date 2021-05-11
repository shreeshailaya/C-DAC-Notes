#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void table(int);
int main7() {
	int no;
	printf("\n\n\tEnter the number ");
	scanf("%d", &no);
	table(no);
	return 0;
}
void table(int no) {
	for (int i = 0; i <= 10; i++) {
		printf("\n\n\t%d * %d=\t%d", i, no, i * no);
	}
}

