public class JavainPattern
{
public static void main(String args[])
{
int li=5;
int l=24;
    for(int i=0;i<li;i++)
    {
     for(int j=0;j<l;j++)
       {
  if( (i==0&&(j<9||j>19))||(j==2)||(j==5)||(j==9)||(j==19)||(j==23)||(i==2&&(j>5&&j<9))||(i==2&&j>19)||(j-i==10)||(i+j==18)||(j==1&&i>3) )
        System.out.print(" *");


else
        System.out.print("  ");
       }
System.out.println();
    }

}
}
