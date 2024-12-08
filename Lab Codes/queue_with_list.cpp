#include <bits/stdc++.h>
using namespace std;
class Node
{
public:
    int val;
    Node *next;
    Node *prev;
    Node(int val)
    {
        this->val = val;
        this->next = NULL;
        this->prev = NULL;
    }
};

class Myqueue
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

        if (head == NULL)
        {
            cout << "The queue is empty" << endl;
            return;
        }
        sz--;
        Node *deletenode = head;
        head = head->next;
        if (head == NULL)
        {
            tail = NULL;
        }
        else
        {
            head->prev = NULL;
        }

        delete deletenode;
    }

    int front()
    {
        if (head != NULL)
        {
            return head->val;
        }
        else
        {
            cout << "queue is empty" << endl;
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

    Myqueue q;
    int n;
    cout << "Enter your queue size" << endl;
    cin >> n;
    cout << "Given your number" << endl;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        q.push(x);
    }
    cout << "Your queue" << endl;
    while (!q.empty())
    {
        cout << q.front() << " ";
        q.pop();
    }
    cout << endl;
    return 0;
}