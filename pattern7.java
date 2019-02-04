public class pattern7  
{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1||i==4||j==1||j==4)
{
if(j==1)
System.out.print("a");
 if(j==2)
System.out.print("b");
else if(j==3)
System.out.print("c");
else if(j==4)
System.out.print("d");
}
else
System.out.print(" ");
}		
System.out.println( );
}
}
}
