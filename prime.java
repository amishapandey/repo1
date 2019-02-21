import java.util.Scanner;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,c=0;
for(i=1;i<=9;i++){
if(n%i==0){
c=c+1;
}
}
if(n>2){
System.out.println("yes");
}
}
}
