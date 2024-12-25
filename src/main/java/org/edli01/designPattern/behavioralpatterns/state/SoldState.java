package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete state for product sold
 */
public class SoldState implements IVendingMachineState {
  @Override
  public void insertCoin(VendingMachine machine) {
    System.out.println("Please wait, dispensing product");
  }

  @Override
  public void ejectCoin(VendingMachine machine) {
    System.out.println("Sorry, product already selected");
  }

  @Override
  public void selectProduct(VendingMachine machine) {
    System.out.println("Please wait, dispensing product");
  }

  @Override
  public void dispense(VendingMachine machine) {
    System.out.println("Product dispensed");
    if (machine.getCount() > 0) {
      machine.setState(new NoCoinState());
    } else {
      System.out.println("Out of products");
      machine.setState(new SoldOutState());
    }
  }
} 