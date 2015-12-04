package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by marlonrouse on 2/12/2015.
 */
public class TestBackEnd extends AndroidTestCase {

    public void testBackEndResponse() {
        try {
            EndpointsAsyncTask echoTask = new EndpointsAsyncTask();
            echoTask.execute("non-null test");
            String echo = echoTask.get(10, TimeUnit.SECONDS);
            assertNotNull(echo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}