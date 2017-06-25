package com.zyydqpi.main;

/**
 * Created by shall on 17-6-25.
 */
public class DPOrigin implements IDynamicPasswd {
    public String getPasswd(String[] keys, long time, long interval) {
        int max = 0;
        for(String key : keys){
           max = max < key.length() ? key.length() : max;
        }
        int[] result = new int[max];

        for(String key : keys){
            char[] keyChars = key.toCharArray();
           for(int i = 0; i < keyChars.length; i++){
               result[i] += keyChars[i];
           }
        }

        long second = time / 1000L;
        long count = second / interval;

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < result.length; i++){
            builder.append(count % result[i]);
        }
        return builder.toString();
    }
}
