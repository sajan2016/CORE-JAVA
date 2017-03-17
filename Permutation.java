class Permutation{

	public void print(char[] str){
		for(char a:str)
		System.out.print(a);
			System.out.println();
	}
	void printPermutation(String str){
	    char[] str1=str.toCharArray();
	    char temp;
	    for(int i=0;i<str1.length;i++){
	    	  print(str1);
	       for(int j=1;j<str1.length-1;j++){
              temp=str1[j];
              str1[j]=str1[j+1];
              str1[j+1]=temp;
                print(str1);
	       }
	          temp=str1[0];
              str1[0]=str1[1];
              str1[1]=temp;
	    }
	}

	public static void main(String[] felight){
		String str="ABCD";
		System.out.println("All Permutation of \""+str+"\":");
		new Permutation().printPermutation(str);
	}
}