public class Square5into5
{
public static void main(String args[])
{
int n=5;
int k=1;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==0)
System.out.print(" "+(k+j));
else if(j==0)
System.out.print(" "+(i+k));
else if(i==4)
System.out.print(" "+(n-j));
else if(j==4)
System.out.print(" "+(n-i));
else
System.out.print(" 0");

}
System.out.println();
}

}
}
