import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
 
public class FileComp
{    
    public static void main(String[] args) throws IOException
    {    
    	
    	
    	Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;
		fh = new FileHandler("C:/batchFile/emailNotify/MyLogFile.log");
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);
		
		//String srcFileName="ex1.csv";
		//String desFileName="ex2.csv";
    	
		
		List<String> srcList=new ArrayList<String>();
		srcList.add("ex1.csv");
		srcList.add("sou.txt");
		List<String> desList=new ArrayList<String>();
		desList.add("ex2.csv");
		desList.add("t2.txt");
		
		
		for (int i = 0; i <srcList.size(); i++) {
			fileCompare(logger, srcList.get(i), desList.get(i));   
		}
		//fileCompare(logger, srcFileName, desFileName);  
		
		/*BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\ex\\ex1.csv"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\ex\\ex2.csv"));

		String line1 = reader1.readLine();

		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		
		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;
		fh = new FileHandler("C:/batchFile/emailNotify/MyLogFile.log");
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);

		
		
		while (line1 != null || line2 != null) {
			if (line1 == null || line2 == null) {
				areEqual = false;

				logger.info("Two files have different content. They differ at line:" + lineNum);
				logger.info("File1 has " + ((line1 == null) ? "  " : line1) + " and File2 has "
						+ ((line2 == null) ? "  " : line2) + " at line " + lineNum);

			} else if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;

				logger.info("Two files have different content. They differ at line:" + lineNum);
				logger.info("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);

			}

			line1 = reader1.readLine();
			line2 = reader2.readLine();
			lineNum++;

		}

		if (areEqual) {
			System.out.println("Two files have same content.");
		}
		
		System.out.println(areEqual);
		reader1.close();
		reader2.close();*/
	}
    
    public static void fileCompare(Logger logger,String srcFile,String desFile) throws SecurityException, IOException{
    	BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\ex\\"+srcFile));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\ex\\"+desFile));

		String line1 = reader1.readLine();

		String line2 = reader2.readLine(); 

		boolean areEqual = true;

		int lineNum = 1;
		logger.warning("File Compare between "+srcFile+" and "+desFile+"\n"); 
		while (line1 != null || line2 != null) {
			if (line1 == null || line2 == null) {
				areEqual = false;

				logger.info("Two files have different content. They differ at line:" + lineNum);
				logger.info("File1 has " + ((line1 == null) ? "  " : line1) + " and File2 has "
						+ ((line2 == null) ? "  " : line2) + " at line " + lineNum);

			} else if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;

				logger.info("Two files have different content. They differ at line:" + lineNum);
				logger.info("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);

			}

			line1 = reader1.readLine();
			line2 = reader2.readLine();
			lineNum++;

		}

		if (areEqual) {
			System.out.println("Two files have same content.");
		}
		
		System.out.println(areEqual);
		reader1.close();
		reader2.close();
    }
}