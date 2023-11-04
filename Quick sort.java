package Lab22;
import java.util.*;
public class QuickSort {
int partition(int arr[],int low,int high) {
int pivot=arr[high];
int i=low-1;
for (int j=low; j<high; j++)
{
if (arr[j] <= pivot)
{
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
int temp = arr[i+1];
arr[i+1] = arr[high];
arr[high] = temp;
return i+1;
}
void sort(int arr[],int low,int high) {
if(low<high) {
int pivot=partition(arr,low,high);
sort(arr,low,pivot-1);
sort(arr,pivot+1,high);
}
}
void printArray(int arr[]) {
int l=arr.length;
for(int i=0;i<l;i++) {
System.out.println(arr[i]+"\t");
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of array elements:");
int n=sc.nextInt();
System.out.println("Enter the array elements:");
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
QuickSort ob=new QuickSort();
ob.sort(arr, 0, n-1);
System.out.println("The sorted array is : ");
ob.printArray(arr);
}
}
