#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main2() {
	int flag = 0;
	for (int i = 0; i <= 100; i++) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				//printf("\n%d", i);
				break;
			}
			else {
				printf("\n\n\t%d", i);
				break;
			}
			
		}
	}
}

