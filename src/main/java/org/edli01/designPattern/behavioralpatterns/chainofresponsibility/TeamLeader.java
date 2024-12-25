package org.edli01.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.chainofresponsibility
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:10
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete handler for team leader
 */
public class TeamLeader extends LeaveHandler {
  public TeamLeader(String name) {
    super(name);
  }

  @Override
  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() <= 3) {
      System.out.println("Team Leader " + handlerName + " approved " + 
                        request.getEmployeeName() + "'s leave request for " + 
                        request.getLeaveDays() + " days");
    } else if (nextHandler != null) {
      System.out.println("Team Leader " + handlerName + " forwards request to " + 
                        nextHandler.getClass().getSimpleName());
      nextHandler.handleRequest(request);
    }
  }
} 