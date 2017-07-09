class java application
{
public static void main(String[]agrs)
{
scanner obj = new scanner(System.in);
int a = obj.nextInt();
if( a > 0 )
{
System.out.println("positive");
}
if( a == 0 )
{
System.out.println("zero");
}
if( a < 0 )
{
System.out.println("negative");
}
}
}