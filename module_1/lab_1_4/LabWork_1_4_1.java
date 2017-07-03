package module_1.lab_1_4;/*
 *
 * created by:
                 Andrew Sotnikov aka Luca Brasi
 * email: anruha.sota@mail.ru
 * 
 * Write a console program prints on console each of the primitive data 
 * types (byte, short, int, long, float, double, char, boolean). 
 *  
 */




public class LabWork_1_4_1  {
	
	public static void main (String args[]) {
        
        byte byteVal = 100;
        short shortVal = 30_000;
        
        int iVal = 100_000;
        long lVal = 300_000;
        
        float flVal = 3.14f;
        double dVal = 3.1415926535_8979323846_2643383279_5028841971;
        
        char chVal = 'I';
        boolean boolVal = true;
        
        //вывод значений
        
        System.out.println("byte = " + byteVal);
        System.out.println("short = " + shortVal);
        System.out.println("int = " + iVal);
        System.out.println("lomg = " + lVal);
        System.out.println("float = " + flVal);
        System.out.println("double = " + dVal);
        System.out.println("char = " + chVal);
        System.out.println("bool = " + boolVal);
        
		
	}
}

