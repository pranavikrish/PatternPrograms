public class Program
{
public static void main(String args[])
{
String s="PROGRAM";
char a[]=new char[s.length()];
int mid =s.length()/2;
for(int i=0;i<a.length;i++)
{
    for(int j=i;j<a.length;j++)
    {
    System.out.print(" ");
    }
    for(int k=0;k<a.length;k++)
    {
    if(mid==a.length)
{
mid=0;
}
    System.out.print(s.charAt(mid));
mid++;
    }
System.out.println();
}

}
}
