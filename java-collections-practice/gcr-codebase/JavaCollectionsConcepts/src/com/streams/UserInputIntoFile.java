package com.streams;
import java.io.* ;
import java.util.* ;
public class UserInputIntoFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		try {
			//taking name, age and favourite programming language from user
			System.out.println("Enter your name :") ;
			String name = br.readLine() ;
			
			System.out.println("Enter your age :") ;
			String age = br.readLine() ;
			
			System.out.println("Enter your favourite programming language : ") ;
			String language = br.readLine() ;
			
			//taking file path as user input and creating a new file if it does not exists
			System.out.print("Enter full file path (e.g., C:\\Users\\Shreya\\Documents\\userinfo.txt): ");
            String filePath = br.readLine();
            
            File file = new File(filePath);

            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists, overwriting...");
            }

            //writing user input into a file
            try (FileWriter fw = new FileWriter(file)) {

			fw.write("Name : " + name +"\n") ;
			fw.write("Age : " + age +"\n") ;
			fw.write("Favourite Programming Language : " + language +"\n") ;
            }
			System.out.println("User Information saved successfully !") ;
		}
		catch (IOException e) {
			System.out.println("An Error Occurred!") ;
		}

	}

}
