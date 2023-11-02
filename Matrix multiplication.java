package OOPJLAB;
import java.util.Scanner;
public class MatriceMultiplication {
public static void main(String[] args) {
int i,j,k,r1,c1,r2,c2,ans;
Scanner s=new Scanner(System.in);
do {
System.out.println("Enter the row and column of the first matrix : ");
r1=s.nextInt();
c1=s.nextInt();
System.out.println("Enter the row and column of the second matrix : ");
r2=s.nextInt();
c2=s.nextInt();
int [][]A=new int[r1][c1];
int [][]B=new int[r2][c2];
int [][]C=new int[r1][c2];
if(c1==r2)
{
System.out.println("Matrix multiplication is possible");
System.out.println("Enter the elements of the first matrix : ");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
A[i][j]=s.nextInt();
}
}
System.out.println("Enter the elements of the second matrix : ");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
B[i][j]=s.nextInt();
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
C[i][j]=0;
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
for(k=0;k<c1;k++)
{
C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
}
}
}
System.out.println("The first matrix is : ");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print(A[i][j]+" ");
}
System.out.print("\n");
}
System.out.println("The second matrix is : ");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.print(B[i][j]+" ");
}
System.out.print("\n");
}
System.out.println("The multiplication of the two matrix is : ");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
System.out.print(C[i][j]+" ");
}
System.out.print("\n");
}
}
else
{
System.out.println("The multiplication of the matrices is not possible");
}
System.out.println("Do you want to continue:(y/n)");
ans=s.next().charAt(0);
}while(ans=='Y'||ans=='y');
}
}
