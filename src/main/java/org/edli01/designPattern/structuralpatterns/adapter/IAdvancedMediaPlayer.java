package org.edli01.designpattern.structuralpatterns.adapter;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.adapter
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Adaptee interface for advanced media player
 */
public interface IAdvancedMediaPlayer {
  void playVlc(String fileName);
  void playMp4(String fileName);
} 