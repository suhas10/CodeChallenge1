package com.jlp.format;

import java.util.ArrayList;

public class TimeConverter
{
	private String output="";
	private Integer remainingSeconds,years,days,hours,minutes;

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String formatTime(Integer inputSeconds) 
	{
		this.remainingSeconds = inputSeconds;

		if(inputSeconds == 0 ) 
		{
			output += "none";
		}	
		else if( inputSeconds > 0)
		{
			years = remainingSeconds / (3600 * 24 * 365);
			remainingSeconds = remainingSeconds - (years * 3600 * 24 * 365) ;

			days = remainingSeconds / (3600 * 24);
			remainingSeconds = remainingSeconds - (days* 3600 * 24) ;

			hours = remainingSeconds /3600 ;
			remainingSeconds = remainingSeconds - (hours *3600);

			minutes = remainingSeconds/60 ;
			remainingSeconds = remainingSeconds - (minutes * 60);
			
			ArrayList<TimeComponents> timeList = new ArrayList<TimeComponents>();

			if(years > 0 )
			{
				if(years == 1){
					timeList.add(new TimeComponents(years.toString(), "year" ));
				}
				else {
					timeList.add(new TimeComponents(years.toString(), "years" ));
				}
			}//year
			if(days > 0 ) {

				if(days == 1){
					timeList.add(new TimeComponents(days.toString(), "day" ));
				}
				else {
					timeList.add(new TimeComponents(days.toString(), "days" ));
				}
			}//days

			if(hours > 0 ) {
				if(hours == 1){
					timeList.add(new TimeComponents(hours.toString(), "hour" ));
				}
				else {
					timeList.add(new TimeComponents(hours.toString(), "hours" ));
				}
			}//hours

			if(minutes > 0 ) {
				if(minutes == 1){
					timeList.add(new TimeComponents(minutes.toString(), "minute" ));
				}
				else {
					timeList.add(new TimeComponents(minutes.toString(), "minutes" ));
				}
			}//minutes


			if(remainingSeconds > 0) {

				if(remainingSeconds == 1) 
				{
					timeList.add(new TimeComponents(remainingSeconds.toString(), "second" ));
				}
				else 
				{
					timeList.add(new TimeComponents(remainingSeconds.toString(), "seconds" ));
				}
			}//seconds
			
			if(timeList.size() == 1 ) {
				output += timeList.get(0).getValue() + " ";
				output += timeList.get(0).getTimeComponents();
			}

			else{
				int temp = timeList.size(); //will be using for the insertion of 'and' between time components.
				for(int i =0 ; i < timeList.size() ; i++){	
					output += timeList.get(i).getValue()+" ";
					output += timeList.get(i).getTimeComponents();
					if( i< timeList.size()-2 ){
						output += ", "; // ',' as separator between time components. 
					}
					temp--;
					if(temp == 1)
					{
						output += " and ";
					}
				}//for
			
			}//else
			
		}//main else if
		
		else {
			System.out.println("Input Seconds has Negative value");
		}
		
		return output;
	}//formatTime()
	
}//class TimeConverter
