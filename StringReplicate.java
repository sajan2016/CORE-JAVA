class StringReplicate{
	String replicate(String str,int n){
	   String temp="";
	   for(int i=1;i<=n;i++)
	   temp+=str;

	   return temp;
	}
	public static void main(String[] felight){
		String str="Sajan";
		str=new StringReplicate().replicate(str,3);
		System.out.println(str);
	}
}