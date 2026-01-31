package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        return false;
    }
    public String reverse(String s) {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i);
        }
        return n;
    }
}
