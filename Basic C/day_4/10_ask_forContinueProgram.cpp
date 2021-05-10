//ask for continue the program 
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main() {
	int no, flag;

	do {
		printf("Enter number");
		scanf("%d", &no);
		for (int i = 0; i <= 10; i++) {
			printf("\n\n\t%d", i * no);
		}
		printf("\n\n\t do you want to continue 1:yes\n2:no");
		scanf("%d", &flag);
	} while (flag == 1);
	
}