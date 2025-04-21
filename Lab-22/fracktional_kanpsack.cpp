#include <iostream>
#include <algorithm>
using namespace std;

struct Item {
    int weight, value;
};

bool cmp(Item a, Item b) {
    return (double)a.value/a.weight > (double)b.value/b.weight;
}

double fractionalKnapsack(int W, Item arr[], int n) {
    sort(arr, arr+n, cmp);
    double total = 0;
    for(int i=0; i<n && W>0; i++) {
        if(arr[i].weight <= W) {
            total += arr[i].value;
            W -= arr[i].weight;
        } else {
            total += arr[i].value * ((double)W / arr[i].weight);
            break;
        }
    }
    return total;
}

int main() {
    Item arr[] = {{10, 60}, {20, 100}, {30, 120}};
    int W = 50;
    cout << "Max value: " << fractionalKnapsack(W, arr, 3);
    return 0;
}
