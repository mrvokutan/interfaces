package interfaces;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database logland� : " + message);
		
	}

}
