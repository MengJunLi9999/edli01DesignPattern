package org.edli01.designpattern.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.composite
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Composite class for manager
 */
public class Manager implements IEmployee {
  private String name;
  private double salary;
  private List<IEmployee> subordinates;

  public Manager(String name, double salary) {
    this.name = name;
    this.salary = salary;
    this.subordinates = new ArrayList<>();
  }

  @Override
  public void add(IEmployee employee) {
    subordinates.add(employee);
  }

  @Override
  public void remove(IEmployee employee) {
    subordinates.remove(employee);
  }

  @Override
  public IEmployee getChild(int i) {
    return subordinates.get(i);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getPosition() {
    return "Manager";
  }

  @Override
  public double getSalary() {
    return salary;
  }

  @Override
  public void print() {
    System.out.println("\n=============");
    System.out.println("Name: " + getName());
    System.out.println("Position: " + getPosition());
    System.out.println("Salary: $" + getSalary());
    System.out.println("=============");
    
    System.out.println("Subordinates:");
    for (IEmployee employee : subordinates) {
      employee.print();
    }
  }
} 