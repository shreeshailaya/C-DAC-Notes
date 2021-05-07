#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main1()
{
	int totalsales, basicsalary;
	float comm, netsalary;

	printf("\n\tEnter Total Sales and Basic Salary ");
	scanf("%d%d", &totalsales, &basicsalary);

	if (totalsales >= 5000 && totalsales < 7000)
		comm = totalsales * .03;
	else if (totalsales >= 7000 && totalsales <= 10000)
		comm = totalsales * .05;


	netsalary = basicsalary + comm;
	printf("\n\n\t Total Sales  : %d", totalsales);
	printf("\n\n\t Basic Salary : %d", basicsalary);
	printf("\n\n\t Commission   : %.2f", comm);
	printf("\n\n\t Net Salary   : %.2f", netsalary);

	printf("\n\n\n");
		
}