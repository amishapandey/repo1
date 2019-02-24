import java.util.*;
class Simple{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
int k=n.nextInt();
int l=n.nextInt();
int j,i,c=0;
for(i=k+1;i<l;i++){
for(j=2;j<Math.sqrt(i);j++){
if(i%j==0){
c+=1;
}
if(c<2)
System.out.print(i+" ");
}
}
}
}
