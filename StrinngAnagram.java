  class StringAnagram{
	char[] uniqueArray(char[] temp1){
	  int n=temp1.length;
	  char[] diffTemp1=new char[n];
	  int k=0,l=0;
	  int count=0;
	  int flag;
      for(int i=0;i<n;i++){
     	for(int j=i;j<n;j++){
           if(temp1[i]==temp1[j]){
           	if(count==0){
           	 flag=0;
             for(int m=0;m<k;m++){
           	   if(deffTemp1[m]==temp1[i]){
           	     flag=1;
           	      break;
           	    } 
           	  }   
           	 if(flag ==0)	
             diffTemp1[k++]=temp1[i];
            }
          }
        }   
      }   
     
     for(char a:diffTemp1)
     System.out.print(a);
     System.out.println();
      return diffTemp1;
    }
	boolean isAnagram(String str1,String str2){
	   if((str1.length() != str2.length())||(str1.equals(str2)))
	   return false;
     int count=0;
	 char[] temp1=str1.toCharArray();
	 int n=tmp1.legth;
	 char[] temp2=str2.toCharArray();

	 char[] diffTemp1=uniqueArray(temp1);
	 char[] diffTemp2=uniqueArray(temp2);
	 
     
      return true;
    }	
	
	public static void main(String[] felight){
		String str1="potpt";
		String str2="toppp";
		if(new StringAnagram().isAnagram(str1,str2))
		System.out.println(str1 + " and " + str2 + " is Anagram pair");
		else
		System.out.println(str1 + " and " + str2 + " is not an Anagram pair");	
	}
}
