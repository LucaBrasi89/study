package lab_2_12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by andrew on 12.03.17.
 */

public class MyPhone {

    public MyPhoneBook phoneBook;
    
    public MyPhone() {

        phoneBook = new MyPhoneBook();
    }

    public void switchOn() {

        System.out.println("Loading PhoneBook records...");
        phoneBook.addPhoneNumber("Billy", "066-846-02-15");
        phoneBook.addPhoneNumber("Ann", "050-221-15-64");
        phoneBook.addPhoneNumber("Asuka", "096-00-13");
        phoneBook.addPhoneNumber("Anita", "097-213-41-15");
        phoneBook.addPhoneNumber("Sally", "050-221-19-14");
        phoneBook.addPhoneNumber("John", "063-491-22-67");
        phoneBook.addPhoneNumber("Jerry", "066-846-02-15");
        phoneBook.addPhoneNumber("Kevin", "050-211-15-64");
        phoneBook.addPhoneNumber("Leonard", "096-444-52-13");
        phoneBook.addPhoneNumber("Chris", "097-713-41-15");
        phoneBook.addPhoneNumber("Walter", "050-621-11-14");
        phoneBook.addPhoneNumber("Gustavo", "063-941-27-67");
        System.out.println("OK!\n");
    }

    public void call(int index) {

        System.out.print("Calling to: ");
        System.out.print("Name: " + phoneBook.phoneNumbers[index].name);
        System.out.print(" , phone: " + phoneBook.phoneNumbers[index].phone+"\n");
    }

    class MyPhoneBook {

        public PhoneNumber[] phoneNumbers = new PhoneNumber[0];

        public void addPhoneNumber(String name, String phone) {

            if (phoneNumbers.length <= 10) {

                phoneNumbers = Arrays.copyOf(phoneNumbers, phoneNumbers.length + 1);
                phoneNumbers[phoneNumbers.length - 1] = new PhoneNumber(name,
                        phone);
            } else {
                System.out.println("Массив заполнен");
            }

        }

        public void printPhoneBook() {

            for (PhoneNumber curPhoneNumber : phoneNumbers) {
                System.out.println(curPhoneNumber);
            }

        }

        public void sortByName() {

            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {

                    char[] first = o1.name.toLowerCase().toCharArray();
                    char[] second = o2.name.toLowerCase().toCharArray();
                    int minLength = Math.min(first.length, second.length);
                    for (int i = 0; i < minLength; i++) {
                        if (first[i] > second[i]) {
                            return 1;
                        } else if (first[i] < second[i]) {
                            return -1;
                        }
                    }
                    return -1;
                }
            });
        }


        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {

                    char[] first = o1.phone.toLowerCase().toCharArray();
                    char[] second = o2.phone.toLowerCase().toCharArray();
                    int minLength = Math.min(first.length, second.length);
                    for (int i = 0; i < minLength; i++) {
                        if (first[i] > second[i]) {
                            return 1;
                        } else if (first[i] < second[i]) {
                            return -1;
                        }
                    }
                    return -1;
                }
            });
        }


        class PhoneNumber {

            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {

                this.name = name;
                this.phone = phone;

            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "PhoneNumber{" +
                        "name='" + name + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
            }
        }
    }
}
