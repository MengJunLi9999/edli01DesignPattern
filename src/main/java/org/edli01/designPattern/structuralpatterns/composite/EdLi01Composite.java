package org.edli01.designpattern.structuralpatterns.composite;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.composite
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Composite Pattern
 */
public class EdLi01Composite {
  public static void main(String[] args) {
    // 創建開發團隊經理
    Manager devManager = new Manager("John Dev Manager", 80000);
    
    // 創建開發人員
    Developer dev1 = new Developer("Tom Developer", 50000);
    Developer dev2 = new Developer("Jerry Developer", 45000);
    
    // 將開發人員加入開發團隊
    devManager.add(dev1);
    devManager.add(dev2);

    // 創建設計團隊經理
    Manager designManager = new Manager("Jane Design Manager", 75000);
    
    // 創建設計師
    Designer designer1 = new Designer("Alice Designer", 48000);
    Designer designer2 = new Designer("Bob Designer", 42000);
    
    // 將設計師加入設計團隊
    designManager.add(designer1);
    designManager.add(designer2);

    // 創建總經理
    Manager generalManager = new Manager("Mike General Manager", 100000);
    
    // 將兩個團隊經理加入總經理下
    generalManager.add(devManager);
    generalManager.add(designManager);

    // 打印整個組織結構
    generalManager.print();
  }
} 