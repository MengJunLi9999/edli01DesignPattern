package org.edli01.solid.isp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.isp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 01:50
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class TwoWayPlayer implements IExcellentHitter, IExcellentPitching {
  private String name;

  public TwoWayPlayer(String name) {
    this.name = name;
  }

  @Override
  public void hit() {
    System.out.println("Top-notch hitting.");
  }

  @Override
  public void defense() {
    System.out.println("Top-notch defensive.");
  }

  @Override
  public void pitch() {
    System.out.println("Top-notch pitching.");
  }
}
