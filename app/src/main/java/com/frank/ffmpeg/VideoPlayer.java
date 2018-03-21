package com.frank.ffmpeg;

/**
 * 视频播放器
 * Created by frank on 2018/2/1
 */
public class VideoPlayer {

    static {
        System.loadLibrary("media-handle");
    }

    public native int play(String filePath, Object surface);
    public native int setPlayRate(float playRate);

}
