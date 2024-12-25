package org.edli01.designpattern.behavioralpatterns.command;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.command
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Null Object Pattern implementation for Command
 */
public class NoCommand implements ICommand {
  @Override
  public void execute() {
    // 空實作
  }

  @Override
  public void undo() {
    // 空實作
  }
} 