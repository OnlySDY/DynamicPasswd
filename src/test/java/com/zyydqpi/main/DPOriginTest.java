package com.zyydqpi.main;

import org.junit.Test;

import java.util.Date;

/**
 * Created by shall on 17-6-25.
 */

public class DPOriginTest {
    @Test
    public void test(){
       DPOrigin dpOrigin = new DPOrigin();
       String[] keys = new String[3];
       keys[0] = "123";
       keys[1] = "231";
       keys[2] = "321";
       String passwd = dpOrigin.getPasswd(keys, new Date().getTime(), 30L);
       System.out.println(passwd);
    }
}
