import java.util.Scanner;
public class balenced {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
char c[]=new char[100];
for(int i=0;i<=b.length-1;i++){
	c=b[i].toCharArray();int m=0,n=0;
	for(int j=0;j<=c.length-1;j++){
		if(c[j]>=65&&c[j]<=78||c[j]>=97&&c[j]<=110){
			m++;
		}else if(c[j]>=79&&c[j]<=91||c[j]>=111&&c[j]<=122){
			n++;
		}
	}
	if(m==n){
		System.out.println(b[i]+" is balenced");
	}else{
		System.out.println(b[i]+" is not balenced");
	}
}
	}
}
