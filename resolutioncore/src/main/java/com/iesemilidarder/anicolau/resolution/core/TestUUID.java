package com.iesemilidarder.anicolau.resolution.core;

import java.util.UUID;

public class TestUUID {

    public static void main(String [] args){


        UUID uuid = UUID.randomUUID();
        //In theory UUID is stored in your DataStore

        //uuidS is the parameter from the from being submitted
        String uuidS = uuid.toString();

        //Create a UUID from the parameter being passed in
        UUID uuid2 = UUID.fromString(uuidS);

        //Compare the UUID created using the form parameter and see if that equals the one
        //in the data store
        if (uuid2.equals(uuid)) {
            System.out.println("Matches");
        } else {
            System.out.println("Does not match");
        }

    }
}