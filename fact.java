import java.util.Scanner;
class Simple{
public static void main(String args[]){
Scanner scc=new Scanner(System.in);
int n=sc.nextInt();
int c,i,sum=0;
for(i=n;i<=1;i--){
c=i*i-1;
sum=sum+c;
}
System.out.println(sum);
}
}
