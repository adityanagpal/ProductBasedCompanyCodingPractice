/*
Given a number n, find the highest power of 2 that is smaller than or equal to n.

Examples :
Input : n = 10
Output : 8

Input : n = 19
Output : 16

Input : n = 32
Output : 32
*/
import java.util.Scanner;
class HighestLowerTwoPower
{
public static void main(String args[])
{
System.out.println("Enter the number:");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b=1;
while(a>1)
{
  a=a/2;
  b*=2;
}
System.out.println("The highest power of 2 that is equal and smaller than n is:"+b);
}
}
/*
aditya@aditya-Lenovo-G50-80:~/Coding$ java HighestLowerTwoPower
Enter the number:
16
The highest power of 2 that is smaller than n is:16
aditya@aditya-Lenovo-G50-80:~/Coding$ java HighestLowerTwoPower
Enter the number:
23
The highest power of 2 that is smaller than n is:16
aditya@aditya-Lenovo-G50-80:~/Coding$ 
aditya@aditya-Lenovo-G50-80:~/Coding$ java HighestLowerTwoPower
Enter the number:
45
The highest power of 2 that is smaller than n is:32
aditya@aditya-Lenovo-G50-80:~/Coding$ java HighestLowerTwoPower
Enter the number:
1023
The highest power of 2 that is smaller than n is:512
aditya@aditya-Lenovo-G50-80:~/Coding$ java HighestLowerTwoPower
Enter the number:
456
The highest power of 2 that is smaller than n is:256
*/
