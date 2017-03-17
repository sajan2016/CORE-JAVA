class StringAnagram{
	boolean isAnagram(String str1,String str2){
	   if((str1.length() != str2.length())||(str1.equals(str2)))
	   return false;
      int check=0;
	char[] temp1=str1.toCharArray();
	char[] temp2=str2.toCharArray();
	for(char a:temp1)
	for(char b:temp2){
         if(a == b)
         check++;  
	 }	
	 if(check == temp1.length)
	 	return true;
	 else
	 	return false;
	}
	public static void main(String[] felight){
		String str1="pot";
		String str2="topd";
		if(new StringAnagram().isAnagram(str1,str2))
		System.out.println(str1 + " and " + str2 + " is Anagram pair");
		else
		System.out.println(str1 + " and " + str2 + " is not an Anagram pair");	
	}
}