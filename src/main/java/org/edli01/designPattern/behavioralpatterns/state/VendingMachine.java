package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Context class for vending machine
 */
public class VendingMachine {
  private IVendingMachineState state;
  private int count;

  public VendingMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = new NoCoinState();
    } else {
      state = new SoldOutState();
    }
  }

  public void insertCoin() {
    state.insertCoin(this);
  }

  public void ejectCoin() {
    state.ejectCoin(this);
  }

  public void selectProduct() {
    state.selectProduct(this);
    if (state instanceof SoldState) {
      dispense();
    }
  }

  private void dispense() {
    state.dispense(this);
    count--;
  }

  public void setState(IVendingMachineState state) {
    this.state = state;
  }

  public int getCount() {
    return count;
  }
} 