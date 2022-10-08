package julysele22;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CreateFolderAndFile {
	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\Achyutha\\Downloads\\Test");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		File f1=new File("C:\\Users\\Achyutha\\Downloads\\Test\\java.txt");
		boolean createNewFile = f1.createNewFile();
		System.out.println(createNewFile);
		
		FileUtils.write(f1, "welcome to java");//to write in a file
		FileUtils.write(f1, "Learning Selenium",false);// to overwrite in a file
		FileUtils.write(f1, " in Greens Technology",true);//to append
		
		List<String> readLines = FileUtils.readLines(f1);
		System.out.println(readLines);
	}

}
