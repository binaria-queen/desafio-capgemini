public class TestaPalavra {
   String palavra1;
   
   public TestaPalavra (String palavra1){
      this.palavra1=palavra1;
   }
   
   
   boolean resolvaProblemaA (String palavra2) {
      boolean sair=false;
      int i=0;
      while (i<palavra1.length() & sair==false){
         char aux=palavra1.charAt(i);
         int c1=0;
         if (palavra1.length()!=palavra2.length()){
            sair=true;
         }
         for (int j=0;j<palavra1.length();j++){
            if (palavra1.charAt(j)==aux)
               c1++;
         }
         int c2=0;
         for (int j=0;j<palavra2.length();j++){
            if (palavra2.charAt(j)==aux)
               c2++;
         }
         if (c1!=c2)
            sair=true;
         i++;   
      }
      return sair;            
   }
                        
      
   public static void main(String[]args) {
      TestaPalavra obj = new TestaPalavra ("cidade");
      boolean sair=obj.resolvaProblemaA ("decida");
      if (sair==true)
         System.out.println("a palavra nao e anagrama");
      else
         System.out.println("a palavra eh anagrama");
      
   } 