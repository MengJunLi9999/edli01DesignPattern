package org.edli01.designpattern.structuralpatterns.adapter;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.adapter
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete adaptee class for VLC player
 */
public class VlcPlayer implements IAdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file: " + fileName);
  }

  @Override
  public void playMp4(String fileName) {
    // 什麼都不做
  }
} 