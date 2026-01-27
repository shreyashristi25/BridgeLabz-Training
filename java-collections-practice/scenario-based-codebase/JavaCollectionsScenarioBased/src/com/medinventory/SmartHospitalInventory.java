package com.medinventory;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class SmartHospitalInventory {

	private static final String DATE_PATTERN = "\\d{2}-\\d{2}-\\d{4}";

    public static boolean isExpired(String expiryDate) {
        if (!expiryDate.matches(DATE_PATTERN)) return true; // invalid format
        try {
            Date exp = new SimpleDateFormat("dd-MM-yyyy").parse(expiryDate);
            return exp.before(new Date());
        } catch (Exception e) {
            return true;
        }
    }

    public static void checkCritical(Item item) throws LowSupplyException {
        if (item.getQuantity() < 10) {
            throw new LowSupplyException("Critical low supply: " + item.getItemName());
        }
    }

}
