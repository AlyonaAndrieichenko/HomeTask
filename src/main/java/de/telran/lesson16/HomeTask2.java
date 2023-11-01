package de.telran.lesson16;

//Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
//
//1) Берем исходную строку с данными из cars
//{"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//Если значение второго параметра равно null с каждой пары, то параметр не должен
// попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
//Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';

import java.util.Arrays;
import java.util.Objects;

public class HomeTask2 {
    public static void main(String[] args) {
        String car = "{\"model\", \"V-60\", \"country\", \"Germany\", \"city\", \"Berlin\", \"year\", \"null\", \"active\", \"true\"}";
        String users ="{\"id\", \"1\", \"country\", \"null\", \"city\", \"Helsinki\", \"year\", \"null\"}";
        String[] user = users.split("\", \"");
//        System.out.println(Arrays.toString(user));
//        printBottomLine(user);
        String[] cars = car.split("\", \"");
        System.out.println(Arrays.toString(cars));
        printBottomLine(cars);
    }

        public static void printBottomLine(String[] str){
        StringBuilder resultStr = new StringBuilder("SELECT * FROM cars WHERE ");
        boolean firstTimeCondition=true;
        for (int i = 0; i < str.length; i+=2) {
            String str1 = str[i];
            String str2 = str[i+1];
            if (Objects.equals(str2, "null")|| Objects.equals(str2, null)){
                continue;
            }
            if (!firstTimeCondition) {
                resultStr.append(" AND ");
            }
            resultStr.append(str1).append(" = ").append(str2);
            firstTimeCondition = false;
        }
        System.out.println(resultStr);
    }

}
