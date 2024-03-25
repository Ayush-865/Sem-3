#include <stdio.h>

int linearSearch(int arr[], int size, int data)
{
    int i;
    for (i = 0; i < size; i++)
    {
        if (arr[i] == data)
        {
            return i;
        }
    }
    return -1;
}

int binarySearch(int arr[], int size, int data)
{
    int mid, high = size - 1, low = 0;
    mid = (high + low) / 2;
    while (low <= high)
    {
        if (arr[mid] == data)
        {
            return mid;
        }
        else if (arr[mid] > data)
        {
            high = mid - 1;
            mid = (high + low) / 2;
        }
        else
        {
            low = mid + 1;
            mid = (high + low) / 2;
        }
    }
}

int main()
{
    int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int size = sizeof(arr) / sizeof(int);
    int element = 14;
    int index = binarySearch(arr, size, element);
    if (index != -1)
    {
        printf("%d was found at %d", element, index);
    }
    else
    {
        printf("%d not found", element);
    }
    return 0;
}
