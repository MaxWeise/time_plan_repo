package testPackage;

/* Class to test different ideas without messing up the main program */
class Test_Class {

}

/* Run test here */
class Main {
	public static void main(String[] args) {
		System.out.println(timeDelta(4830));
	} // main
	
	static String timeDelta(int seconds) {
		int hours = (seconds / 3600) % 60;
		int minutes = (seconds / 60) % 60;
		seconds = seconds % 60;
		
		String output = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		return output;
	}
} // Class