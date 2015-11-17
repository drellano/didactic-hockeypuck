import java.awt.Desktop;
import java.io.File;
public class BrowserOpen {
public static void main(String[]args)
{
	try{
		//File f = new File("C:/Users/Roderick/Desktop/lol.xml");
		File f = new File("C:/Users/Roderick/Desktop/Assignments/EECE/Lectures/Probabilistic System Analysis/Chapter 3/lol.xml");
		Desktop x = Desktop.getDesktop();
		x.open(f);
	}catch(Exception x){
		System.out.println("didn't work");
	}
}
}
