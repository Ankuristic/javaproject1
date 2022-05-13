package java8functionalinterface;

import java.util.function.Function;

public class Fifunction {


	 public static void main(String[] args) {
	  
	  // convert centigrade to fahrenheit
	  Function<Integer,Double> centigradeToFahrenheitInt = x -> new Double((x*9/5)+32);
	  System.out.println("value of temperature in fahrenheit: "+centigradeToFahrenheitInt.apply(100));
}
}
