import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,c=0;
for(i=2;i<Math.sqrt(num);i++){
if(n%i==0){
c+=1;
}
}
if(c>2){
System.out.println("no");
}
  else
    System.out.println("yes");
}
}
