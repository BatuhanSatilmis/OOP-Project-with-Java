package batuhan.satilmis.aydin.edu.tr;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Concrete extends  Operation { 

	 StringContainer stringContainer;
	
    @Override
    //işlemlerin gerçekleştiği kısım.
     StringContainer scOps(StringContainer sc) {

        this.stringContainer = sc;

        return  stringContainer;

    }

    
    public  void ExtraWSReplacement()
    {
    	
         String temp =  stringContainer.getManipulatedData();
         
         temp = temp.trim();   
    
         temp=temp.replaceAll("( )+", " "); 
       
         stringContainer.setManipulatedData(temp);

    }

    public void DuplicateWordRemoval()
    {
      
    	String temp =  stringContainer.getManipulatedData();
       
        temp= Arrays.stream(temp.split("\\s+")).distinct().collect(Collectors.joining(" ") );
      
        stringContainer.setManipulatedData(temp);
    }

    public void FindReplaceWord(String source,String dest)
    {
        String temp =  stringContainer.getManipulatedData();
        stringContainer.setManipulatedData(temp.replaceAll(source,dest)); 
    }
}
