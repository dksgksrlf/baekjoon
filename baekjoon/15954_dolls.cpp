#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(void)
{
    int n, k = 0;
    scanf("%d %d", &n, &k);
    int* num = (int*)malloc(sizeof(int) * n);
    int i=0, j = 0;
    double sum=0, mean = 0;
    double var = 9999999999999.0;
    for (i; i < n; i++)
    {
        scanf("%d", &j);
        num[i] = j;
    }
    
    
    for (i = 0; i < n - k + 1; i++)
    {
        for (j = 0; j < k; j++)
        {
            sum += (double)num[i+j];
        }
        mean = sum / (double)k; //���ӵǴ� k���� ������ ���
        sum = 0;
        for (j = 0; j < k; j++)
            sum += pow((double)num[i + j] - mean, 2);
        if (var > sum / (double)k)
            var = sum / (double)k; //�л��� ũ�Ⱑ �ּҸ� ����
        sum = 0;
        if (i == n - k &&k<n)
        {
            k++;
            i = -1;//���ӵǴ� k+1���� ������ �л굵 ���
        }
    }
    printf("%.11lf", sqrt(var));
    return 0;
}