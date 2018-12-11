package paceCalculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PaceCalculator {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in miles, and duration in hh:mm:ss format");
		
		//vars
		float distance, pace, paceSecond;
		int durationHour, durationMinute, durationSeconds, durationTime;
		int paceMinute;
		String duration;
		
		//Distance is a float, duration in hh:mm:ss is taken as string
		distance = input.nextFloat();
		duration = input.next();
		
		//convert string duration into Hour, Minute and seconds as integers, assuming proper input
		durationHour = Integer.parseInt(duration.substring(0,2));
		durationMinute = Integer.parseInt(duration.substring(3,5));
		durationSeconds = Integer.parseInt(duration.substring(6,8));
		
		// calculate pace based on seconds (seconds + minutes as seconds + hours as seconds)
		durationTime = durationSeconds + durationMinute * 60 + durationHour * 60 * 60;
		pace = durationTime / distance;
		
		// convert seconds to minutes and seconds
		paceMinute = (int) (pace / 60);
		paceSecond = pace - paceMinute * 60;
		
		// formatting as mm:ss.ss
		DecimalFormat formattingObject = new DecimalFormat("00.00");
		DecimalFormat formattingObject1 = new DecimalFormat("00");
		
		// print line
		System.out.print("Runner pace: " + formattingObject1.format(paceMinute) + ":" + formattingObject.format(paceSecond) + " per mile");
		
		input.close();
				
		
	}
}