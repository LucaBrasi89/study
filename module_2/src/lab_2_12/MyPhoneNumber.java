package lab_2_12;

import java.util.Arrays;

/**
 * Created by andrew on 12.03.17.
 */
public class MyPhoneNumber {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[0];

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

    static class PhoneNumber {

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
