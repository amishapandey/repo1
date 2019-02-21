import java.util.Scanner;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int u=sc.nextInt();
int temp,rem,sum=0;
temp=u;
while(u!=0){
rem=u%10;
sum=sum*10+rem;
u=u/10;
}
if(temp==sum)
System.out.println("yes");
else
System.out.println("no");
}
}


