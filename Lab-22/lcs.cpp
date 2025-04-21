#include <iostream>
#include <string>
using namespace std;

int lcs(string X, string Y) {
    int m = X.length(), n = Y.length();
    int dp[m+1][n+1];

    for(int i=0; i<=m; i++) {
        for(int j=0; j<=n; j++) {
            if(i==0 || j==0) dp[i][j] = 0;
            else if(X[i-1] == Y[j-1])
                dp[i][j] = 1 + dp[i-1][j-1];
            else
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
        }
    }
    return dp[m][n];
}

int main() {
    string X = "AGGTAB", Y = "GXTXAYB";
    cout << "Length of LCS: " << lcs(X, Y);
    return 0;
}
