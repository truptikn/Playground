#include<iostream>
#include<string.h>
using namespace std;
struct Student { 
    char name[50]; 
    char department[20];
    int yop;
    float cgpa;
}; 

int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct Student*)p)->name, 
                  ((struct Student*)q)->name); 
} 

int main() 
{ 
    int i = 0, n; 
    cout<<"Enter the number of students";
    cin>>n;
    struct Student arr[n]; 
    for(i=0;i<n;i++)
    {
      cout<<"\nEnter the details of student "<<i+1;
      cout<<"\nEnter name";
      cin>>arr[i].name;
      cout<<"\nEnter department";
      cin>>arr[i].department;
      cout<<"\nEnter year of study";
      cin>>arr[i].yop;
      cout<<"\nEnter cgpa";
      cin>>arr[i].cgpa;
    }
    qsort(arr, n, sizeof(struct Student), comparator); 
    cout<<"\nDetails of students";
    for (i = 0; i < n; i++) { 
        cout<<"\nStudent "<<i+1;
        cout<<"\nName:"<<arr[i].name;
        cout<<"\nDepartment:"<<arr[i].department;
        cout<<"\nYear of study:"<<arr[i].yop;
        cout<<"\nCGPA:"<<arr[i].cgpa;
    } 
  
    return 0; 
} 