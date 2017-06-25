package com.zyydqpi.main;

import org.junit.Test;

/**
 * Created by shall on 17-6-25.
 */
public class DPServerTest {
    @Test
    public void test(){
        String[] keys = new String[3];
        keys[0] = "123";
        keys[1] = "231";
        keys[2] = "321";
        IDynamicPasswd passwd = new DPOrigin();
        DPDecorater decorater = new DPDecorater(passwd);
        DPDecorater.setKeys(keys);
       DPServer server = new DPServer(decorater);
       server.start();

    }
}
