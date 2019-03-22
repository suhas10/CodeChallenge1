package com.jlp.format;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jlp.format.TimeConverter;

class TestTimeConverter {

	@Test
	void testForSeconds() {
		assertEquals("1 second", new TimeConverter().formatTime(1));
	}
	@Test
	void testForMinute() {
		assertEquals("1 minute", new TimeConverter().formatTime(60));
		assertEquals("59 minutes",new TimeConverter().formatTime(3540));
	}
	@Test
	void testForDay(){
		assertEquals("1 day", new TimeConverter().formatTime(86400));
		assertEquals("364 days", new TimeConverter().formatTime(31449600));
	}
	@Test
	void testAndComponent() {
		assertEquals("1 minute and 2 seconds", new TimeConverter().formatTime(62));
	}
	@Test
	void testForYear() {
		assertEquals("1 year", new TimeConverter().formatTime(31536000));
	}
	@Test
	void testAllComponents() {
		assertEquals("13 years, 289 days, 18 hours, 17 minutes and 1 second", new TimeConverter().formatTime(435003421));
	}
}
