#include<iostream>
using namespace std;
int main()
{
  int i,j,row,col,m,n,sum=0;
  cin>>m>>n;
  int row_arr[m];
  int mat[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>mat[i][j];
    }
  }
  int z=0;
  for(row=0;row<m;row++)
  {
    sum=0;
    for(col=0;col<n;col++)
    {
      sum+=mat[row][col];
    }
    cout<<sum<<"\n";
    row_arr[z++]=sum;
  }
  return 0;
}