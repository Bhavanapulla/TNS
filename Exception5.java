public class Exception5 {
  
    public static void main(String args[])
    {
  
        // use try-catch block
        // to handle ArrayStoreException
        try {
  
            Object a[] = new Double[2];
  
            // This will throw ArrayStoreException
            a[0] = 4;
        }
  
        catch (ArrayStoreException e) {
  
            // When caught, print the ArrayStoreException
            System.out.println("ArrayStoreException found: "
                               + e);
        }
    }
}