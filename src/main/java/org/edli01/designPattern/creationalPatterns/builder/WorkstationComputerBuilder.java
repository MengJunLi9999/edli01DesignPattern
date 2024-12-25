package org.edli01.designpattern.creationalpatterns.builder;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.builder
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:56
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete Builder for workstation computer
 */
public class WorkstationComputerBuilder implements ComputerBuilder {
  private Computer computer;

  public WorkstationComputerBuilder() {
    this.computer = new Computer();
  }

  @Override
  public void buildCpu() {
    computer.setCpu("AMD Threadripper Pro 5995WX");
  }

  @Override
  public void buildRam() {
    computer.setRam("128GB ECC DDR4");
  }

  @Override
  public void buildStorage() {
    computer.setStorage("4TB NVMe RAID");
  }

  @Override
  public void buildGpu() {
    computer.setGpu("NVIDIA RTX A6000");
  }

  @Override
  public Computer getResult() {
    return computer;
  }
} 