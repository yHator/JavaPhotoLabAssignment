import java.awt.Toolkit;
import java.awt.Dimension;

public class Main{
	public static void main(String[] args) 
	  {
	    //This code gets the width and height of your screen space available. You can comment it out
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			System.out.println("Width: " + screenSize.getWidth() + " Height: " + screenSize.getHeight());
			
			Picture beach = new Picture("beach.jpg");
	    beach.explore();

      //Picture seagull = new Picture("seagull.jpg");
      //seagull.explore();

      //Picture swan = new Picture("swan.jpg");
      //swan.explore();

      //Pixel p = new Pixel("beach.jpg");
      beach.zeroBlue();
	  }
}