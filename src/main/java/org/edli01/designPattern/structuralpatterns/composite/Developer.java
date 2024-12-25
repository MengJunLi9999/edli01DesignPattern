package org.edli01.designpattern.structuralpatterns.composite;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.composite
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Leaf class for developer
 */
public class Developer implements IEmployee {
  private String name;
  private double salary;

  public Developer(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  @Override
  public void add(IEmployee employee) {
    // 葉子節點不支援此操作
  }

  @Override
  public void remove(IEmployee employee) {
    // 葉子節點不支援此操作
  }

  @Override
  public IEmployee getChild(int i) {
    // 葉子節點不支援此操作
    return null;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getPosition() {
    return "Developer";
  }

  @Override
  public double getSalary() {
    return salary;
  }

  @Override
  public void print() {
    System.out.println("-------------");
    System.out.println("Name: " + getName());
    System.out.println("Position: " + getPosition());
    System.out.println("Salary: $" + getSalary());
    System.out.println("-------------");
  }
} 