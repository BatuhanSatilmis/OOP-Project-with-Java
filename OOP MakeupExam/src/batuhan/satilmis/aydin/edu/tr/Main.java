package batuhan.satilmis.aydin.edu.tr;

public class Main {

    public static void main(String[] args) {

        //file data reader oluşturdum.
        FileDataReader dataReader = new FileDataReader();

        //daha sona StringContainer constructor'ının içine  filedata reader'ı attım.
        StringContainer sc = new StringContainer(dataReader);

     
        sc.setManipulatedDataRead(); //dosya okuma işlemini bu methodun içinde yapmıştım.String Contrainer'dan çağırıyorum.
     
        
        System.out.println(sc.checkExistingOperations("boylebirişlemyok")); // false
        System.out.println(sc.checkExistingOperations("ExtraWSReplacement")); // true
        System.out.println(sc.checkExistingOperations("FindReplaceWord")); // true
        System.out.println(sc.checkExistingOperations("DuplicateWordRemoval")); // true

        System.out.println(sc.getManipulatedData() + "--> FileDataReader'da tutulan ana textimiz"); 
        
        //daha sonra Concrete objesi olusturdum.
        Concrete concrete = new Concrete();
        
        // StringContainer'ın sc referansını, içine attım bu sayede art arda manipulasyon yapabiliyorum.
        concrete.scOps(sc);
      
        String case1 = "FindReplaceWord";
        String case2 = "ExtraWSReplacement";
        String case3 = "DuplicateWordRemoval";
       
      
        if(sc.checkExistingOperations(case1))
        {
        	// methodların içerisinde String temp setManipulatedData'ya yollanmıştı çıktıyı da get yaparak aldım.
            concrete.FindReplaceWord("anonim","batuhan");  
       
            System.out.println(sc.getManipulatedData() + "--> kelime degistirildi");
        }

        if(sc.checkExistingOperations(case2))
        {

            concrete.ExtraWSReplacement(); 
         
            System.out.println(sc.getManipulatedData() + "--> bosluklar silindi");
        }

        if(sc.checkExistingOperations(case3))
        {

            concrete.DuplicateWordRemoval();
        
            System.out.println(sc.getManipulatedData() + "--> birden fazla kelime silindi");
        }
  


    }
}
