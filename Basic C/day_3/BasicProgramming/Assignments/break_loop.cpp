#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<conio.h>
void main() {
	for (int i = 0; i <= 255; i++) 
	{
		printf("\n\n\t%d\t%c", i, i);
		if (i == 0) {
			continue;
		}

		else if (i % 10 == 0) {
			_getch();
		}

	}
}