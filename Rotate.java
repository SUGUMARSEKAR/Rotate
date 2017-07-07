import java.io.*;
public class Git
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 5 digit number: ");
Integer n = Integer.parseInt(br.readLine());
System.out.println("Enter number of times to rotate: ");
Integer k = Integer.parseInt(br.readLine());
String str = n.toString();
char x[] = str.toCharArray();
for(int i=0;i<k;i++)
{
for(int j=x.length-1;j>0;j--)
{
	 char temp = x[j];
     x[j] = x[j-1];
     x[j-1] = temp;
     System.out.print(x[j]);
}
}
}
}
