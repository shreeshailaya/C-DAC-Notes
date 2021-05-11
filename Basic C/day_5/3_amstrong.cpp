#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main3()
{
	int i, j, k, b = 0, c = 0, d;
	for (i = 1; i <= 500; i++)
	{
		k = i;
		d = i;
		while (d != 0)
		{
			j = d % 10;
			b = b + (j * j * j);
			d = d / 10;
		}
		if (k == b)
		{
			printf("%d\n", k);
			c++;
		}
		b = 0;

		if (c == 5)
			break;
	}
}

