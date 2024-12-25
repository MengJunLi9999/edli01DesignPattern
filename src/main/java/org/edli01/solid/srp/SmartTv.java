package org.edli01.solid.srp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.srp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 01:13
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class SmartTv implements ISoftwareManagement, INetworkManagement {
  @Override
  public void enable() {
    System.out.println("Enable.");
  }

  @Override
  public void disable() {
    System.out.println("Disable.");
  }

  @Override
  public void openApp() {
    System.out.println("Open App.");
  }

  @Override
  public void closeApp() {
    System.out.println("Close App.");
  }
}
