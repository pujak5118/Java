import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
int b=0,i,j;
System.out.println("enter the no to be checked");
int a=new Scanner(System.in).nextInt();
j=a;
while(a!=0)
{
i=a%10;
b=b+(i*i*i);
a=a/10;
}
if(j==b)
{
System.out.println("armstrong no.");
}
else
{
System.out.println("not a armstrong no.");
} 
}
}