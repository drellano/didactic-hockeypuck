
import java.awt.Desktop;
import java.io.File;

public class BrowserOpen {
	public void open (String location)
	{
		try{
			File f = new File(location);
			Desktop x = Desktop.getDesktop();
			x.open(f);
		}catch(Exception x){
			System.out.println("Desktop could no open the file");
		}
	}
}
