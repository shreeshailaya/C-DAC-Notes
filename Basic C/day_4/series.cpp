#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main4() {
	int sn, en;
	printf("Enter start &end the Number");
	scanf("%d %d", &sn, &en);

	if (sn < en) {
		for (int i = sn; i <= en; i++)
			printf("\n\n\t%d", i);
	}
	else if (sn > en) {
		for (int i = sn; i >= en; i--) {
			printf("\n\n\t%d", i);
		}
	}

	return 0;
}