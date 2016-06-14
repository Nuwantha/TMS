
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.common_classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gimhani
 */
public class PatternChecker {

    /*This class contains all the methods needed in data verifications.*/
    public static String checkNIC(String nicText) {
        int result = 0;
        if (nicText.length() == 10) {
            Pattern pattern = Pattern.compile("[0-9]{9}[VX]");
            Matcher matcher = pattern.matcher(nicText);
            if (matcher.find()) {
            } else {
                nicText = nicText.substring(0, nicText.length() - 1);
            }
        } else if (nicText.length() < 10) {
            Pattern pattern = Pattern.compile("[0-9]{" + nicText.length() + "}");
            Matcher matcher = pattern.matcher(nicText);
            if (matcher.find()) {
            } else {
                nicText = nicText.substring(0, nicText.length() - 1);
            }

        } else if (nicText.length() > 10) {
            nicText = nicText.substring(0, nicText.length() - 1);
        }
        return nicText;
    }

    public static boolean checkNICdirect(String nicText) {

        if (nicText.length() == 10) {
            Pattern pattern = Pattern.compile("[0-9]{9}[VX]");
            Matcher matcher = pattern.matcher(nicText);
            if (matcher.find()) {
                return true;
            } else {
                return false;
            }
        } else if (nicText.length() != 10) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean checkIndexNumdirect(String indexText) {

        if (indexText.length() == 6) {
            Pattern pattern = Pattern.compile("[0-9]{6}");
            Matcher matcher = pattern.matcher(indexText);
            if (matcher.find()) {
                return true;
            } else {
                return false;
            }
        } else if (indexText.length() != 6) {
            return false;
        } else {
            return false;
        }
    }

    public static String checkIndex(String indexText) {
        if (indexText.length() == 6) {
            Pattern pattern = Pattern.compile("[0-9]{6}");
            Matcher matcher = pattern.matcher(indexText);
            if (matcher.find()) {
            } else {
                indexText = indexText.substring(0, indexText.length() - 1);
            }
        } else if (indexText.length() < 6) {
            Pattern pattern = Pattern.compile("[0-9]{" + indexText.length() + "}");
            Matcher matcher = pattern.matcher(indexText);
            if (matcher.find()) {
            } else {
                indexText = indexText.substring(0, indexText.length() - 1);
            }

        } else if (indexText.length() >6) {
            indexText = indexText.substring(0, indexText.length() - 1);
        }
        return indexText;
    }

    public static boolean checkResultdirect(String resultText) {

        if (resultText.length() == 3 || resultText.length() == 2 || resultText.length() == 1) {
            Pattern pattern = Pattern.compile("[0-9]{" + resultText.length() + "}");
            Matcher matcher = pattern.matcher(resultText);
            if (matcher.find()) {
                return Integer.parseInt(resultText) <= 200;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static String checkResult(String resultText) {
        if (resultText.length() <= 3) {
            Pattern pattern = Pattern.compile("[0-9]{" + resultText.length() + "}");
            Matcher matcher = pattern.matcher(resultText);
            if (!matcher.find()) {
                resultText = resultText.substring(0, resultText.length() - 1);
            }

        } else if (resultText.length() > 3) {
            resultText = resultText.substring(0, resultText.length() - 1);
        }
        return resultText;
    }

    public static String checkTelNum(String telText) {
        int result;
        if (telText.length() == 1) {
            Character c = telText.charAt(0);
            Pattern pattern = Pattern.compile("0");
            Matcher matcher = pattern.matcher(c.toString());
            if (!matcher.find()) {
                telText = telText.substring(0, telText.length() - 1);
            }
        } else if (telText.length() == 2 | telText.length() == 3) {
            Pattern pattern = Pattern.compile("[0][1-9]{" + (telText.length() - 1) + "}");
            Matcher matcher = pattern.matcher(telText);
            if (!matcher.find()) {
                telText = telText.substring(0, telText.length() - 1);
            }
        } else if (telText.length() > 3 & telText.length() <= 10) {
            Pattern pattern = Pattern.compile("[0][1-9]{2}[0-9]{" + (telText.length() - 3) + "}");
            Matcher matcher = pattern.matcher(telText);
            if (!matcher.find()) {
                telText = telText.substring(0, telText.length() - 1);
            }
        } else if (telText.length() > 10) {
            telText = telText.substring(0, telText.length() - 1);
        }
        return telText;
    }

    public static boolean checkTelNumdirect(String telText) {
        if (telText.length() == 10) {
            Pattern pattern2 = Pattern.compile("[0][1-9]{2}[0-9]{" + (telText.length() - 3) + "}");
            Matcher matcher2 = pattern2.matcher(telText);
            if (!matcher2.find()) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public static boolean birthdayChecker(String birthday) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy");
        Date testdate = null;
        try {
            testdate = sdf.parse(birthday);
        } catch (ParseException e) {
            System.out.println("Invalid Date Format");
            return false;
        }
        if (!sdf.format(testdate).equals(birthday)) {
            System.out.println("Invalid Date Format");
            return false;
        }
        return true;
    }

    public static String checkDecimal(String text) {
        int result;
        for (int i = 1; i < text.length() + 1; i++) {
            Character c = text.charAt(i - 1);
            Pattern pattern = Pattern.compile("[0-9.]");//[a-z A-Z]
            Matcher matcher = pattern.matcher(c.toString());
            if (matcher.find()) {
                result = 1;
            } else {
                result = 0;
            }
            if (result == 0) {
                text = text.substring(0, i - 1);
            }
        }
        return text;

    }

    public static boolean checkDecimaldirect(String text) {

        Pattern pattern = Pattern.compile("[0-9.]");//[a-z A-Z]
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean checkIntegerdirect(String text) {

        Pattern pattern = Pattern.compile("[0-9]");//[a-z A-Z]
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean checkStringdirect(String text) {

        Pattern pattern = Pattern.compile("^[\\p{L} .'-]+$");//[a-z A-Z]
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static String checkstring(String text) {
        int result;
        for (int i = 1; i < text.length() + 1; i++) {
            Character c = text.charAt(i - 1);
            Pattern pattern = Pattern.compile("^[\\p{L} .'-]+$");//
            Matcher matcher = pattern.matcher(c.toString());
            if (matcher.find()) {
                result = 1;
            } else {
                result = 0;
            }
            if (result == 0) {
                text = text.substring(0, i - 1);
            }
        }
        return text;

    }

    public static String checkPrice(String text) {
        int result = 0;
        for (int i = 1; i < text.length() + 1; i++) {
            Character c = text.charAt(i - 1);
            Pattern pattern = Pattern.compile("[.]");
            Matcher matcher = pattern.matcher(c.toString());
            if (matcher.find()) {
                result = 1;
            } else {
                result = 0;
            }
        }
        if (result == 0) {
            text = text.concat(".00");
        }
        return text;
    }

    public static String checkInteger(String text) {
        int result;
        for (int i = 1; i < text.length() + 1; i++) {
            Character c = text.charAt(i - 1);
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(c.toString());
            if (matcher.find()) {
                result = 1;
            } else {
                result = 0;
            }
            if (result == 0) {
                text = text.substring(0, i - 1);

            }
        }
        return text;

    }

    public static String checkDate(String text) {
        int result;
        for (int i = 1; i < text.length() + 1; i++) {
            Character c = text.charAt(i - 1);
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(c.toString());
            if (matcher.find()) {
                result = 1;
            } else {
                result = 0;
            }
            if (result == 0) {
                text = text.substring(0, i - 1);

            }
        }
        return text;

    }

    public static String getBirthday(String id) {

        int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 1900 + Integer.parseInt(id.substring(0, 2));
        int d = Integer.parseInt(id.substring(2, 5));
        if (d > 500) {
            d = d - 500;
        }
        int mo = 0, da = 0;
        int days = d;
        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }
        String text = "" + year + "-" + "" + mo + "-" + "" + da;
        return text;

    }
}
