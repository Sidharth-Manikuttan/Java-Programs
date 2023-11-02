package lab21;
import java.util.*;
public class MatrixMultiplication {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char ch;
int r1,c1,r2,c2,i,j,k;
do
{
System.out.println("Enter row and column of matrix A :");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("Enter row and column of matrix B :");
r2=sc.nextInt();
c2=sc.nextInt();
int[][] A=new int[r1][c1];
int[][] B=new int[r2][c2];
int[][] C=new int[r1][c2];
if(c1==r2)
{
System.out.println("Multiplication is possible ");
System.out.println("Enter the elements of Matrix A :");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)

{
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of Matrix B :");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
B[i][j]=sc.nextInt();
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
System.out.println("The Multiplication of Matrix A and B gives : ");
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
System.out.println("Invalid input \nMultiplication not possible!!!\nColumn of first matrix should be equal to row of second matrix");
}
System.out.println("Do you want to multiply again?(yes/no)");
ch=sc.next().charAt(0);
}while(ch=='y'||ch=='Y');
sc.close();
}
}
