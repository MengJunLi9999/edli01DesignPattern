package org.edli01.designpattern.structuralpatterns.composite;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.composite
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Component interface for employee
 */
public interface IEmployee {
  void add(IEmployee employee);
  void remove(IEmployee employee);
  IEmployee getChild(int i);
  String getName();
  String getPosition();
  double getSalary();
  void print();
} 