public class Heart1
{
public static void main(String args[])
{
int l=7;
    for(int i=0;i<l-1;i++)
    {
     for(int j=0;j<l;j++)
       {
        if( (i==0&&j%3==0)||(i==5&&i+j!=8)||(i==3&&(j%6==0))||(i==4&&(j<2||j>4)) )
        System.out.print("  ");

        else
        System.out.print(" *");

       }
System.out.println();
    }

}
}
