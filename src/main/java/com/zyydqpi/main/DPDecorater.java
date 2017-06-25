package com.zyydqpi.main;

import java.util.Date;

/**
 * Created by shall on 17-6-25.
 */
public class DPDecorater {
    private IDynamicPasswd dynamicPasswd;
    private static String[] keys;
    public DPDecorater(IDynamicPasswd dynamicPasswd){
        this.dynamicPasswd = dynamicPasswd;
    }

    public static void setKeys(String[] keys){
        DPDecorater.keys = keys;
    }

    public String getPasswd(String[] keys){
        return this.dynamicPasswd.getPasswd(keys, new Date().getTime(), 30L);
    }

    public String getPasswd(){
        return this.dynamicPasswd.getPasswd(keys, new Date().getTime(), 30L);
    }
}
