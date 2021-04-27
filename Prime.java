public class Prime
{
public static void main(String[] args)
{
int number;
Scanner s=new Scanner(System.in);
System.out.println(" Please insert any number");
number=s.nextInt();
boolean check=true;
for(int i=2;i<number;i++)
{
if(number%2==0)
{
check=false;
break;
}
}
if(check)
{
System.out.println(number+" is prime number");
}
else
{
System.out.println(number+" is not a prime number");
}
}
}
