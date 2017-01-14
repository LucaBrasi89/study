/*
 *
 * created by:
                 Andrew Sotnikov aka Luca Brasi
 * email: anruha.sota@mail.ru
 * 
 *  SHOULD DO:
 * 
 *  Write a console program that prints result of each of arithmetic operations 
 * (+, -, /, *, %) for two variables of primitive data types.  
 *  
 */


public class LabWork_1_4_2  {
	
	public static void main (String args[]) {
        
        int iVal1 = 15;
        int iVal2 = 4;
        
        //вывод полученных значений
        //порядок операндов всегда один и тот же, сначала iVal1 потом iVal2       
        
        System.out.println("addition = " + (iVal1 + iVal2));
        System.out.println("substraction = " + (iVal1 - iVal2));
        System.out.println("division = " + (iVal1 / iVal2));
        System.out.println("multiplication = " + (iVal1 * iVal2));
        System.out.println("division with remainder = " + (iVal1 % iVal2));
        
		
	}
}

