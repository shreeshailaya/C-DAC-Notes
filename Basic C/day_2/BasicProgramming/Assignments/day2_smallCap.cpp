//convert to opposite case
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main() {
	char ch;
	printf("\t\nEnter Char ff");
	scanf("%c", &ch);

	if (ch >= 'A' && ch <= 'Z') {
		printf("\t\nConverted to %c", ch + 32);
	}
	else if (ch >= 'a' && ch <= 'z') {
		printf("\t\nConverted to %c", ch - 32);
	}
	printf("\n\n\n\n");
	return 0;
}