package ass;
import java.util.Scanner;

public class as5 {

	public static void main(String[] args) {


		        int a,n,c=0,b,i,r,l=0;
		        Scanner s=new Scanner(System.in);
		        System.out.println("Enter the value");
		        a=s.nextInt();
		        int n1=a;
		        System.out.println("Enter the n value");
		        a=s.nextInt();
		        while(a>0)
		        {
		         a=a/10;
		         c++;
		            }
		            int c1=c-1;
		            int c2=c1;
		        int[] temp=new int[c];
		        while(n1>0)
		        {
		            r=n1%10;
		            temp[c1]=r;
		            c1--;
		            n1=n1/10;
		        }
		        for(i=0;i<c;i++)
		        {
		            for(int j=i;j<c;j++)
		            {
		                if(temp[i]<temp[j])
		                {
		                   b=temp[j];
		                   temp[j]=temp[i];
		                   temp[i]=b;
		                }
		                }
		            }
		     
		            for(int p=0;p<c-a;p++)
		            {
		                l=l*10+temp[c2];
		                c2--;
		                
		            }
		             System.out.println(l);     
		     }
		
	}


