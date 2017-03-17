class SortedArray{
	

	public String[] sortArrayString(String[] str){
          String temp="";
      for(int i=0;i<str.length-1;i++){
          for(int j=0;j<str.length-1-i;j++){
              if(str[j].compareTo(str[j+1]) > 1){
                  temp=str[j];
                  str[j]=str[j+1];
                  str[j+1]=temp;
              }
          }
      }
      return str;
	}

	public static void main(String[] felight){
	     SortedArray sr=new SortedArray();
         String[] str={"Stair","Check","Chain","Cartoon","Apple"};
	     System.out.println("\n----------------UNSORTED STRING ARRAY--------------------\n");

	     for(String s:str)
	     System.out.print(s + " ");
	     str=sr.sortArrayString(str);
	     System.out.println("\n\n----------------SORTED STRING ARRAY--------------------");

	     for(String s:str)
	     System.out.print(s + " ");
	}
}