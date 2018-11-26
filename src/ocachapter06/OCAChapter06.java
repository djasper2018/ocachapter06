package ocachapter06;
import java.lang.ArrayIndexOutOfBoundsException;
import ocachapter06.NoMoreCarrotsException;

public class OCAChapter06 {    
    /**
     *
     * @param args
     * @throws NoMoreCarrotsException
     */
    public static void main(String[] args){
        // TODO code application logic here
        try
        {
            //System.out.println(args[0]);
            //System.out.println(args[1]);
            //int x = 5 / 0;
            //String type = "moose";
            //Object obj = type;
            //int number = (int) obj;
            eatCarrot();
            //throw new NoMoreCarrotsException();   
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array element does not exist");
        }
        catch (ArithmeticException e)
        {
            System.out.println("An arithmetic exception occurred");
        }
        catch (NoMoreCarrotsException e)
        {
            System.out.println("Sad rabbit");
        }
        catch (ClassCastException e)
        {
            System.out.println("A class cast exception occurred");
        }        
        catch (Exception e)
        {
            System.out.println("Some error occurred");
        }
        finally
        {
            System.out.println("Message from the finally block");
        }
    }     
    private static void eatCarrot() throws NoMoreCarrotsException 
    {
         throw new NoMoreCarrotsException();
    }   
}
