#include <iostream>
using namespace std;

int knapsack(int W, int wt[], int val[], int n) {
    int dp[n+1][W+1];
    for(int i=0; i<=n; i++) {
        for(int w=0; w<=W; w++) {
            if(i==0 || w==0) dp[i][w] = 0;
            else if(wt[i-1] <= w)
                dp[i][w] = max(val[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w]);
            else
                dp[i][w] = dp[i-1][w];
        }
    }
    return dp[n][W];
}

int main() {
    int val[] = {60, 100, 120};
    int wt[] = {10, 20, 30};
    int W = 50;
    cout << "Max value: " << knapsack(W, wt, val, 3);
    return 0;
}
