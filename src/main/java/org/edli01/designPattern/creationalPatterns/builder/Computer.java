package org.edli01.designpattern.creationalpatterns.builder;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.builder
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:46
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Product class for Builder Pattern
 */
public class Computer {
  private String cpu;
  private String ram;
  private String storage;
  private String gpu;

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  @Override
  public String toString() {
    return "Computer Specifications:\n" +
           "CPU: " + cpu + "\n" +
           "RAM: " + ram + "\n" +
           "Storage: " + storage + "\n" +
           "GPU: " + gpu;
  }
} 