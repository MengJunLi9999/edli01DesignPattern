package org.edli01.designpattern.behavioralpatterns.command;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.command
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Command interface
 */
public interface ICommand {
  void execute();
  void undo();
} 