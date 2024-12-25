package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete state for no coin inserted
 */
public class NoCoinState implements IVendingMachineState {
  @Override
  public void insertCoin(VendingMachine machine) {
    System.out.println("Coin inserted");
    machine.setState(new HasCoinState());
  }

  @Override
  public void ejectCoin(VendingMachine machine) {
    System.out.println("No coin to eject");
  }

  @Override
  public void selectProduct(VendingMachine machine) {
    System.out.println("Please insert a coin first");
  }

  @Override
  public void dispense(VendingMachine machine) {
    System.out.println("Please insert a coin first");
  }
} 