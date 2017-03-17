class CommaSeparatedString{
	
	String[] separateString(String str){
       String[] arr=str.split(",");
       return arr;
	}
	public static void main(String[] felight){
	   String str="sajan,gurung";
	   String[] arr=new CommaSeparatedString().separateString(str);
	   for(String a:arr)
	   System.out.println(a);
	}
}