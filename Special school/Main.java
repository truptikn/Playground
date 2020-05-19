#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
void strrev(char *str)
{
 int i=0,j=0;
 while(str[j+1]) j++;
 while(i < j)
 {
   char temp=str[i];
   str[i]=str[j];
   str[j]=temp;
   i++;
   j--;
 }
}
int main()
{
  char str[50],str1[50];
  gets(str);
  gets(str1);
  strrev(str);
  if(strcmp(str1,str)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
