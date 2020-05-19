#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char str[50],str1[50];
  gets(str);
  gets(str1);
  if(strcmp(str,str1)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}