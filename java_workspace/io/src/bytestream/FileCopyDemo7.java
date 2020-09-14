package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class FileCopyDemo7 {
	
	public static void main(String[] args) throws IOException {
		
		URL url =new URL("https://t1.daumcdn.net/news/202004/09/starnews/20200409091700114raeu.jpg");
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("c:/files/사냥의 시간.jpg");
		
		IOUtils.copy(is, fos);
	}

}
