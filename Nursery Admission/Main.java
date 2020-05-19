#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  int i=0,k=0;
  gets(str);
  while(str[i]!='\0')
  {
    i++;
    k++;
  }
  cout<<"The number of letters in the name is "<<k;
}