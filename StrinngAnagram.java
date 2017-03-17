  class StringAnagram{
	int[] num1=new int[30];
        int[] num2=new int[30];
char[] uniqueArray(char[] temp1,int choice){
	  int n=temp1.length;
	  char[] diffTemp1=new char[n];
	  int k=0,l=0,o=0;
	  int count;
	  int flag;
      for(int i=0;i<n;i++){
             flag=0;
           for(int m=0;m<k;m++) 
           	   if(diffTemp1[m]==temp1[i]) 
           	     flag=1;
          if(flag==1)
           continue; 	      
           	     
        count=1; /*Because  we check two character say p=p therefore p frequency should be two ..this only happens if count begins with 1
          At line 6 line away from this line we check character and at line ,8 line from this line we use count++ */   
	for(int j=i;j<n;j++){
           if(temp1[i]==temp1[j]){
                 flag=0;
             for(int m=0;m<k;m++){
           	   if(diffTemp1[m]==temp1[i]){
           	     flag=1;
           	      count++;
           	    } 
           	  }   
           	 if(flag ==0)	
             diffTemp1[k++]=temp1[i];
             
          }
        }  
       if(choice == 1)
       num1[o++]=count;
        if(choice==2)
         num2[o++]=count;
        
      }   
    
        
      return diffTemp1;
    }
	boolean isAnagram(String str1,String str2){
	   if((str1.length() != str2.length())||(str1.equals(str2)))
	   return false;
     int count=0;
	 char[] temp1=str1.toCharArray();
	 char[] temp2=str2.toCharArray();

	  temp1=uniqueArray(temp1,1);
	 temp2=uniqueArray(temp2,2);
            int check=0;
        for(int i=0;i<temp1.length;i++)
	for(int j=0;j<temp2.length;j++)
         if(temp1[i]==temp2[j] && num1[i]!=num2[j])
             return false;	
	
    return true;
    }	
	
	public static void main(String[] felight){
		String str1="toppp";
		String str2="potpt";
		if(new StringAnagram().isAnagram(str1,str2))
		System.out.println(str1 + " and " + str2 + " is Anagram pair");
		else
		System.out.println(str1 + " and " + str2 + " is not an Anagram pair");	
	}
}
