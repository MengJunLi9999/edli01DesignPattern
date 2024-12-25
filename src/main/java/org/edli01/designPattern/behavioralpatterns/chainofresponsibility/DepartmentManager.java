package org.edli01.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.chainofresponsibility
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:20
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete handler for department manager
 */
public class DepartmentManager extends LeaveHandler {
  public DepartmentManager(String name) {
    super(name);
  }

  @Override
  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() <= 14) {
      System.out.println("Department Manager " + handlerName + " approved " + 
                        request.getEmployeeName() + "'s leave request for " + 
                        request.getLeaveDays() + " days");
    } else {
      System.out.println("Leave request denied: exceeds maximum allowed days");
    }
  }
} 