package org.edli01.designpattern.behavioralpatterns.command;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.command
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Command Pattern
 */
public class EdLi01Command {
  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();

    // 創建接收者
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");

    // 創建命令
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    // 設置命令
    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remote.setCommand(1, kitchenLightOn, kitchenLightOff);

    // 測試命令
    System.out.println("Testing Living Room Light:");
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();

    System.out.println("\nTesting Kitchen Light:");
    remote.onButtonWasPushed(1);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(1);
  }
} 