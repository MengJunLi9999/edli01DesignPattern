package org.edli01.designpattern.behavioralpatterns.command;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.command
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Invoker class - Remote Control
 */
public class RemoteControl {
  private ICommand[] onCommands;
  private ICommand[] offCommands;
  private ICommand undoCommand;

  public RemoteControl() {
    onCommands = new ICommand[7];
    offCommands = new ICommand[7];

    ICommand noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
} 