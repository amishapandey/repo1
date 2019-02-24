import java.util.*;
class Simple{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
int k=n.nextInt();
int l=n.nextInt();
int i;
for(i=k+1;i<l;i++){
if(i%2!=0){
System.out.print(i+" ");
}
}
}
}
