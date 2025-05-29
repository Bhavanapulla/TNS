 class Fibnocci
{
 public static int fibrec(int count)
{
if(count==0)
{
 return 0;
}
if(count==1||count==2)
{ 
return 1;
}
return fibrec(count-1)+fibrec(count-2);
}
public static void main(String args[])
{
 int fiblen=a;
System.out.println("fibonacci series"+fiblen+"number is :\n");
for(int i=0;i<fiblen;i++)
{
 System.out.println(fibrec(i)+" ");
}
}
}