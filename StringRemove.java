class StringRemove{

public String removeCharFromString(String word,char ch){
   char[] temp=word.toCharArray();
   char[] temp1=new char[temp.length];

   for(int i=0,j=0;i<temp.length;i++){
       if(!(""+temp[i]).equalsIgnoreCase(""+ch))
         temp1[j++]=temp[i];
   }	
 StringBuffer sb=new StringBuffer();
 for(char a:temp1)
 	sb.append(a);
   return  sb.toString();
}

public static void main(String[] felight){
  String word="Java is a good language";	
  char ch='a';
  System.out.print(word +" after removing all "+ ch +" becomes ::");
   word=new StringRemove().removeCharFromString(word,ch);
   
    System.out.println(word);
}
	
}