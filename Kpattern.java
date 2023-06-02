public class Kpattern
{
public static void main(String args[])
{
int n=4;
int m=2;
for(int i=0;i<=n;i++)
{
for(int j=0;j<=m;j++)
{
if((j==0)||(i+j==2)||(i-j==2))
System.out.print("* ");
else
System.out.print("  ");

}
System.out.println();
}


}
}
