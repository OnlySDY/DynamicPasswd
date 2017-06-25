package com.zyydqpi.main;

/**
 * Created by shall on 17-6-25.
 */
public class DPServer extends Thread {
    private DPDecorater decorater;
    private boolean isRunning;

    public DPServer(DPDecorater decorater){
        this.decorater = decorater;
        isRunning = true;
    }

    @Override
    public void run() {
        while(isRunning){
            System.out.println(decorater.getPasswd());
            try {
                Thread.sleep(30*1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void interrupt() {
        isRunning = false;
        super.interrupt();
    }

    public static void main(String[] args){
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
