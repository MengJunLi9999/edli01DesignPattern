package org.edli01.designpattern.structuralpatterns.bridge;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.bridge
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Abstraction class for remote control
 */
public class RemoteControl {
  protected IDevice device;

  public RemoteControl(IDevice device) {
    this.device = device;
  }

  public void togglePower() {
    if (device.isEnabled()) {
      device.disable();
    } else {
      device.enable();
    }
  }

  public void volumeDown() {
    device.setVolume(device.getVolume() - 10);
  }

  public void volumeUp() {
    device.setVolume(device.getVolume() + 10);
  }

  public void channelDown() {
    device.setChannel(device.getChannel() - 1);
  }

  public void channelUp() {
    device.setChannel(device.getChannel() + 1);
  }
} 