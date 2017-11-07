import java.io.File;

public class Lab11 {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\joshu\\eclipse-workspace\\Lab 11\\Backup\\APOLLO");
		
		if(hasCorrectNum(folder))
			System.out.println("The folder conatins the correct number of files");
		else
			System.out.println("The folder does not contain the correct number of files");
	}
	
	public static boolean hasCorrectNum(File folder) {
		File[] listFiles = folder.listFiles();
		
		String firstFile = listFiles[0].getName();
		int numFiles = Integer.parseInt(firstFile.substring(firstFile.length()-5, firstFile.length()-4));
		
		if(numFiles == listFiles.length)
			return true;
		else
			return false;
	}
}
