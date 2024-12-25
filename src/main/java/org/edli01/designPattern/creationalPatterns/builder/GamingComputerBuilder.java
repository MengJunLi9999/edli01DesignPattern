package org.edli01.designpattern.creationalpatterns.builder;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.builder
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete Builder for gaming computer
 */
public class GamingComputerBuilder implements ComputerBuilder {
  private Computer computer;

  public GamingComputerBuilder() {
    this.computer = new Computer();
  }

  @Override
  public void buildCpu() {
    computer.setCpu("Intel Core i9-13900K");
  }

  @Override
  public void buildRam() {
    computer.setRam("32GB DDR5");
  }

  @Override
  public void buildStorage() {
    computer.setStorage("2TB NVMe SSD");
  }

  @Override
  public void buildGpu() {
    computer.setGpu("NVIDIA RTX 4090");
  }

  @Override
  public Computer getResult() {
    return computer;
  }
} 