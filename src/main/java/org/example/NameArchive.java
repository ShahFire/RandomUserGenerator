package org.example;

import org.apache.commons.lang3.ArrayUtils;

public class NameArchive {
    private static String[] maleNames = {"Jacob", "Oliver", "Riley", "Jack", "Alfie", "Harry", "Charlie", "Dylan", "William", "Mason"};
    private static String[] femaleNames = {"Amelia", "Ava", "Mia", "Lily", "Olivia"};
    private static String[] anyNames = ArrayUtils.addAll(maleNames, femaleNames);

    public static String[] getMale(){
        return maleNames;
    }
    public static String[] getFemale(){
        return femaleNames;
    }
    public static String[] getAny(){
        return anyNames;
    }

}
