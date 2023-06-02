public class Arrow
{
public static void main(String args[])
{
int n=7;
int x=9;
for(int i=0;i<n;i++)
{
for(int j=0;j<x;j++)
{
if((i==3)||(j==5)||(j==6&&i%6!=0)||(i+j==11)||(j-i==5))
System.out.print( " *");
else
System.out.print( "  ");
}
System.out.println();
}


}
}
