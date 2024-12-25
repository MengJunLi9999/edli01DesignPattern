package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete state for coin inserted
 */
public class HasCoinState implements IVendingMachineState {
  @Override
  public void insertCoin(VendingMachine machine) {
    System.out.println("Coin already inserted");
  }

  @Override
  public void ejectCoin(VendingMachine machine) {
    System.out.println("Coin returned");
    machine.setState(new NoCoinState());
  }

  @Override
  public void selectProduct(VendingMachine machine) {
    System.out.println("Product selected");
    machine.setState(new SoldState());
  }

  @Override
  public void dispense(VendingMachine machine) {
    System.out.println("Please select a product first");
  }
} 