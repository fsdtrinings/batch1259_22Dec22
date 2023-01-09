package day9;

public class MainClass {

	public static void main(String[] args) {
		
		MobilePhone onePlus = new MobilePhone();
		onePlus.doCall();
		//String bluetoothNotification = onePlus.shareFile("Music.mp3", "MI-8 Pro", new BluetoothV4()  );
		// String bluetoothNotification = onePlus.shareFile("Music.mp3", "MI-8 Pro", null ); // wrong solution
		
		
		
		String bluetoothNotification = onePlus.shareFile("Music.mp3", "MI-8 Pro", new Bluetooth() {
			
			@Override
			public String shareFile(String fileName, String destinationDevice) {
				
				return "New Way to Share File "+fileName+" transfered to "+destinationDevice;
			}
		} );
		
		
		
		
		System.out.println(bluetoothNotification);
	}
}
