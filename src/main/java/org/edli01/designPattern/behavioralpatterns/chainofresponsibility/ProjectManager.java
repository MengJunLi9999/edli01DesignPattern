package org.edli01.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.chainofresponsibility
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:15
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete handler for project manager
 */
public class ProjectManager extends LeaveHandler {
  public ProjectManager(String name) {
    super(name);
  }

  @Override
  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() <= 7) {
      System.out.println("Project Manager " + handlerName + " approved " + 
                        request.getEmployeeName() + "'s leave request for " + 
                        request.getLeaveDays() + " days");
    } else if (nextHandler != null) {
      System.out.println("Project Manager " + handlerName + " forwards request to " + 
                        nextHandler.getClass().getSimpleName());
      nextHandler.handleRequest(request);
    }
  }
} 