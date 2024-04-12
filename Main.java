class Main{
         public static void language(){
                  System.out.print("german");
         }
         public static void speak(String lang){
             if (lang.equals("german")) {
                System.out.print(", I speak german");
         }else{ 
           System.out.println(", I dont speak german");
           
         }
         }  
         public static void main(String[] args){
           language();
           speak("german");
         }
   }