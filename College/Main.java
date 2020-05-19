#include<iostream>
using namespace std;
struct College
{
   char name[100]; 
   char city[100]; 
   int year;
   float pass; 
};
int main()
{
  
   int n,i;
   cout<<"Enter the number of colleges\n";
  cin>>n;
  struct College c[n];
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    cout<<"\nEnter year of establishment";
    cin>>c[i].year;
    cout<<"\nEnter pass percentage";
    cin>>c[i].pass;
    cout<<"\n";
  }
  cout<<"Details of colleges";
  for(i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].year;
    cout<<"\nPass percentage:"<<c[i].pass;
  }
}