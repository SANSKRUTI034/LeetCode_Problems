void function(int i , int n)
{
    if(i<n)
    {
        return;
    }
    print(i);
    function(i-1 , n);
}

int main()
{
    cin>>n;
    function(n , n);
}