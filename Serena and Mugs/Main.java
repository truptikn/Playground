#include<iostream>
using namespace std;
int main()
{
  int n,c,sum=0;
  cin>>n>>c;
  int mugs[n];
  for(int i=0;i<n;i++)
  {
    cin>>mugs[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+mugs[i];
  }
  if(sum<=c)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}
