#include <iostream>
using namespace std;

int partition(int arr[], int low, int high) {
    int pivot = arr[high], i = low-1;
    for(int j=low; j<high; j++)
        if(arr[j] < pivot)   //for descending change to >
            swap(arr[++i], arr[j]);
    swap(arr[i+1], arr[high]);
    return i+1;
}

void quickSort(int arr[], int low, int high) {
    if(low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }
}

int main() {
    int arr[] = {5, 3, 8, 4, 2};
    int n = 5;
    quickSort(arr, 0, n-1);
    for(int i=0; i<n; i++)
        cout << arr[i] << " ";
    return 0;
}
