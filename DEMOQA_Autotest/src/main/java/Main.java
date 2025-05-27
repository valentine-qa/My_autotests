public class Main {
    public static void main(String[] args) {

        //булевы типы данных (ПО УМОЛЧАНИЮ)
        boolean flag = true;
        flag = false;

        // Целочисленные типы данных
        byte aByte; // -128 до 127 (8 bit) 2^(8-1)
        short aShort; // -32768 до 32767 (16 bit)
        int aInt; // 32 bit -2мрд 147млн... до 2млрд 147млн. (ПО УМОЛЧАНИЮ)
        long aLong; // 64 bit 2^(64-1)

        // Типы данных с плавающей точкой
        float aFloat = 1.0F; //32 bit
        double aDouble = 1.0; //64 bit (ПО УМОЛЧАНИЮ)

        // Прочие
        char aChar = 'a';

        //Операторы
        // 1. Присвоение
        char bChar = 'a';
        // 2. Матеиатические + - * / %
        int result = 5 / 2;
        // 3. Операторы сравнения >, <, >=, <=, !=, ==
        System.out.println(3 > 2);
        // 4. Логические операторы
        // &(И)   &&(Сокращенное И), |(ИЛИ)  ||(Сокращенное ИЛИ) !(НЕ)
        if (3 > 1 & 2 < 4) {
            System.out.println("good");
        }
        // 5. Тернарный оператор
        int value = (methodOne()) ? 10 : 20; //как пишется
        String value1;  // Логика
        if (methodOne()) {
            value1 = "10";
        } else {
            value1 = "20";
        }
        // 6 instanceof
        if (value1 instanceof String) {
            System.out.println("string");
        }

        //Wrapper types
        Integer aIntegerWrapper; // int
        Double aDoubleWrapper; //double
        Character aCharacterWrapper; // char
        String aStringWrapper; //str





        System.out.println("Hello World");
    }

    public static boolean methodOne() {
        return true;
    }
    public static boolean methodSec() {
        return false;
    }
}
