#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main1()
{
	int a = 10;
	char b = 'A';
	float c = 4.54f;
	int *p = &a;
	char *q = &b;
	float *s = &c;

	printf("\n\n\t A: %d  &A: - %u", a, &a);
	printf("\n\t B: %c  &B: - %u", b, &b);
	printf("\n\t C: %f  &C: - %u", c, &c);
	printf("\n\n\t %d\t%c\t%f", *p, *q, *s);
	printf("\n\n\t size of p %d", sizeof(p));
	printf("\n\n\t size of q %d", sizeof(q)); 
	printf("\n\n\t size of q %d", sizeof(s));

	printf("\n\n\n");



}