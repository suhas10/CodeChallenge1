package com.jlp.format;

public class TimeComponents {
		private String timeComponents,value;
		
		public TimeComponents(String value,String timeComponents) {
			this.timeComponents = timeComponents;
			this.value = value;
		}
		
		public String getTimeComponents() {
			return timeComponents;
		}
		
		public String getValue() {
			return value;
		}
}
