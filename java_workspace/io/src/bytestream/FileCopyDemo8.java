package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class FileCopyDemo8 {
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://entertain.v.daum.net/v/20200409091659222?d=y/index.html");
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("c:/files/사냥의시간 뉴스.html");
		
		IOUtils.copy(is, fos);
		
	}

}
