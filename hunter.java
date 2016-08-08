
import java.util.Scanner;

public class mirrr2 
{
	static char findmirror(char d)
	{
		switch(d)
		{
		case 'A':return d;
	    case 'E':return '3';
	    case 'H':return d;
	    case 'I':return d;
	    case 'G':return '4';
	    case 'J':return 'L';
	    case'L':return 'J';
	    case'M':return d;
	    case 'O':return d;
	    case 'S':return '2';
	    case 'T':return d;
	    case'U':return d;
	    case'W':return d;
	    case'X':return d;
	    case'Y':return d;
	    case'Z':return '5';
	    case'1':return d;
	    case'2':return 'S';
	    case'3':return 'E';
	    case'5':return 'Z';
	    case '4':return 'G';
	    case'8':return d;
	    default: return '@'; 
		}
	}
	static String rev(String in)
	   {
	      String res="";
	    for(int i=(in.length())-1;i>=0;i--)
	     {
	        res += in.charAt(i);
	     }
	    return res;
	   } 
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the Words: ");
String input=sc.nextLine();
String array[]=input.split(" ");

for(int i=0;i<array.length;i++)
{
	int palindrome=0,mirror=0;
		if(array[i].equals(rev(array[i])))
		{
			palindrome=1;
		}
		char arr[]=array[i].toCharArray();
		int m=0,j;
		for(j=0;j<(int)((arr.length)/2);j++)
		{
			if(findmirror(arr[j])==arr[arr.length-j-1])
			{
			}else{
				m=1;break;
			}
			
		}
		if(m==0)
		{
			mirror=1;
		}
		if(palindrome ==1 && mirror ==1)
		{
			System.out.println(array[i]+" both PALINDROME AND mirror");	
		}
		else if(palindrome ==1 && mirror ==0)
		{
			System.out.println(array[i]+"IS PALINDROME");	

		}
		else if(palindrome ==0 && mirror ==1)
		{
			System.out.println(array[i]+" IS MIRROR");	
		}
		else if(palindrome==0 && mirror ==0)
		{
			System.out.println(array[i]+" NOT PALINDROME NOT MIRROR");	
		}
	}
	sc.close();
}
	}

