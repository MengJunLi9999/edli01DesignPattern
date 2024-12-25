package org.edli01.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.chainofresponsibility
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Abstract handler in Chain of Responsibility pattern
 */
public abstract class LeaveHandler {
  protected LeaveHandler nextHandler;
  protected String handlerName;

  public LeaveHandler(String name) {
    this.handlerName = name;
  }

  public void setNextHandler(LeaveHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public abstract void handleRequest(LeaveRequest request);
} 