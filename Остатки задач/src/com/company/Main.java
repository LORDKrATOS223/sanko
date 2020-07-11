package com.company;

import java.util.*;
import java.math.*;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static int inputInt() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    /* Block 1 */

    public static int TASK_10(int one, int two) {
        return one % two;
    }
    public static double TASK_11(int one, int two) {
        return one * two / 2;
    }
    public static int TASK_12(int chickens, int cows, int pigs) {
        return chickens * 2 + cows * 4 + pigs * 4;
    }
    public static boolean TASK_13(double prob, int prize, int pay) {
        return prob * prize > pay;
    }
    public static void TASK_14(int one, int two, int three) {
        if(one == two + three)
            System.out.println("Сложить");
        else
            if(one == two - three)
                System.out.println("Вычисть");
            else
                if(one == two * three)
                    System.out.println("Умножить");
                else
                    if(one == two / three)
                        System.out.println("Разделить");
                    else
                        System.out.println("None");
        System.out.println();
    }
    public static int TASK_15(char ctoa ) {
        return ctoa;
    }
    public static int TASK_16(int number) {
        int sum = 0;
        for (int i=1; i < number; i++){
            sum = sum + number;
        }
        return sum;
    }
    public static int TASK_17(int one, int two) {
        return one + two -1;
    }
    public static int TASK_18(int [] number) {
        int sum = 0;
        for (int i=0; i<number.length;i++){
            sum += Math.pow(number[i],3);
        }
        return sum;
    }
    public static boolean TASK_19(int one, int two, int three) {
        System.out.println(one * two);
        return (one * two) % three == 0;
    }

    /* Block 2 */

    public static String TASK_20(String array, int n) {
        String sum = new String();
        for (int i = 0; i < array.length(); i++){
            char symbol = array.charAt(i);
            for (int k = 0; k < n; k++){
                sum += symbol;
            }
        }
        return sum;
    }
    public static int TASK_21(int [] number) {
        int min=0, max=0;
        for (int i = 0; i<number.length;i++) {
            if (number[i]>=max)
                max = number[i];
            if (number[i] <= min)
                min = number[i];
        }
        return max - min;
    }
    public static boolean TASK_22(int [] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            sum += number[i];
        }
        return sum % number.length == 0;
    }
    public static int [] TASK_23(int [] number) {
        int [] buf = new int[number.length];
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            sum += number[i];
            buf[i] = sum;
        }
        return buf;
    }
    public static int TASK_24(String array) {
        int index = array.indexOf(".");
        if (index == -1)
            return 0;
        else
            return array.length() - index - 1;
    }
    public static int TASK_25(int n) {
        int fb1 = 1, fb2 = 1, sum =0;
        for (int i = 2; i <= n; i++){
            sum = fb1 + fb2;
            fb1 = fb2;
            fb2 = sum;
        }
        return fb2;
    }
    public static boolean TASK_26(String array) {
        if (array.length() > 5)
            return false;
        for (int i = 0; i < array.length();i++){
            if ((int)array.charAt(i) < 48 || (int)array.charAt(i) > 57){
                return false;
            }
        }
        return true;
    }
    public static boolean TASK_27(String array_1, String array_2) {
        if (array_1.charAt(0) == array_2.charAt(array_2.length()-1) && array_1.charAt(array_1.length()-1) == array_2.charAt(0)){
            return true;
        }
        else
            return false;
    }
    public static boolean TASK_28_Prefix(String array, String pref) {
        for (int i = 0; i < pref.length(); i++){
            if (array.charAt(i) != pref.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean TASK_28_Suffix(String array, String suf) {
        for (int i = 0; i < suf.length(); i++){
            if (array.charAt(array.length() - 1 - i) != suf.charAt(suf.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static int TASK_29(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 != 0){
                sum += 3;
            }
            else{
                sum -= 1;
            }
        }
        return sum;
    }

    /* Block 3 */

    public static int TASK_30(int a, int b, int c) {
        if (b * b - 4 * a * c == 0) {
            return 1;
        }
        if (b * b - 4 * a * c > 0) {
            return 2;
        }
        else{
            return 0;
        }

    }
    public static int TASK_31(String array) {
        int count = 0;
        int index = 0;
        for(int i = 0; i<array.length()-2;i++){
            if (array.charAt(i) == 'z' && array.charAt(i+1) == 'i' && array.charAt(i+2) == 'p'){
                count++;
            }
            if (count == 2){
                index = i;
                break;
            }
        }
        if (index == 0){
            return -1;
        }
        else{
            return index;
        }
    }
    public static boolean TASK_32(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
    public static String TASK_33(String array) {
        if (array.length()<2) {
            return "Несовместимо";
        }
        if (array.charAt(0) == array.charAt(array.length()-1)){
            return "Два-это пара";
        }
        else{
            char buf_first = array.charAt(0);
            char buf_last = array.charAt(array.length()-1);
            return buf_last + array.substring(1,array.length()-1) + buf_first;
        }


    }
    public static boolean TASK_34(String array) {
        if (array.charAt(0) == '#' && array.length() == 6) {
            for (int i = 1; i < array.length(); i++) {
                if (((int) array.charAt(i) >= 48 && (int) array.charAt(i) <= 57) || ((int) array.charAt(i) >= 65 && (int) array.charAt(i) <= 70)) { }
                else {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean TASK_35(int [] number_1, int [] number_2) {
        int count_1 = 0, count_2 = 0;
        int max = 0, max_1, max_2;
        Arrays.sort(number_1);
        Arrays.sort(number_2);
        max_1 = number_1[number_1.length-1];
        max_2 = number_1[number_1.length-1];
        if (max_1 >= max_2){
            max = max_1;
        }
        else{
            max = max_2;
        }
        for (int j = 0; j <= max; j++) {
            for (int i = 0; i < number_1.length; i++) {
                if (number_1[i] == j) {
                    count_1++;
                    break;
                }
            }
            for (int i = 0; i < number_2.length; i++) {
                if (number_2[i] == j) {
                    count_2++;
                    break;
                }
            }
        }
        return count_1 == count_2;
    }
    public static boolean TASK_36(int n) {
        int digit = n * n;
        int del = 0;
        String array = "";
        array += digit;

        if (array.length() % 2 == 0){
            del = array.length() / 2;
        }else{
            del = (array.length() + 1) / 2;
        }

        int part1 = 0, part2 = 0;
        part1 = (int)(digit / Math.pow(10,del));
        part2 = (int)(digit % Math.pow(10,del));

        return n == part1 + part2;
    }
    public static String TASK_37(String array) {
        String [] parts = array.split("1" );
        Arrays.sort(parts);
        return parts[parts.length-1];
    }
    public static int TASK_38(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }

        if (count == 2){
            return n;
        }
        else{
            int digit = n;
            boolean check = false;

            while (check == false) {
                digit++;
                count = 0;
                for (int i = 1; i <= digit; i++) {
                    if (digit % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    check = true;
                }
            }
            return digit;
        }
    }
    public static boolean TASK_39(int n_1, int n_2, int n_3) {
        if (Math.pow(n_1,2)+Math.pow(n_2,2)==Math.pow(n_3,2)){
            return true;
        }
        if (Math.pow(n_2,2)+Math.pow(n_3,2)==Math.pow(n_1,2)){
            return true;
        }
        if (Math.pow(n_1,2)+Math.pow(n_3,2)==Math.pow(n_2,2)){
            return true;
        }
        else{
            return false;
        }

    }

    /* Block 4 */

    public static void TASK_40(int k, String array) {
        String [] arrays = array.split(" ");
        for (int i = 0; i < arrays.length; i++){
            if (arrays[i].length() > k){
                System.out.println("Error");
                return;
            }
        }

        System.out.println(Arrays.toString(arrays));
        String output = "";
        int length = 0;

        for (int i = 0; i < arrays.length; i++){

            length += arrays[i].length();
            if (length <= k){
                output += arrays[i] + " ";
                if (i == arrays.length - 1){
                    System.out.println(output);
                }
            }
            else{
                System.out.println(output);
                output = "";
                i = i - 1;
                length = 0;
            }
        }
    }
    public static String TASK_41(String array) {
        int pass = 0, index = 0, number = 0;
        String [] arr = new String[array.length()];

        for (int i = 0; i < array.length(); i++){
            if(array.charAt(i)=='('){
                pass++;
            }
            if(array.charAt(i)==')'){
                pass--;
            }
            if(pass < 0){
                return "Error";
            }
            if(pass == 0){
                arr[index]="";
                for (int j=number;j<=i;j++) {
                    arr[index] += (char)array.charAt(j);
                }
                number=i+1;
                index++;
            }
        }

        String [] arr_new = new String[index];
        for (int i = 0; i < arr_new.length; i++) {
            arr_new[i]=arr[i];
        }
        return Arrays.toString(arr_new);
    }
    public static String TASK_42_Camel(String array) {
        String output = "";
        for (int i = 0; i<array.length()-1;i++){
            if(array.charAt(i) == '_'){
                output += Character.toUpperCase(array.charAt(i+1));
                i++;
            }
            else {
                output += array.charAt(i);
            }
        }
        if (array.charAt(array.length()-1) != '_'){
            output += array.charAt(array.length()-1);
        }
        return output;
    }
    public static String TASK_42_Snake(String array) {
        String output = "";
        for (int i = 0; i<array.length();i++){
            if((int)array.charAt(i) > 64 && (int)array.charAt(i) < 91){
                output += "_";
                output += Character.toLowerCase(array.charAt(i));
            }
            else {
                output += array.charAt(i);
            }
        }
        return output;
    }
    public static double TASK_43(double begin, double end, double hour, double mult) {
        double sum = 0;
        if (end >= 17) {
            if (17 - begin >= 0) {
                sum += hour * (17 - begin);
            }
            if (end - 17 >= 0) {
                sum += hour * (end - 17) * mult;
            }
        }
        else{
            if (end - begin >=0){
                sum += hour * (end - begin);
            }
        }
        double round = Math.round((sum - (int)sum) * 100);
        round = round / 100;
        return (int)sum + round;
    }
    public static String TASK_44(double mas, String mas_type, double dlin, String dlin_type) {
        if( mas_type == "pounds"){
            mas = mas * 0.454;
        }
        if (dlin_type == "inches"){
            dlin = dlin * 0.025;
        }

        double index = mas / Math.pow(dlin,2);
        double round = Math.round((index - (int)index) * 10);
        round = round / 10;
        index = (int)index + round;

        if (index >= 25){
            return index + " Overweight";
        }
        if (index >= 18.5 && index <=24.9){
            return index + " Normal weight";
        }
        else{
            return index + " Underweight";
        }
    }
    public static String TASK_45(int n) {
        String number = "";
        number += n;
        int mult = 1;
        int count = 0;

        if (number.length()==1){
            return "Because " + number + " is already a one-digit number";
        }

        do {
            mult = 1;
            for (int i = 0; i < number.length(); i++) {
                int dec = 57 - (int) number.charAt(i);
                dec = 9 - dec;
                mult = mult * dec;
            }
            number = "";
            number += mult;
            count++;
        }while (mult > 9);

        return "" + count;
    }
    public static String TASK_46(String array) {
        String output = "";
        int count = 0;
        int index = 0;
        for (int i = 0; i < array.length()-1;i++){
            if (array.charAt(i)==array.charAt(i+1)){
                index = i;
                count++;
            }
            else{
                if (count != 0){
                    count++;
                    output += array.charAt(i) + "*" + count;
                    count = 0;
                }
                else{
                    output += array.charAt(i);
                    count = 0;
                }
            }
        }
        if (count!=0){
            count++;
            output += array.charAt(index) + "*" + count;
        }
        if (array.charAt(array.length()-1)!=array.charAt(array.length()-2)){
            output += array.charAt(array.length()-1);
        }

        return output;
    }
    public static boolean TASK_47(String array_1, String array_2) {
        String [] parts_1 = array_1.split(" " );
        String [] parts_2 = array_2.split(" " );

        String part_1 = "";
        part_1 +=  parts_1[parts_1.length-1];
        part_1 = part_1.toUpperCase();
        String part_2 = "";
        part_2 +=  parts_2[parts_2.length-1];
        part_2 = part_2.toUpperCase();

        String output_1 = "";
        for (int i = 0; i < part_1.length();i++){
            if(part_1.charAt(i) == 'A' || part_1.charAt(i) == 'E' || part_1.charAt(i) == 'I' || part_1.charAt(i) == 'O' || part_1.charAt(i) == 'U'){
                output_1+=(char)part_1.charAt(i);
            }

        }

        String output_2 = "";
        for (int i = 0; i < part_2.length();i++){
            if(part_2.charAt(i) == 'A' || part_2.charAt(i) == 'E' || part_2.charAt(i) == 'I' || part_2.charAt(i) == 'O' || part_2.charAt(i) == 'U'){
                output_2+=(char)part_2.charAt(i);
            }

        }
        if (output_1.length()==output_2.length()){
            for (int i = 0; i<output_1.length();i++){
                if (output_1.charAt(i)!=output_2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean TASK_48(int n1, int n2) {
        String number1 = "";
        number1 += n1;
        String number2 = "";
        number2 += n2;

        int count1 = 1, count2 = 1;

        for(int i = 48;i<58;i++){
            for(int j=0;j<number1.length()-1;j++){
                if(number1.charAt(j) == number1.charAt(j+1) && number1.charAt(j) == i){
                    count1++;
                    if(count1==3){
                        break;
                    }
                }
                else{
                    count1=1;
                }
            }

            for(int j=0;j<number2.length()-1;j++){
                if(number2.charAt(j) == number2.charAt(j+1) && number2.charAt(j) == i){
                    count2++;
                    if(count2==2){
                        break;
                    }
                }
                else{
                    count2=1;
                }
            }

            if (count1==3 && count2 == 2){
                return true;
            }
            else{
                count1 = count2 = 1;
            }

        }

        return false;
    }
    public static String TASK_49(String array, char n) {
        if (array.length() <= 2){
            return "Error";
        }
        String del = "";
        del += n;
        String [] parts = array.split(del);
        String part = "";
        //System.out.println(Arrays.toString(parts));
        for (int i = 0; i < parts.length; i++){
            if (i % 2 != 0){
                part += parts[i];
            }
        }

        char []chars=part.toCharArray();
        //System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        part = "";
        boolean check = true;

        if (chars.length==1){
            return "Unique book | " + chars.length + " | " + Arrays.toString(chars);
        }
        for (int i = 0; i < chars.length-1; i++){
            if (chars[i]!=chars[i+1]){
                part +=chars[i];
            }
            else{
                check = false;
            }
        }
        if (check==false){
            part+=chars[chars.length-1];
        }

        char [] charsNew = part.toCharArray();
        return "Unique book | " + charsNew.length + " | " + Arrays.toString(charsNew);

    }

    /* Block 5 */

    public static String TASK_50_Coder(String array) {
        if (array.length()<1){
            return "Error";
        }
        int [] code = new int[array.length()];
        char [] chars = array.toCharArray();
        for (int i = 0; i<array.length();i++){
            if (i > 0){
                code[i]=(int)array.charAt(i)-(int)array.charAt(i-1);
            }
            else{
                code[0]=(int)array.charAt(i);
            }
        }
        return Arrays.toString(code);
    }
    public static String TASK_50_Decoder(int [] numbers) {
        if (numbers.length<1){
            return "Error";
        }
        int [] code = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if (i > 0){
                code[i]=numbers[i]+numbers[i-1];
                numbers[i]=code[i];
            }
            else{
                code[0]=numbers[i];
            }
        }
        //System.out.println(Arrays.toString(code));
        char [] chars = new char[code.length];
        for (int i = 0; i < code.length;i++){
            chars[i] = (char)code[i];
        }
        return Arrays.toString(chars);

    }
    public static boolean TASK_51(String name, String coord_first, String coord_last) {
        int x_first = 0;
        int y_first = 0;
        int x_last = 0;
        int y_last = 0;
        x_first = 8-(72-coord_first.charAt(0));
        y_first = 8-(72-coord_first.charAt(1));
        x_last = 8-(72-coord_last.charAt(0));
        y_last = 8-(72-coord_last.charAt(1));

        if (name =="rook"){
            if (x_first == x_last || y_first == y_last){
                return true;
            }
            else{
                return false;
            }
        }
        if (name =="knight"){
            if ((Math.abs(x_first-x_last) == 3 && Math.abs(y_first-y_last) == 2) || (Math.abs(x_first-x_last) == 2 && Math.abs(y_first-y_last) == 3)){
                return true;
            }
            else{
                return false;
            }
        }
        if (name =="bishop"){
            if (Math.abs(x_first-x_last) == Math.abs(y_first-y_last)){
                return true;
            }
            else {
                return false;
            }
        }
        if (name =="queen"){
            if (Math.abs(x_first-x_last) == Math.abs(y_first-y_last)){
                //return true;
            }
            else {
                if (x_first == x_last || y_first == y_last) {
                    //return true;
                } else {
                    return false;
                }
            }
        }
        if (name =="king"){
            if ((Math.abs(x_first-x_last) == Math.abs(y_first-y_last)) && (Math.abs(x_first-x_last) == 1) && (Math.abs(y_first-y_last) == 1)){
                return true;
            }
            else {
                if ((x_first == x_last || y_first == y_last) && (Math.abs(x_first-x_last)==1 || Math.abs(y_first-y_last)==1)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        if (name =="panws"){
            if ((Math.abs(x_first-x_last) == Math.abs(y_first-y_last)) && (Math.abs(x_first-x_last) == 1) && (Math.abs(y_first-y_last) == 1)){
                return true;
            }
            else {
                if ((x_first == x_last) && (Math.abs(x_first-x_last)==0 || Math.abs(y_first-y_last)==1)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
    public static boolean TASK_52(String array, String word) {
        int index = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == array.charAt(index)){
                index++;
            }
        }
        //System.out.println(index);
        return index == array.length();

    }
    public static String TASK_53(int [] numbers){
        int sum = 0;
        int mult = 1;

        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        String digit = "";
        digit += sum;
        //System.out.println(digit);

        do {
            for (int i = 0; i < digit.length(); i++) {
                mult = mult * (9 - (57 - (int)digit.charAt(i)));
            }
            digit = "";
            digit += mult;
            //System.out.println(digit);
            mult = 1;
        }while (digit.length()>1);

        return digit;

    }
    public static String TASK_54(String [] array) {
        String word = array[0];
        word = word.toLowerCase();
        String wordNew = "";
        for (int i = 0; i < word.length();i++){
            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                wordNew += (char)word.charAt(i);
            }
        }

        String output = "";
        for (int i=1;i<array.length;i++){
            word = "";
            word += array[i];
            word = word.toLowerCase();

            boolean check = false;
            for (int j = 0; j < word.length();j++){
                if (word.charAt(j)=='a' || word.charAt(j)=='e' || word.charAt(j)=='i' || word.charAt(j)=='o' || word.charAt(j)=='u'){
                    check = false;
                    for (int k = 0; k < wordNew.length();k++){
                        if (word.charAt(j)==wordNew.charAt(k)){
                            check = true;
                        }
                    }
                    if (check != true){
                        break;
                    }
                }

            }
            if (check==true) {
                output += word + " ";
            }
        }
        return array[0] + " " + output;

    }
    public static boolean TASK_55(String n) {
        if (n.length()>=14 && n.length()<19){
        }
        else{
            System.out.println("Error");
            return false;
        }

        String numbers = "";
        numbers += n;
        int  check_digit = (9-(57-numbers.charAt(numbers.length()-1)));
        int [] array_digit = new int [numbers.length()-1];
        for (int i = 0; i<array_digit.length;i++){
            array_digit[i]=(9-(57-numbers.charAt(i)));
        }

        int [] array_digit_reverse = new int[array_digit.length];
        for (int i = 0;i<array_digit_reverse.length;i++){
            array_digit_reverse[i]=array_digit[array_digit.length-1 - i];
        }

        for (int i = 0; i < array_digit_reverse.length; i++){
            if (i % 2 == 0){
                array_digit_reverse[i] = array_digit_reverse[i] * 2;
            }
            if(array_digit_reverse[i]>9){
                array_digit_reverse[i] = 1 + array_digit_reverse[i] % 10;
            }

        }

        int sum = 0;
        for (int i = 0; i <array_digit_reverse.length; i++){
            sum = sum + array_digit_reverse[i];
        }

        int check_sum = 10 - sum % 10;

        return check_sum == check_digit;
        //return Arrays.toString(array_digit) + " " + Arrays.toString(array_digit_reverse);
    }
    public static String TASK_56(int n) {
        String [] level1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String [] level2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                            "eighty", "ninety"};
        String number = "";
        String output = "";
        number += n;
        if (number.length()==1){
            output += level1[n];
        }
        if (number.length()==2){
            if (n<20){
                output += level1[n];
            }
            else{
                output += level2[n / 10] + " " + level1[n % 10];
            }
        }
        if (number.length()==3){
            output += level1[n / 100] + " hundred ";
            if (n % 100 < 20){
                output += level1[n];
            }
            else{
                output += level2[n % 100 / 10] + " " + level1[n % 10];
            }
        }
        return output;
    }
    public static byte[] TASK_57_GetSHA(String input) throws NoSuchAlgorithmException {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
    public static String TASK_57_ToHexString(byte[] hash) {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }
    public static String TASK_58(String array) {
        String [] arrays = array.split(" ");
        String output = "";

        for(int  i = 0; i < arrays.length; i++){
            String word = "";
            word += arrays[i];
            word = word.toLowerCase();

            boolean check = false;

            if (word.charAt(0) == 'a' && word.charAt(1) == 'n' && word.charAt(2) == 'd' && word.length() < 5) {
                output += word + " ";
                check =true;
            }
            if (word.charAt(0) == 't' && word.charAt(1) == 'h' && word.charAt(2) == 'e' && word.length() < 5) {
                output += word + " ";
                check =true;
            }
            if (word.charAt(0) == 'o' && word.charAt(1) == 'f' && word.length() < 4) {
                output += word + " ";
                check =true;
            }
            if (word.charAt(0) == 'i' && word.charAt(1) == 'n' && word.length() < 4) {
                output += word + " ";
                check =true;
            }
            if (check == false){
                word = word.substring(0,1).toUpperCase() + word.substring(1);
                output += word + " ";
            }
        }
        return output;
    }
    public static String TASK_59(int n) {
        int sum = 1;
        int count = 1;
        while (sum < n)
        {
            sum = sum + (6 * count);
            count++;
        }
        if (sum != n){
            return "Error";
        }
        else{
            int size = count * 2 - 1;

            int str = (size - 1) / 2;

            int point = size - count + 1;

            for (int i = 0; i<size; i++){
                for (int j = 0; j<str; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<point; j++){
                    System.out.print("о ");
                }

                System.out.println("");
                if (i < (size - 1) / 2){
                    point++;
                    str--;
                }
                else{
                    point--;
                    str++;
                }
            }
            return "";
        }
    }

    /* Block 6 */

    public static void TASK_60(int n) {
        if (n<2){
            System.out.println("1");
            return;
        }

        int [][] numbers = new int[n][n];
        for (int i=0; i<n;i++){
            for (int j = 0; j<n; j++){
                numbers[i][j]=0;
            }
        }

        int count = 1, buf = 1;
        numbers[0][0]=buf;

        for (int i=1; i<n;i++){
            numbers[i][0]= buf;
            for (int j = 0; j<count; j++){
                numbers[i][j+1]=numbers[i][j]+numbers[i-1][j];
                buf = numbers[i][j]+numbers[i-1][j];
            }
            count++;
        }

        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println(numbers[n-1][n-1]);
    }
    public static String TASK_61_Word(String array) {
        boolean checkUpCase = false;
        String output = "";
        String start = "";
        String end = "";
        int index = 0;

        if (array.charAt(0)=='a' || array.charAt(0)=='A'
                || array.charAt(0)=='e' || array.charAt(0)=='E'
                || array.charAt(0)=='i' || array.charAt(0)=='I'
                || array.charAt(0)=='o' || array.charAt(0)=='O'
                || array.charAt(0)=='u' || array.charAt(0)=='U'){
            output = array + "yay";
        }
        else{
            if (array.charAt(0)>=65 && array.charAt(0)<=90){
                checkUpCase = true;
            }

            for (int i = 0; i < array.length(); i++){
                if (array.charAt(i)=='a' || array.charAt(i)=='A'
                        || array.charAt(i)=='e' || array.charAt(i)=='E'
                        || array.charAt(i)=='i' || array.charAt(i)=='I'
                        || array.charAt(i)=='o' || array.charAt(i)=='O'
                        || array.charAt(i)=='u' || array.charAt(i)=='U') {
                   break;
                }
                else{
                    end += (char)array.charAt(i);
                    //System.out.println(end);
                    index = i;
                }
            }

            output = array.substring(index+1) + end;
            output = output.toLowerCase() + "ay";
            //System.out.println(output);

            if (checkUpCase == true){
                start = "";
                start += (char)output.charAt(0);
                start = start.toUpperCase();

                end = output.substring(1);

                output = "";
                output = start + end;
            }
        }

        return output;
        /*
                String output = "";
        if (array.charAt(0)=='a' || array.charAt(0)=='A'
                || array.charAt(0)=='e' || array.charAt(0)=='E'
                || array.charAt(0)=='i' || array.charAt(0)=='I'
                || array.charAt(0)=='o' || array.charAt(0)=='O'
                || array.charAt(0)=='u' || array.charAt(0)=='U'){
            output = array + "yay";
        }
        else{
            if (array.charAt(0)>=65 && array.charAt(0)<=90){
                output = array.substring(1,2).toUpperCase() + array.substring(2) + array.substring(0,1).toLowerCase() + "ay";
            }
            else{
                output = array.substring(1) + array.substring(0,1).toLowerCase() + "ay";
            }
        }
        return output;
         */
    }
    public static String TASK_61_Sentence(String array) {
        String [] arrays = array.split(" ");
        String output = "";
        String print = "";
        for (int i = 0; i < arrays.length; i++){
            if ((arrays[i].charAt(arrays[i].length()-1)<65 || arrays[i].charAt(arrays[i].length()-1)>90) &&
                    (arrays[i].charAt(arrays[i].length()-1)<97 || arrays[i].charAt(arrays[i].length()-1)>122)){
                output = arrays[i].substring(0,arrays[i].length()-1);
                //System.out.println(output);
                output = TASK_61_Word(output);
                output += arrays[i].charAt(arrays[i].length()-1);
            }
            else{
                output = arrays[i].substring(0);
                //System.out.println(output);
                output = TASK_61_Word(output);
            }
            print += output + " ";
        }
        return print;
    }
    public static void TASK_62(String array) {
        String newArray = "";
        for (int i = 0; i <array.length(); i++){
            if ((array.charAt(i) >= 48 && array.charAt(i) <= 57) || (array.charAt(i) == 44)){
                newArray += (char)array.charAt(i);
            }
        }
        System.out.println(array);
        String [] numbers = newArray.split(",");

        int r =0;
        int g = 0;
        int b =0;
        double a = 0;

        if (numbers.length == 3){
            for (int i = 0; i<numbers.length;i++){
                if(numbers[i].length()==0){
                    System.out.println("Error");
                    return;
                }
            }
            r = Integer.parseInt(numbers[0]);
            g = Integer.parseInt(numbers[1]);
            b = Integer.parseInt(numbers[2]);
            if (r>255 || r < 0 || g > 255 || g < 0 || b > 255 || b < 0){
                System.out.println("Error");
                return;
            }
            System.out.println("True");
        }
        if (numbers.length == 4){
            String rgba = "";
            rgba += numbers[3].charAt(0);
            for (int i = 0; i<numbers.length;i++){
                if(numbers[i].length()==0){
                    System.out.println("Error");
                    return;
                }
            }
            r = Integer.parseInt(numbers[0]);
            g = Integer.parseInt(numbers[1]);
            b= Integer.parseInt(numbers[2]);
            a = Double.parseDouble(rgba);
            if (r>255 || r < 0 || g > 255 || g < 0 || b > 255 || b < 0 || a > 1 || a < 0){
                System.out.println("Error");
                return;
            }
            System.out.println("True");
        }
    }
    public static String TASK_63(String array) {
        String output = "";
        int i = 0, q = 0;

        while (array.charAt(i) != '=') {
            i++;
        }
        q = i - 1;
        String str = array.substring(i-1);
        String[] strs = str.split("&");

        for (i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i] != "" && strs[j] != "") {
                    if (strs[i].charAt(0) == strs[j].charAt(0)) {
                        strs[i] = strs[j];
                        strs[j] = "";
                    }
                }
            }
        }

        output += array.substring(0, q);
        for (i = 0; i < strs.length - 1; i++){
            output += strs[i] + "&";
        }
        while (output.charAt(output.length() - 1) == '&'){
            output = output.substring(0, output.length() - 1);
        }

        return output;
    }
    public static void TASK_64(String array) {
        String [] arrays = array.split(" ");
        String temp = "";

        for (int i = 0; i < arrays.length; i++){
            temp = "";
            for (int j = 0; j < arrays[i].length(); j++){
                if ((arrays[i].charAt(j)>=65 && arrays[i].charAt(j)<=90) || (arrays[i].charAt(j)>=97 && arrays[i].charAt(j)<=122)){
                    temp += (char)arrays[i].charAt(j);
                }
            }
            arrays[i] = "";
            arrays[i] += temp;
        }

        temp = "";
        for (int i = arrays.length-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arrays[j].length() > arrays[j+1].length()){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }

        if (arrays.length>3) {
            Vector<String> output = new Vector<String>();
            int maxLength = arrays[arrays.length - 1].length();
            for (int i = arrays.length; i >= 0; i--) {
                for (int j = 0; j < arrays.length; j++) {
                    if (arrays[j].length() == maxLength) {
                        output.add(arrays[j]);
                    }
                }
                maxLength--;
            }

            //System.out.println(output);
            String [] print = new String[3];
            String word = "";
            for (int i = 0; i < 3; i++){
                word = "";
                word = output.get(i);
                word = word.toLowerCase();
                print[i] = "#"+ word;
            }
            System.out.println(Arrays.toString(print));
        }
        if (arrays.length == 3){
            String [] print = new String[3];
            String word = "";
            if (arrays[0].length() == arrays[1].length() && arrays[0].length() == arrays[2].length()){
                word = arrays[0].toLowerCase();
                print[0] = "#" + word;
                word = arrays[1].toLowerCase();
                print[1] = "#" + word;
                word = arrays[2].toLowerCase();
                print[2] = "#" + word;
            }
            if (arrays[0].length() == arrays[1].length() && arrays[0].length() != arrays[2].length()){
                word = arrays[2].toLowerCase();
                print[0] = "#" + word;
                word = arrays[0].toLowerCase();
                print[1] = "#" + word;
                word = arrays[1].toLowerCase();
                print[2] = "#" + word;
            }
            if (arrays[0].length() != arrays[1].length() && arrays[1].length() != arrays[2].length()){
                word = arrays[2].toLowerCase();
                print[0] = "#" + word;
                word = arrays[1].toLowerCase();
                print[1] = "#" + word;
                word = arrays[0].toLowerCase();
                print[1] = "#" + word;

            }
            System.out.println(Arrays.toString(print));
        }
        if (arrays.length == 2){
            String [] print = new String[2];
            String word = "";
            if (arrays[0].length() != arrays[1].length()){
                word = arrays[1].toLowerCase();
                print[0] = "#" + word;
                word = arrays[0].toLowerCase();
                print[1] = "#" + word;
            }
            else{
                word = arrays[10].toLowerCase();
                print[0] = "#" + word;
                word = arrays[1].toLowerCase();
                print[1] = "#" + word;
            }
            System.out.println(Arrays.toString(print));
        }
        if (arrays.length == 1){
            String [] print = new String[1];
            String word = arrays[0].toLowerCase();
            print [0] = "#" + word;
            System.out.println(Arrays.toString(print));
        }
    }
    public static void TASK_65(int n) {
        int MAX = 2000;
        Vector<Integer> arr = new Vector<Integer>();
        // Функция для вычисления номера ulam
        // толкаем первые 2 два члена последовательности
        // в массиве
        // для дальнейшего расчета
        arr.add(1);
        arr.add(2);
        // цикл для генерации числа Улама
        for (int i = 3; i < MAX; i++) {
            int count = 0;
            // пройти массив и проверить,
            // я могу быть представлен как сумма
            // два разных элемента массива
            for (int j = 0; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(j) + arr.get(k) == i) {
                        count++;
                    }
                    if (count > 1) {
                        break;
                    }
                }
                if (count > 1) {
                    break;
                }
            }
            // Если число равно 2, это означает
            // я могу быть представлен как сумма
            // два разных члена последовательности
            if (count == 1) {
                // я номер улама
                arr.add(i);
            }
        }
        // печатаем n-е число Улама
        System.out.println(arr.get(n - 1));
        /*
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;

            }
            if (n % 2 != 0) {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
        return n;
        */
    }
    public static void TASK_66(String array) {
        boolean check = false;
        String output = "";
        for (int k = 0; k < array.length()-1; k++) {
            String subArray = "";
            subArray += (char)array.charAt(k);
            for (int i = k + 1; i < array.length(); i++) {
                for (int j = 0; j < subArray.length(); j++) {
                    if (array.charAt(i) == subArray.charAt(j)) {
                        //System.out.println(subArray);
                        check = true;
                        break;
                    }
                }
                if (check != true) {
                    subArray += (char) array.charAt(i);
                }
                else{
                    check = false;
                }
            }
            if (subArray.length()>output.length()){
                output = "";
                output += subArray;
            }
        }
        System.out.println(output);
    }
    public static void TASK_67(int digit) {
        if (digit > 3999){
            return;
        }
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,90,100,200,300,400,500,900,1000,2000,3000};
        String [] arrays = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XX","XXX","XL","L",
                "XC","C","CC","CCC","CD","D","CM","M","MM","MMM"};
        String output = "";
        for (int i = numbers.length-1; i >= 0; i--){
            if (numbers[i]<=digit){
                digit=digit-numbers[i];
                output += arrays[i];
            }
        }
        System.out.println(output);
    }
    public static boolean TASK_68(String array) {
        String [] numbers = array.split("=");
        int [] output = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++){
            String replace = numbers[i].trim();
            numbers[i] = "";
            numbers[i] = replace;
        }

        for (int i = 0; i < numbers.length; i++){
            String [] block = numbers[i].split(" ");
            int operation = 0;
            //System.out.println(Arrays.toString(block));

            if (block.length==1){
                operation = Integer.parseInt(block[0]);
            }
            else{
                char oper = block[1].charAt(0);
                //System.out.println(oper);
                if ((int)oper=='+') {
                    operation = Integer.parseInt(block[0]) + Integer.parseInt(block[2]);
                }
                if ((int)oper=='-') {
                    operation = Integer.parseInt(block[0]) - Integer.parseInt(block[2]);
                }
                if ((int)oper=='*') {
                    operation = Integer.parseInt(block[0]) * Integer.parseInt(block[2]);
                }
                if ((int)oper=='/') {
                    operation = Integer.parseInt(block[0]) / Integer.parseInt(block[2]);
                }
            }
            output[i]=operation;
        }
        int check = output[0];
        for (int i = 0; i < output.length; i++){
            if (output[i] != check){
                return false;
            }
        }
        // System.out.println(Arrays.toString(output));
        return true;
    }
    public static boolean TASK_69(int digit) {
        String array = "";
        String numbers = "";
        int one = 0, two = 0, sum = 0;

        array += digit;
        if (array.length() % 2 != 0){
            return false;
        }

        while (array.length() >= 2) {
            for (int i = 0; i < array.length() / 2; i++) {
                one = 9 - (57 - array.charAt(i * 2));
                two = 9 - (57 - array.charAt((i * 2) + 1));
                sum = one + two;
                numbers += sum;
            }
            if (numbers.length() >= 2) {
                array = numbers;
            }
            else{
                break;
            }
            numbers = "";
        }
        System.out.println(array);
        return array.length()==2 && (array.charAt(0)==array.charAt(1));
    }

    public static void main(String[] args) {
        int key = 0;
        int buf = 0;

        do
        {
            do
            {
                System.out.print("[NUMBER OF TASK] ");
                buf = inputInt();
                key = buf / 10;

            } while ((key != 1) && (key != 2) && (key != 3) && (key != 4) && (key != 5) && (key != 6));

            switch (key) {

                case  (1):
                    key = buf % 10;
                    switch (key) {
                        case (0):
                            System.out.println(TASK_10(-9,45) + "\r\n");
                            break;
                        case (1):
                            System.out.println(TASK_11(10,10) + "\r\n");
                            break;
                        case (2):
                            System.out.println(TASK_12(2,3,5) + "\r\n");
                            break;
                        case (3):
                            System.out.println(TASK_13(0.2,50,9) + "\r\n");
                            break;
                        case (4):
                            TASK_14(24,15,9);
                            break;
                        case (5):
                            System.out.println(TASK_15('A') + "\r\n");
                            break;
                        case (6):
                            System.out.println(TASK_16(3) + "\r\n");
                            break;
                        case (7):
                            System.out.println(TASK_17(9,2) + "\r\n");
                            break;
                        case (8):
                            int [] task18 = {1,5,9};
                            System.out.println(TASK_18(task18) + "\r\n");
                            break;
                        case (9):
                            System.out.println(TASK_19(5,2,1) + "\r\n");
                            break;
                    }
                    break;
                case (2):
                    key = buf % 10;
                    switch (key) {
                        case (0):
                            System.out.println(TASK_20("hello",2) + "\r\n");
                            break;
                        case (1):
                            int [] task21 = {10,4,1,4,-10,-50,32,21};
                            System.out.println(TASK_21(task21) + "\r\n");
                            break;
                        case (2):
                            int [] task22 = {1,2,3,4};
                            System.out.println(TASK_22(task22) + "\r\n");
                            break;
                        case (3):
                            int [] task23 = {1,-2,3};
                            System.out.println(Arrays.toString(TASK_23(task23)) + "\r\n");
                            break;
                        case (4):
                            System.out.println(TASK_24("400.55555") + "\r\n");
                            break;
                        case (5):
                            System.out.println(TASK_25(12) + "\r\n");
                            break;
                        case (6):
                            System.out.println(TASK_26("55555") + "\r\n");
                            break;
                        case (7):
                            System.out.println(TASK_27("ratio","orator") + "\r\n");
                            break;
                        case (8):
                            System.out.println(TASK_28_Prefix("automation","auto"));
                            System.out.println(TASK_28_Suffix("automation","tion") + "\r\n");
                            break;
                        case (9):
                            System.out.println(TASK_29(2) + "\r\n");
                            break;
                    }
                    break;
                case (3):
                    key = buf % 10;
                    switch (key) {
                        case (0):
                            System.out.println(TASK_30(1,0,1) + "\r\n");
                            break;
                        case (1):
                            System.out.println(TASK_31("all zip files are zipped") + "\r\n");
                            break;
                        case (2):
                            System.out.println(TASK_32(496) + "\r\n");
                            break;
                        case (3):
                            System.out.println(TASK_33("ala") + "\r\n");
                            break;
                        case (4):
                            System.out.println(TASK_34("#CD5f5C") + "\r\n");
                            break;
                        case (5):
                            int [] number_1 = {1,3,4,4,45};
                            int [] number_2 = {2,5,7};
                            System.out.println(TASK_35(number_1,number_2) + "\r\n");
                            break;
                        case (6):
                            System.out.println(TASK_36(45) + "\r\n");
                            break;
                        case (7):
                            System.out.println(TASK_37("01100001011000") + "\r\n");
                            break;
                        case (8):
                            System.out.println(TASK_38(12) + "\r\n");
                            System.out.println(TASK_38(24) + "\r\n");
                            System.out.println(TASK_38(11) + "\r\n");
                            break;
                        case (9):
                            System.out.println(TASK_39(3,4,5) + "\r\n");
                            break;
                    }
                    break;
                case (4):
                    key = buf % 10;
                    switch (key) {
                        case (0):
                            TASK_40(7,"hello my name is Bessie and this is my essay");
                            System.out.println();
                            break;
                        case (1):
                            System.out.println(TASK_41("((()))(())()()(()())") + "\r\n");
                            break;
                        case (2):
                            System.out.println(TASK_42_Camel("hello_edabit") + "\r\n");
                            System.out.println(TASK_42_Snake("helloEdabit") + "\r\n");
                            break;
                        case (3):
                            System.out.println(TASK_43(13.25,15,30,1.5) + "\r\n");
                            break;
                        case (4):
                            System.out.println(TASK_44(205,"pounds",73,"inches") + "\r\n");
                            break;
                        case (5):
                            System.out.println(TASK_45(39) + "\r\n");
                            break;
                        case (6):
                            System.out.println(TASK_46("77777geff") + "\r\n");
                            break;
                        case (7):
                            System.out.println(TASK_47("Sam I am!", "Green eggs and HAM.") + "\r\n");
                            break;
                        case (8):
                            System.out.println(TASK_48(555223,22355) + "\r\n");
                            break;
                        case (9):
                            System.out.println(TASK_49("AZYWABBCATTTA", 'A') + "\r\n");
                            break;
                    }
                    break;
                case (5):
                    key = buf % 10;
                    switch (key) {
                        case (0):
                            System.out.println(TASK_50_Coder("Hello") + "\r\n");
                            int [] array = { 72, 29, 7, 0, 3 };
                            System.out.print(TASK_50_Decoder(array) + "\r\n");
                            break;
                        case (1):
                            System.out.print(TASK_51("rook", "A8","H8") + "\r\n");
                            System.out.print(TASK_51("bishop", "A7","G1") + "\r\n");
                            System.out.print(TASK_51("queen", "C7","D6") + "\r\n");
                            break;
                        case (2):
                            System.out.print(TASK_52("butl", "beautiful") + "\r\n");
                            break;
                        case (3):
                            int [] numbers = { 1,2,3,4,5,6 };
                            System.out.println(TASK_53(numbers) + "\r\n");
                            break;
                        case (4):
                            String [] arrays1 = {"hoops", "chuff", "bot", "bottom"};
                            String [] arrays2 = {"many", "carriage", "emit", "apricot", "animal"};
                            System.out.println(TASK_54(arrays1));
                            System.out.println(TASK_54(arrays2));
                            break;
                        case (5):
                            System.out.println(TASK_55("1234567890123452"));
                            break;
                        case (6):
                            System.out.println(TASK_56(128));
                            break;
                        case (7):
                            try
                            {
                                System.out.println("HashCode Generated by SHA-256 for:");
                                String s1 = "password123";
                                System.out.println("\n" + s1 + " : " + TASK_57_ToHexString(TASK_57_GetSHA(s1)));
                                String s2 = "Hey dude!";
                                System.out.println("\n" + s2 + " : " + TASK_57_ToHexString(TASK_57_GetSHA(s2)));
                            }
                            catch (NoSuchAlgorithmException e) {
                                System.out.println("Exception thrown for incorrect algorithm: " + e);
                            }
                            break;
                        case (8):
                            System.out.println(TASK_58("jOn SnoW, kINg IN thE noRth."));
                            System.out.println(TASK_58("sansa stark, lady of winterfell."));
                            System.out.println(TASK_58("TYRION LANNISTER, HAND OF THE QUEEN."));
                            break;
                        case (9):
                            System.out.println(TASK_59(7));
                            System.out.println(TASK_59(19));
                            System.out.println(TASK_59(37));
                            System.out.println(TASK_59(38));
                            System.out.println(TASK_59(18));
                            break;
                    }
                    break;
                case (6):
                    key = buf % 10;
                    switch (key) {
                        case (0):
                            TASK_60(5);
                            break;
                        case (1):
                            System.out.println(TASK_61_Word("hello"));
                            System.out.println(TASK_61_Word("hhhello"));
                            System.out.println(TASK_61_Word("Hello"));
                            System.out.println(TASK_61_Word("ello"));
                            System.out.println(TASK_61_Word("Ello"));
                            System.out.println(TASK_61_Sentence("I like to eat honey waffles."));
                            System.out.println(TASK_61_Sentence("Do you think it is going to rain today?"));
                            break;
                        case (2):
                            TASK_62("rgb(0,0,0)");
                            TASK_62("rgb(0,,0)");
                            TASK_62("rgb(255,256,255)");
                            TASK_62("rgba(0,0,0,0.123456789)");
                            break;
                        case (3):
                            System.out.println(TASK_63("https://edabit.com?a=1&b=2&a=2"));
                            break;
                        case (4):
                            TASK_64("How the Avocado Became the Fruit of the Global Trade");
                            TASK_64("Why You Will Probably Pay More for Your Christmas Tree This Year");
                            TASK_64("Hey Parents, Surprise, Fruit Juice Is Not Fruit");
                            TASK_64("Visualizing Science");
                            TASK_64("How the Avocado Became");
                            TASK_64("How the Avocado");
                            break;
                        case (5):
                            TASK_65(4);
                            TASK_65(9);
                            TASK_65(206);
                            break;
                        case (6):
                            TASK_66("abcabcbb");
                            TASK_66("abcabcdeab");
                            break;
                        case (7):
                            TASK_67(10);
                            TASK_67(555);
                            TASK_67(1125);
                            break;
                        case (8):
                            System.out.println(TASK_68("6 * 4 = 24"));
                            System.out.println(TASK_68("18 / 17 = 2"));
                            System.out.println(TASK_68("16 * 10 = 160 = 14 + 120 = 5"));
                            break;
                        case (9):
                            System.out.println(TASK_69( 11211230));
                            System.out.println(TASK_69( 13001120));
                            System.out.println(TASK_69( 23336014));
                            System.out.println(TASK_69( 123312));
                            System.out.println(TASK_69( 11));
                            break;
                    }
                    break;
            }
        } while (key != 100);
    }
}