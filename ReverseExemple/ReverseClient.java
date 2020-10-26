import java.rmi.*;

public class ReverseClient {

  public static void main (String [] args) {
    //System.setSecurityManager(new RMISecurityManager());
    try{
      ReverseInterface rev = (ReverseInterface) Naming.lookup ("rmi://localhost:1099/MyReverse");
      String result;
      if (args.length==0) {
        System.out.println ("Il vous faut donner un mot à inverser en argument");
        System.exit (0);
      }
      result = rev.reverseString (args [0]);
      System.out.println ("L'inverse de "+args[0]+" est " +result);
    }
    catch (Exception e) {
      System.out.println ("Erreur d'accès à l'objet distant.");
      System.out.println (e.toString());
    }
  }
}
