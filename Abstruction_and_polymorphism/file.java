
import java.io.File; 
import java.io.FileOutputStream;
	public class file {
		public static void main(String[] args) throws IOException {
	    File f=new File("C:\\Users\\SANJIDA\\Music\\a.txt")
	            f.createNewFile();
	            System.out.println("File is created");
	    FileOutputStream fos=new FileOutputStream(f);
	    Scanner sc = new Scanner(System.in);
	            System.out.println("Enter any string: ");
	    String s = sc.nextLine();

	            fos.write(s.getBytes());
	            fos.flush();
	            fos.close();
	    f.write();
	    FileInputStream fi=new FileInputStream(f);
	    int ch;
	            while ( (ch = fi.read()) != -1 ) {
	        System.out.print((char) ch);
	    }
	            fi.close();
	            if(f.delete()) {
	            	System.out.println("File Deleted.");
	            }
	            else {
	            	System.out.println("File isn't deleted.");
	            }
	}
	}
