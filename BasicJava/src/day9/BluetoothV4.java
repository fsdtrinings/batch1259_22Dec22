package day9;

public class BluetoothV4 implements Bluetooth{

	@Override
	public String shareFile(String fileName, String destinationDevice) {
		// lots of file share code
		
		return "File "+fileName+" transfered to "+destinationDevice;
	}

	
}
