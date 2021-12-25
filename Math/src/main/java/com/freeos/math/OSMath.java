package com.freeos.math;

public class OSMath {

    // Used to load the 'math' library on application startup.
    static {
        System.loadLibrary("math");
    }

    /**
     * A native method that is implemented by the 'math' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}