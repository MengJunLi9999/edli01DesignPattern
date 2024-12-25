package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete state for sold out
 */
public class SoldOutState implements IVendingMachineState {
  @Override
  public void insertCoin(VendingMachine machine) {
    System.out.println("Machine is sold out");
  }

  @Override
  public void ejectCoin(VendingMachine machine) {
    System.out.println("No coin to return");
  }

  @Override
  public void selectProduct(VendingMachine machine) {
    System.out.println("Machine is sold out");
  }

  @Override
  public void dispense(VendingMachine machine) {
    System.out.println("No product to dispense");
  }
} 