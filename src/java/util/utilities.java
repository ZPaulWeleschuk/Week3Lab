/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author 843876
 */
public class utilities {
    public static boolean isNumber(String ageString) {// put in util package
        try {
            Integer.parseInt(ageString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
}
}