#include<stdio.h>
void b_d(int num);
int main()
{
	int bin;
	printf("enter a BINARY number:");
	scanf("%d", &bin);
	b_d(bin);
	return 0;
}
void b_d(int num)
{
	int ans,org_bin,rem,base=1;
	int decimal = 0;
	org_bin = num;//456
	while (num != 0)
	{
		rem = num % 10;
		decimal = decimal + rem * base;
		base = base * 2;
		num = num / 10;
		
	}
	printf("binary value is: %d", org_bin);
	printf("decimal value is: %d", decimal);

}