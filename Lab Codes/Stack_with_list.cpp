#include <bits/stdc++.h>
using namespace std;
class Node
{
public:
    int val;
    Node *prev;
    Node *next;
    Node(int val)
    {
        this->val = val;
        this->next = NULL;
        this->prev = NULL;
    }
};
class Mystack
{
public:
    Node *head = NULL;
    Node *tail = NULL;
    int sz = 0;
    void push(int val)
    {
        sz++;
        Node *newnode = new Node(val);
        if (head == NULL)
        {
            head = newnode;
            tail = newnode;
            return;
        }

        tail->next = newnode;
        newnode->prev = tail;
        tail = newnode;
    }

    void pop()
    {
        if (tail == NULL)
        {
            cout << "Stack is empty" << endl;
            return;
        }
        sz--;
        Node *deletenode = tail;
        tail = tail->prev;

        if (tail == NULL)
        {
            head = NULL;
        }
        else
        {
            tail->next = NULL;
        }

        delete deletenode;
    }

    int top()
    {
        if (tail != NULL)
        {
            return tail->val;
        }

        else
        {
            cout << "Stack is empty" << endl;
            return -1;
        }
    }

    int size()
    {
        return sz;
    }

    bool empty()
    {
        if (sz == 0)
            return true;
        else
            return false;
    }
};

int main()
{
    Mystack st;

    int n;
    cout << "Enter your stack size" << endl;
    cin >> n;
    cout << "Given your number:" << endl;

    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        st.push(x);
    }
    cout << "Your stack" << endl;
    while (!st.empty())
    {
        cout << st.top() << " ";
        st.pop();
    }
    cout << endl;
    return 0;
}