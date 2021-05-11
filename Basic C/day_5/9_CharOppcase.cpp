#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void fun(char);
void main9() {
	char ch;
	printf("Enter the char");
	scanf("%ch", &ch);
	fun(ch);
}
void fun(char ch) {

	if (ch >= 'A' && ch <= 'Z') {
		printf("\t\nConverted to %c", ch + 32);
	}
	else if (ch >= 'a' && ch <= 'z') {
		printf("\t\nConverted to %c", ch - 32);
	}
	printf("\n\n\n\n");
}

