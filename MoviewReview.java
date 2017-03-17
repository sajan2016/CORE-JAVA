class MoviewReview{
private	final String[] positiveA={"not bad","great","good","amazing","awesome","beautiful","nice","best"};
private final String[] negativeA={"not good","bad","horrible","worst"};
     
	public double rating(String review){
   
         double positive=0,negative=0;
         String[] str=review.split(" ");
         String temp;
   
        for(int i=0;i<str.length;i++){
           if((i  < str.length-1)&&(str[i].equalsIgnoreCase("not"))){
               temp=str[i] +" " + str[i+1];
               positive +=positiveReview(temp);
               negative +=negativeReview(temp);
               i++; //Skip one iteration 
          }
          else{
             positive +=positiveReview(str[i]);
             negative +=negativeReview(str[i]);
          }
        }  
   return ((positive * 5)+ (negative *4))/(positive + negative);
   }
 int positiveReview(String str){
     for(String temp:positiveA){
        if(temp.equalsIgnoreCase(str))
        return 1;
     }
     return 0;
}

 int negativeReview(String str){
      for(String temp:negativeA){
        if(temp.equalsIgnoreCase(str))
        return 1;
     }
     return 0;     
 }
   public static void main(String[] felight){
   	  MoviewReview mr=new MoviewReview();
       String review="Taken is a nice and awesome movie .It is one of the best movie Ever made.It has a beautiful and amazing storyline .Though the movie is great Its ending is not good , It is worst for children as it has lots of violence . The violence part is not good at all . For elders and young people the violence is not bad at all.";
       System.out.println("Taken Movie Rating is:: " + mr.rating(review) + "/5");
   }
}