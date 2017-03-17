class EmailValidator{
	
	public boolean emailCheck(String email){

	   char[] temp=email.toCharArray();
	   int dotCount=0,atCount=0,k=0;

	   if(temp[0]=='.')
         return false;
	     // '.' cannot be the first character of an email address
	   
	   for(int i=0;i<temp.length;i++){
             if(temp[i]=='.')
             dotCount++;

            if((temp.length - 1)>i && (temp[i]== '.') && (temp[i + 1] == '.'))
            return false;
     //There can be many dots before @ but they cannot be consecutive.

            if(atCount > 1)
            return false;
     //There can only be one @ sign

             if(atCount == 1 && dotCount >1)
             return false;
      //After @ there can only be one dot .

            if(temp[i] == '@'){
                 k=i+1;  
                 //position of character after @ sign
                dotCount=0; atCount++;
               } 
	   }
	   if( atCount == 0 || dotCount == 0)
	   return false;

    /*if there is no @ sign return false OR if there is @ sign but there is no . after @ then also return false */

       StringBuilder sb=new StringBuilder();
	    int i;
	    for( i=k;temp[i]!='.';i++)
	    sb.append(""+temp[i]);
       k=i + 1; 
       /*
       postion of character after the last . example 
       sajan@gmail.com :k=12
       */ 
        int flag=0;
        String[] domain={"yahoo","gmail","hotmail","felight"};
        // set of Valid domain
        String str=new String();
        str=sb.toString();

       for( i=0;i<domain.length;i++){
           if(str.equalsIgnoreCase(domain[i])){
            flag=1;
             break;
            }
       }
       if(flag == 0)
       return false;

      StringBuilder sb1=new StringBuilder();
      for( i=k;i<temp.length;i++){
        sb1.append("" + temp[i]);
      }
      str=sb1.toString();
      if(str.equalsIgnoreCase("com")||str.equalsIgnoreCase("in"))
      return true;
      else
       return false;
	}
public static void main(String[] felight){
	String email="sajanmylife@hotmail.in";

	System.out.println(new EmailValidator().emailCheck(email));
}

}