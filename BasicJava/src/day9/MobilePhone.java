package day9;

import java.time.LocalTime;

public class MobilePhone {

	public void doCall()
	{
		System.out.println("calling ...");
	}
	
	public String shareFile(String fileName,String deviceName,Bluetooth bluetooth)
	{
		String msg = bluetooth.shareFile(fileName, deviceName);
		
		return "INFO LOGS :- "+msg+" - "+LocalTime.now()+" ";
	}
}
