package com.glendroid;

import java.util.Random;

public class Jokes {

    String[] jokes = { "joke1", "joke2", "joke3", "joke4" };

    public String tellJoke() {
        return jokes[new Random().nextInt(4)];
    }
}
