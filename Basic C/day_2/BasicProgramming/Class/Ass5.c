#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void main()
{
	char ch;
	printf("\n\n\t Enter Character ");
	scanf("%c", &ch);
	printf("\n\n\t Character Is %c", ch);

	if (ch >= 'A' && ch <= 'Z')
	{
		printf("\n\t Character Is %c", ch);
		printf("\n\n\t It Is Upper letter ");
	}
	else if (ch >= 'a' && ch <= 'z')
		printf("\n\t It Is Small Letter ");
	else
		printf("\n\t It Is Not An Alphabet");
	printf("\n\n\n");

}