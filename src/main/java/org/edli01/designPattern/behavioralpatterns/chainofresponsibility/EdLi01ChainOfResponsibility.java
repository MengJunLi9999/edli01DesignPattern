package org.edli01.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.chainofresponsibility
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:25
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Chain of Responsibility Pattern
 */
public class EdLi01ChainOfResponsibility {
  public static void main(String[] args) {
    // 建立處理者鏈
    LeaveHandler teamLeader = new TeamLeader("John");
    LeaveHandler projectManager = new ProjectManager("Mike");
    LeaveHandler departmentManager = new DepartmentManager("Sarah");

    teamLeader.setNextHandler(projectManager);
    projectManager.setNextHandler(departmentManager);

    // 創建請假請求
    LeaveRequest request1 = new LeaveRequest("Tom", 2, "Personal matters");
    LeaveRequest request2 = new LeaveRequest("Jerry", 5, "Family vacation");
    LeaveRequest request3 = new LeaveRequest("Bob", 10, "Medical treatment");
    LeaveRequest request4 = new LeaveRequest("Alice", 15, "Long vacation");

    // 處理請求
    System.out.println("Processing request 1:");
    teamLeader.handleRequest(request1);
    
    System.out.println("\nProcessing request 2:");
    teamLeader.handleRequest(request2);
    
    System.out.println("\nProcessing request 3:");
    teamLeader.handleRequest(request3);
    
    System.out.println("\nProcessing request 4:");
    teamLeader.handleRequest(request4);
  }
} 