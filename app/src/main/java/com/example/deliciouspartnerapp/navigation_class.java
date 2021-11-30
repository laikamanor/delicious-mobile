package com.example.deliciouspartnerapp;

import java.util.Arrays;
import java.util.List;

public class navigation_class {

    public List<String> getTitles(boolean isAgent){
        if(isAgent){
            return Arrays.asList("Settings","Sales","Inventory", "Logs");
        }else{
            return Arrays.asList("Settings","Sales","Inventory", "Logs","Count","Production");
        }
    }

    public List<String> getItem(String parentItem, boolean isAgent){
        if(isAgent){
            if(parentItem.equals("Settings")){
                return Arrays.asList("Logout","Cut Off", "Change Password", "Offline Pending Transactions");
            }else if(parentItem.equals("Sales")) {
                return Arrays.asList("Sales", "Shopping Cart");
            }else if(parentItem.contains("Inventory")){
                return Arrays.asList("Received from System Transfer Item", "Manual Transfer Item");
            }else if(parentItem.equals("Logs")){
                return Arrays.asList("Logs");
            }else {
                return null;
            }
        }else{
            if(parentItem.equals("Settings")){
                return Arrays.asList("Logout","Cut Off", "Change Password", "Offline Pending Transactions");
            }else if(parentItem.equals("Sales")) {
                return Arrays.asList("Sales", "Shopping Cart");
            }else if(parentItem.contains("Inventory")){
                return Arrays.asList("Received from SAP", "Received from System Transfer Item","Manual Received Item", "Manual Transfer Item","Item Request","Item Request For Transfer");
            }else if(parentItem.equals("Production")){
//            return Arrays.asList("Item Request","Issue For Production", "Confirm Issue For Production", "Received from Production");
                return Arrays.asList("Production Order List", "Issue For Production", "Confirm Issue For Production", "Received from Production");
            }else if(parentItem.equals("Logs")){
                return Arrays.asList("Logs");
            }else if(parentItem.equals("Count")){
                return Arrays.asList("Inventory Count", "Pull out Request", "Inventory Confirmation");
            }else {
                return null;
            }
        }
    }
}
