package com.lambdaexpressions.smarthomelighting;
import java.util.* ;

public class SmartLightAutomation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//defining map and storing motions into it 
		Map<String, LightBehavior> behaviors = new HashMap<>() ;
		
		behaviors.put("motion", () -> System.out.println("Lights ON: Motion Detected!")) ;
		behaviors.put("night", () -> System.out.println("Lights DIMMED: Night Mode!")) ;
		behaviors.put("voice", () -> System.out.println("Lights FLASHING: Disco Mode!")) ;
		behaviors.put("dayTime", () -> System.out.println("Lights OFF: Day Time!")) ;
		
		System.out.println("-----SmartHomeAutomation-----") ;
		System.out.println("Available triggers: motion, night, voice, dayTime");
        System.out.println("Type a trigger (or 'exit' to quit):");

        // taking user input for command
        while (true) {
            System.out.print(" > ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("System shutting down...");
                break;
            }

            // Executing behavior if exists
            LightBehavior behavior = behaviors.get(input);
            if (behavior != null) {
                behavior.activate();
            }
            else {
                System.out.println("No behavior defined for: " + input);
            }
        }

        sc.close();

	}

}
