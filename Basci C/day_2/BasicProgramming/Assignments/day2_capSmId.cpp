//Character is Smaa or Capital
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	char ch;
	printf("\n\n\t Enter Character ");
	scanf("%c",&ch);

	if (ch >= 'A' && ch <= 'Z')
	{
		printf("\n\n\t Upper letter ");
	}
	else if (ch >= 'a' && ch <= 'z')
		printf("\n\t Small Letter ");
	else
		printf("\n\t Not Alphabate");
	return 0;

}