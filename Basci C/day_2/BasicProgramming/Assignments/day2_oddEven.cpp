//Odd and Even program
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main() {
	int no;
	printf("\n\t Enter No \n\t");
	scanf("%d", &no);
	if (no % 2 == 0) {
		printf("\n\t %d is prime no \t\n", no);
	}
	else {
		printf("\t\n %d is Not prime \t\n",no);

	}
	return 0;
}


