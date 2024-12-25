package org.edli01.designpattern.structuralpatterns.adapter;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.adapter
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Adapter Pattern
 */
public class EdLi01Adapter {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3", "beyond_the_horizon.mp3");
    audioPlayer.play("mp4", "alone.mp4");
    audioPlayer.play("vlc", "far_far_away.vlc");
    audioPlayer.play("avi", "mind_me.avi");
  }
} 