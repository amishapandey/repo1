import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int i,r,temp,sum=0;
for(i=a+1;i<b;i++){
temp=i;
while(i>0){
r=i%10;
i=i/10;
sum=sum+(r*r*r);}

if(temp==sum){
System.out.println("yes");
}
else 
{
System.out.println("no");
}
}
}
}
