package org.edli01.designpattern.structuralpatterns.adapter;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.adapter
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete adaptee class for MP4 player
 */
public class Mp4Player implements IAdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    // 什麼都不做
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file: " + fileName);
  }
} 