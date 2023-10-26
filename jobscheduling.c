#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
typedef struct Job
{
    char id;
    int deadline;
    int profit;
} Job;
int comparison(const void *a, const void *b)
{
    Job *temp_a = (Job *)a;
    Job *temp_b = (Job *)b;
    return (temp_b->profit - temp_a->profit);
}
int min(int num1, int num2)
{
    return (num1 > num2) ? num2 : num1;
}
void printJobScheduling(Job arr[], int n)
{
    qsort(arr, n, sizeof(Job), comparison);
    int result[n];
    bool slot[n];
    for (int i = 0; i < n; i++)
        slot[i] = false;
    for (int i = 0; i < n; i++)
    {
        for (int j = min(n, arr[i].deadline) - 1; j >= 0; j--)
        {
            if (slot[j] == false)
            {
                result[j] = i;
                slot[j] = true;
                break;
            }
        }
    }
    int maxProfit = 0;
    for (int i = 0; i < n; i++)
    {
        if (slot[i])
        {
            maxProfit += arr[result[i]].profit;
            printf("(%c,%d)\n", arr[result[i]].id, arr[result[i]].profit);
        }
    }
    printf("Maximum profit = %d\n", maxProfit);
}
int main()
{
    Job arr[] = {{'a', 3, 200}, {'c', 1, 30}, {'b', 3, 18}, {'g', 4, 20}, {'h', 5, 15}};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Here's the maximum profit after completing sequence of jobs \n");
    printJobScheduling(arr, n);
    return 0;
}
