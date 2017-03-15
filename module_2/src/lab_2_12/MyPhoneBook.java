package lab_2_12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by andrew on 12.03.17.
 */
public class MyPhoneBook {

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
