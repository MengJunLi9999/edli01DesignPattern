package org.edli01.designpattern.structuralpatterns.adapter;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.adapter
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Adapter class for media player
 */
public class MediaAdapter implements IMediaPlayer {
  private IAdvancedMediaPlayer advancedMusicPlayer;

  public MediaAdapter(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMusicPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMusicPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMusicPlayer.playVlc(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMusicPlayer.playMp4(fileName);
    }
  }
} 