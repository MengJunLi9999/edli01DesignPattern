package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: State interface for vending machine
 */
public interface IVendingMachineState {
  void insertCoin(VendingMachine machine);
  void ejectCoin(VendingMachine machine);
  void selectProduct(VendingMachine machine);
  void dispense(VendingMachine machine);
} 