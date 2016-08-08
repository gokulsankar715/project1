package df1;

import java.io.*;
import  java.util.*;

class UserMainCode
{
	public int howManyPrimeNumsWillGet(int input1){
		// Write code here...
		if(input1>0){
		int k[]=new int[]{1,3,5};
		int tmp=0,n=0;
		for(int i=k.length-1;i>=0;i--){
			for(int j=1;k[i]*j<=input1;j++){
				if((n=howManyPrimeNumsWillGet(input1-k[i]*j))!=-1||(input1-k[i]*j)==0){  
					if(n==-1)
					  	tmp=j;
					  else
						tmp=tmp+j+n; 
						i=0;
						break;
					}
			}
		}
		if(tmp!=0)
			return tmp;
		}
		return -1;
	}
    public static void main(String args[]){
    	UserMainCode obj=new UserMainCode();
    	System.out.println(obj.howManyPrimeNumsWillGet(11));
    }
}
