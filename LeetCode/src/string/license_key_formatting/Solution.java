package string.license_key_formatting;

/*
 * About
 *
 * Author: soyesdev@GitHub
 * Date  : 2021-08-31
 * URL   : https://leetcode.com/problems/license-key-formatting/
 *
 */

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();

        StringBuilder stringBuilder = new StringBuilder(s);
        int length = stringBuilder.length();

        for (int i = k; i < length; i= i+k) {
            stringBuilder.insert(length - i, '-');
        }
        return stringBuilder.toString();
    }
}
