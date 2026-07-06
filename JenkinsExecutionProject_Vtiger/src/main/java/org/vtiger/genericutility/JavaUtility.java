package org.vtiger.genericutility;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
	/**
	 * This method is used to capture local date and time.
	 * @return String
	 */
public String timeStamp() {
	 return LocalDateTime.now().toString().replace(":", "_");
}
/**
 * This method is used to generate the random number.
 * @param a
 * @return int
 */
public int randomNumber(int a) {
	Random random= new Random();
	return random.nextInt(a);
}
/**
 * This method is used to generate the random data
 * @return String
 */
public  String randomData() {
	 return UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "");
}
}
