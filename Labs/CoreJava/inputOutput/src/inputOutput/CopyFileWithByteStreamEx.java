package inputOutput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithByteStreamEx {

	public static void main(String[] args) throws IOException {
			FileInputStream in =null;
			FileOutputStream out =null;
			try {
				in = new FileInputStream("C:\\Users\\SakshiKDeshmukh\\Desktop\\Documents\\JAVA\\InputByteStream.txt");
			    out = new FileOutputStream("C:\\Users\\SakshiKDeshmukh\\Desktop\\Documents\\JAVA\\OutputByteStream.txt");
			    int c;
			    while((c = in.read())!= -1) {
			    	System.out.print((char)c);
			    	out.write(c);
			    }
			    System.out.println("FileCopied!!!");
			}
			catch(FileNotFoundException e){
				System.out.println("File Not Found"+e.getMessage());
				e.printStackTrace();
			}
	}

}
