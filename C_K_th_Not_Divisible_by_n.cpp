#include <bits/stdc++.h>
using namespace std;
#define ll long long int
const ll max_s = INT_MAX;
int main()
{

    int t;
    cin >> t;

    while (t--)
    {
        ll n;
        cin >> n;
        ll k;
        cin >> k;
        vector<ll> v;

        for (ll i = 1; i <= 100; i++)
        {
            if (i % n != 0)
            {
                v.push_back(i);
            }
        }
        k--;
        cout << v[k] << endl;
    }

    return 0;
}