package org.edli01.designpattern.creationalpatterns.builder;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.builder
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:48
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Abstract Builder interface
 */
public interface ComputerBuilder {
  void buildCpu();
  void buildRam();
  void buildStorage();
  void buildGpu();
  Computer getResult();
} 