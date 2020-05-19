#include<iostream>
using namespace std;
int main()
{
  int a[20],n,loc,val;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc>n || loc<=0)
  {
    cout<<"Invalid Input";
  }
  else
  {
    cout<<"Enter the value to insert\n";
  		cin>>val;
    for(int i=n-1;i>=loc-1;i--)
    {
      a[i+1]=a[i];
    }
    a[loc-1]=val;
    cout<<"Array after insertion is\n";
    for(int i=0;i<=n;i++)
    {
      cout<<a[i]<<"\n";
    }
  }
  return 0;
}
    

