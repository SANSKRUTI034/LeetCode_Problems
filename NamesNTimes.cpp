//Prints name N times(using recursion)
//Time complexity = o(n)
//Space complexity = o(n)


void Ntimes(int i , int n)
{
    if(i > n)
    {
        return;                 //Base Condition
    }

    print("Sanskruti");
    Ntimes(i+1 ,, n);
}



int main()
{
    int n ;
    cin>>n;
    Ntimes(1 , n);

}