import java.util.*;
class Simple{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
int k=n.nextInt();
int temp=k;
int r,q,sum=0;
while(k!=0){
r=k/10;
q=r*r*r;
sum=sum+q;
k=k%10;
}
if(temp==k){
System.out.println("yes");
}
else 
System.out.println("no");
}
}
