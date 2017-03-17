class StringPalindrome{
	boolean isPalindrome(String str){
		char[] temp=str.toCharArray();
		 
		for(int i=temp.length-1,j=0;i>=temp.length/2;i--,j++){
			if(temp[j]!=temp[i])
				return false;
		}
		 return true;
	}
	public static void main(String[] args){
	   StringPalindrome sp=new StringPalindrome();
	   String str="pqqdp";
	   if(sp.isPalindrome(str))
	   System.out.println(str + " is Palindrome");
	   else
	   System.out.println(str + " is  not Palindrome");
	}
}