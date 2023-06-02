public class Xpattern
{
public static void main(String args[])
{
int m=8;
int n=1;
int k=9;
for(int i=0;i<=m;i++)
{
    if(i<5)
    {
    for(int j=0;j<=m;j++)
      {
      if((i-j==0)||(i+j==m))
      System.out.print(" "+n);
      else
      System.out.print(" ");
      }
    }
    else if(i>=5)
    {
    for(int j=0;j<=m;j++)
      {
      if((i-j==0)||(i+j==m))
      System.out.print(" "+k);
      else
      System.out.print(" ");
      }
    }
n++;
k--;
    System.out.println();
}


}
}
