package day9;

public class MainClassJava8 {

	public static void main(String[] args) {
		
		MobilePhone onePlus = new MobilePhone();
		onePlus.doCall();
		//String bluetoothNotification = onePlus.shareFile("Music.mp3", "MI-8 Pro", new BluetoothV4()  );
		// String bluetoothNotification = onePlus.shareFile("Music.mp3", "MI-8 Pro", null ); // wrong solution
		
	
		
		Bluetooth b = (fileToShare,destinationPhone)->{
			// code to share file and get status
				return "File t/f via lambda express "+fileToShare+" to phone "+destinationPhone;
		};
		
		
		String bluetoothNotification = onePlus.shareFile("Music.mp3", "MI-8 Pro", b);
		
		
		
		
		System.out.println(bluetoothNotification);
	}
}
