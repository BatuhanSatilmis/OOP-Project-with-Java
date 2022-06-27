package batuhan.satilmis.aydin.edu.tr;

import java.io.FileNotFoundException;
import java.util.HashMap;
public class StringContainer {

  
    enum operationTypes {
        ExtraWSReplacement,
        DuplicateWordRemoval,
        FindReplaceWord
    }
    private String manipulatedData;
     DataReader dataReader;
   
  
    
     HashMap<Integer, operationTypes []> mymap = new HashMap() {
        {
        put(1, operationTypes.DuplicateWordRemoval);
        put(2, operationTypes.ExtraWSReplacement);
        put(3, operationTypes.FindReplaceWord);
        }
    };
   
    //Data reader nesnesi alan bir constructor
    public StringContainer(DataReader dataReader)
    {
        this.dataReader = dataReader;

    }

 
    //operasyon kumesinde işlem var ise true yok ise false donduren method oluşturdum.
    public  boolean checkExistingOperations(String name)
    {
        operationTypes[] opt = mymap.values().toArray(new operationTypes[0]);

      for (int i = 0;  i < opt.length ; i++)
      {
          if(opt[i].name().equals(name))
              return  true;

      }
      return  false;

    }

    public String getManipulatedData() 
    {
        return manipulatedData;
    }

    // yapılanları kaydetmek icin set işlemi yaptım.
    public void setManipulatedData(String manipulatedData) {

        this.manipulatedData = manipulatedData;
     }
    

    // dosyadan veya ağdan okunan veriyi alıyorum ve String manipulatedData'ya eşitledim.
    public void setManipulatedDataRead() 
    {

        try{
            manipulatedData = dataReader.readData();
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
 
    }
   
}
