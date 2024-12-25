package org.edli01.designpattern.structuralpatterns.adapter;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.adapter
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete class using the adapter
 */
public class AudioPlayer implements IMediaPlayer {
  private MediaAdapter mediaAdapter;

  @Override
  public void play(String audioType, String fileName) {
    // 內建支援播放 mp3 音樂
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file: " + fileName);
    }
    // mediaAdapter 提供播放其他格式
    else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
    } else {
      System.out.println("Invalid media. " + audioType + " format not supported");
    }
  }
} 