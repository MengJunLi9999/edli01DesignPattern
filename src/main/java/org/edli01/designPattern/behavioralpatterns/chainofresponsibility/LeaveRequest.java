package org.edli01.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.chainofresponsibility
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:05
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Request class in Chain of Responsibility pattern
 */
public class LeaveRequest {
  private String employeeName;
  private int leaveDays;
  private String reason;

  public LeaveRequest(String employeeName, int leaveDays, String reason) {
    this.employeeName = employeeName;
    this.leaveDays = leaveDays;
    this.reason = reason;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public int getLeaveDays() {
    return leaveDays;
  }

  public String getReason() {
    return reason;
  }
} 