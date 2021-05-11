#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void mainx() {
	int no,flag=0;
	printf("Enter the number ");
	scanf("%d", &no);
	for (int i = 2; i < no; i++) {
		if (no % i==0) {
			flag = 1;
			break;
		}

	}
	if (flag == 1) {
		printf("NotPrime");

	}
	else {
		printf("prime");
	}
}

