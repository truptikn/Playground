#include<iostream>
using namespace std;
int main()
{
  int a[5][5],i,j,n,dig1=0,dig2=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
      {
        dig1+=a[i][j];
      }
      if(i+j+1==n)
      {
        dig2+=a[i][j];
      }
    }
  }
  if(dig1==dig2)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}