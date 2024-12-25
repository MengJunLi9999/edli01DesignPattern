package org.edli01.designpattern.creationalpatterns.builder;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.builder
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:52
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Director class that controls the building process
 */
public class Director {
  private ComputerBuilder builder;

  public void setBuilder(ComputerBuilder builder) {
    this.builder = builder;
  }

  public Computer constructComputer() {
    builder.buildCpu();
    builder.buildRam();
    builder.buildStorage();
    builder.buildGpu();
    return builder.getResult();
  }
} 