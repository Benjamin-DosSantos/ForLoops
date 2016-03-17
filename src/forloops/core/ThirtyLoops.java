package forloops.core;

import java.util.Random;

public class ThirtyLoops{
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Loops - Objects
	 *	Project Description: a.	The Loop project runs 
	 *  30 loops that display different number combinations 
	 *  and use different math types to count up, count down, 
	 *  multiply, or divide. 
	 * 
	 **/
	
	public static void main(String args[]){
		
		Inclusive0to9:
		for(int counter = 0; counter <= 9; counter++){		// <= allows for the 9 to still be counted
		
			System.out.println("0 to 9 (inclusive): " + counter);	// Prints the string "0 to 9 (inclusive): " then prints the counter Value
			
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		Exclusive0to9:
		for(int counter = 0; counter < 9; counter++){ 		// < stops the 9 from being counted 
			
			System.out.println("0 to 9 (exclusive): " + counter);	// Prints the string "0 to 9 (exclusive): " then prints the counter Value
			
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUp10to20:
		for(int counter = 10; counter <= 20; counter++){ 	// <= counts the 20 so it will be displayed
			
			System.out.println("10 to 20: " + counter);		// Prints the string "10 to 20: " then prints the counter Value
			
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpfromNeg10to10:
		for(int counter = -10; counter <= 10; counter++){	// <= counts the 10 so the 10 will be displayed
			
			System.out.println("-10 to 10: " + counter);
			
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpFrom28to58:
		for(int counter = 28; counter <= 58; counter++){	// <= counts the 58 so 58 will be displayed
			
			System.out.println("28 to 58: " + counter);
			
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpFrom0to20by2:
		for(int counter = 0; counter <= 20; counter += 2){	// <= counts the 20 so 20 will be displayed
			
			System.out.println("0 to 20 by 2's: " + counter);
			
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpFrom0to20by4:
		for(int counter = 0; counter <= 20; counter += 4){	// <= counts the 20 so 20 will be displayed
			
			System.out.println("0 to 20 by 4's: " + counter);
			
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpFrom0to20by5:
		for(int counter = 0; counter <= 20; counter += 5){	// <= counts the 20 so 20 will be displayed
			
			System.out.println("0 to 20 by 5's: " + counter);
			
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpFrom0to20by3:
		for(int counter = 0; counter <= 20; counter += 3){	// <= counts the 20 so 20 will be displayed
			
			System.out.println("0 to 20 by 3's: " + counter);
			
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		CountUpFrom100to200by8:
		for(int counter = 100; counter <= 200; counter += 8){	// <= counts the 200 so 200 will be displayed
			
			System.out.println("100 to 200 by 8's: " + counter);
			
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		Random ran = new Random();	// Main Random Call
		
		int x_rand_50_150 = ran.nextInt(100) + 50;	// creates a random number from 50 to 150
		int rand_count = ran.nextInt(10) + 10;		// Creates a random value from 10 to 20 to count up by
		
		System.out.println("The max value is: " + x_rand_50_150);	// Prints the random x value
		System.out.println("This loop will count up by: " + rand_count);	// prints the random count amount
		
		CountUpFrom0toRandomByRandom:
		for(int counter = 0; counter <= x_rand_50_150; counter += rand_count){	// <= counts the x_rand_50_150 so it will be displayed
			
			System.out.println("0 to 50-150 by 10 - 20: " + counter);	// prints the counter value
			
			
		}
	
		System.out.println("");      // Space For Visual Appearance
		
		int counter_rand = ran.nextInt(100);	// Creates a random integer that acts as a base for all other random
		int rand_x = ran.nextInt(counter_rand);	// creates a random value from 0 to the Counter_rand value
		int rand_y = ran.nextInt(counter_rand) + rand_x; //Creates a random value from 0 to the Counter_rand + the value of rand_x so we know it is larger
		int count_add = ran.nextInt(((rand_y - rand_x) / 10));	// Gets the difference between x and y and divides that by 10 to get the amount to count by.
		
		System.out.println("The starting value of counter is: " + rand_x);	//prints the value of rand_x
		System.out.println("The ending value of counter is: " + rand_y);	//prints the value of rand_y
		System.out.println("This loop will count up by: " + count_add);		//prints the value of Count_add
		
		if(!(count_add >= 1)){
			
			count_add += 1;
			
		}
		
		CountUpFromRandomtoRandomByRandom:
		for(int counter = rand_x; counter <= rand_y; counter += count_add){		// For Loop while rand_x is larger or equal to rand_y
			
			System.out.println("x to y by random: " + counter);		//prints the value of counter
			
		}
	
	System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom10to0Inclusive:
		for(int counter = 10; counter >= 0; counter--){		// 10 to 0 Inclusive
					
			System.out.println("10 to 0 (inclusive): " + counter);	//prints the value of counter
					
			}
		
	System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom10to0Exclusive:
		for(int counter = 10; counter > 0; counter--){		// 10 to 0 Exclusive
					
			System.out.println("10 to 0 (exclusive): " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom20to10By1:
		for(int counter = 20; counter >= 10; counter--){	// 20 to 10 By 1
					
			System.out.println("20 to 10: " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom10toNeg10:
		for(int counter = 10; counter >= -10; counter--){	// 10 to -10 By 1
					
			System.out.println("10 to -10: " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
 		CountUpfromNeg88toNeg58:
		for(int counter = -88; counter <= -58; counter++){		// -88 to -58 By 1
					 
			System.out.println("-88 to -58: " + counter); //prints the value of counter
					 
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom20to0By2:
		for(int counter = 20; counter >= 0; counter -= 2){		// 20 to 0 By 2
					
			System.out.println("20 to 0 (by 2's): " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom20to0by4:
		for(int counter = 20; counter >= 0; counter -= 4){		// 20 to 0 By 4
					
			System.out.println("20 to 0 (by 4's): " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom20to0by5:
		for(int counter = 20; counter >= 0; counter -= 5){		// 20 to 0 By 5
					
			System.out.println("20 to 0 (by 5's): " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom20to0by3:
		for(int counter = 20; counter >= 0; counter -= 3){		// 20 to 0 By 3
					
			System.out.println("20 to 0 (by 3's): " + counter); //prints the value of counter
					
			}
		
System.out.println("");      // Space For Visual Appearance
		
		CountDownfrom20to0by8:
		for(int counter = 200 ; counter >= 100; counter -= 8){		// 200 to 100 By 8
					
			System.out.println("200 to 100 (by 8's): " + counter); //prints the value of counter
					
			}
		
	System.out.println("");      // Space For Visual Appearance
		
		int counter_rand_1 = ran.nextInt(100);
		int rand_x_1 = ran.nextInt(counter_rand_1);
		int count_add_1 = ran.nextInt(counter_rand_1 * 2);
		
		System.out.println("The starting value of counter is: " + rand_x);
		System.out.println("The ending value of counter is: " + rand_y);
		System.out.println("This loop will down up by: " + count_add);
		
		CountDownFromRandomToRandomByRandom:
		for(int counter = rand_x_1; counter >= 0; counter -= count_add_1){
			
			System.out.println("x to y by random: " + counter); //prints the value of counter
			
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		int y_12 = ran.nextInt(100);
		int x_12 = ran.nextInt(100) + (y_12);
		int diff = ((y_12 - x_12) / 10) * -1;
		
		
		System.out.println("The starting value of counter is: " + x_12);
		System.out.println("The ending value of counter is: " + y_12);
		System.out.println("This loop will count down by: " + diff);
		
		
		CountDownFromRandomToNegRandomByRandom:
		for(int counter = x_12; counter >= (y_12); counter -= diff){
			
			System.out.println( "x and y (by random value): " + counter); //prints the value of counter
			
		}
		
		
		
		System.out.println("");      // Space For Visual Appearance
		
		int display_num = 2;		// Number to be displayed
		
		Display10EvenNumbers:
		for(int counter = 10; counter > 0; counter-- ){
			
			System.out.println("10 even numbers: " + display_num);
			
			display_num += 2;		// Adds 2 to the number to be displayed
			
		}

		
		System.out.println("");      // Space For Visual Appearance
		
		int display_num_odd = 1;	// Number to be displayed
		
		Display10OddNumbers:
		for(int counter = 10; counter > 0; counter-- ){
			
			System.out.println("10 odd numbers: " + display_num_odd);
			
			display_num_odd += 2;	// Adds 2 to the number to be displayed
			
		}

		
		
				System.out.println("");      // Space For Visual Appearance
				
				int display_num_ten = 0;	// Number to be displayed
		
				CountingUpBy10:
				for(int counter = 0; counter <= 100; counter += 10 ){
					
					System.out.println("Counting By 10 to 100: " + display_num_ten);
					
					display_num_ten += 10; 	// Adds 10 to the number to be displayed
					
				}
		
				
				
				System.out.println("");      // Space For Visual Appearance
				
				CountingBy5To100:
				for(int counter = 0; counter <= 100; counter += 5 ){
					
					System.out.println("Counting By 5 to 100: " + counter); //prints the value of counter
					
		
					
				}
				
				
				System.out.println("");      // Space For Visual Appearance
				int display_num_doub = 1;	// Number to be displayed
				
				DoubleTheNumber10x:
				for(int counter = 0; counter <= 10; counter++ ){
					
					System.out.println("Double 10 Times: " + display_num_doub);
					
					display_num_doub *= 2;	// Multiply the number by 2 to the number to be displayed
						
					
				}
				
				
				System.out.println("");      // Space For Visual Appearance
				int display_num_half = 1024;	// Number to be displayed
				
				HalfTheNumber10x:
				for(int counter = 0; counter <= 10; counter++ ){
					
					System.out.println("Half The Number Each Time: " + display_num_half);
					
					display_num_half /= 2;		// Divides The Number to be displayed by 2
						
					
				}
				
	}
}
