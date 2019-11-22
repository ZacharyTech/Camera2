package com.android.camera.stats;

/**
 * Created by lize on 2019/11/22
 * Copyright © 2019 GuiLin Zhishen All Rights Reserved.
 */
import android.content.Context;

public class SessionStatsCollector {
    private static SessionStatsCollector sInstance;

    public static SessionStatsCollector instance() {
        if (sInstance == null) {
            sInstance = new SessionStatsCollector();
        }
        return sInstance;
    }

    public void initialize(Context context) {
    }

    public synchronized void previewActive(boolean active) {
    }

    public synchronized void faceScanActive(boolean active) {
    }

    public synchronized void autofocusActive(boolean active) {
    }

    public synchronized void autofocusManualTrigger() {
    }

    public synchronized void autofocusResult(boolean success) {
    }

    public synchronized void autofocusMoving(boolean moving) {
    }

    public synchronized void sessionActive(boolean active) {
    }
}