public class BookLAB4 {
    private   String author;
   private String [] chapterNames;
   public void setAuthor(String name)
   {
       author = name;
   }
   public String getAuthor(){
       return author;
   }
   public void setChapterNames(String [] chapters){
       chapterNames = chapters;
   }
   public  String [] getChapterNames(){
       return chapterNames;
   }
   BookLAB4(){
       author = "Muzdalfa Zulfiqar";
   }
   BookLAB4(String writer, String [] chapters){
       author = writer;
       chapterNames = chapters;
   }

   Boolean compareBooks(BookLAB4 b1){
       if(author.equals(b1.author)){
           return true;
       }
       else {
           return false;
       }
   }// method ends here
   public String compareChapterNames(BookLAB4 b1){
       int lengthOne = chapterNames.length;
       int lengthTwo = b1.chapterNames.length;
       if(lengthOne>lengthTwo){
         return author;
       }
       else{
           return b1.author;
       }
   }// method ends here
}// class ends here
