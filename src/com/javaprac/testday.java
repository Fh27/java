package com.javaprac;

import javax.swing.*;

public class testday {

    public static void main(String[] args) {
        for (day value : day.values()) {
            System.out.printf(" %s=%s",value,value.gettype());
        }
    }

}
