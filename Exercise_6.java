/*
 *
 * created by:
                 Andrew Sotnikov aka Luca Brasi
 * email: andruha.sota@mail.ru
 * 
 */




/***************** Exercise 6 *****************
* Write a program that includes and calls the
* storage() method 
************************************************/

//Чтобы не плодить файлы определил class E06_Storage тут же и вызвал его
//Вообще пример запредельный, учитывая наше незнание понятий ООП...

class E06_Storage {
    
    int storage(String s) {
    
    return s.length() * 2;
    }
    
}



public class Exercise_6 {
	
	public static void main (String args[]) {
        
        E06_Storage storage = new E06_Storage();
        
        System.out.print(storage.storage("i am another string"));
        
        		
	}
}

