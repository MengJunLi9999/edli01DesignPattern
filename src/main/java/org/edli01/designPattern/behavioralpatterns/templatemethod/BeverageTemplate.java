package org.edli01.designpattern.behavioralpatterns.templatemethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.templatemethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Abstract class defining template method for beverage preparation
 */
public abstract class BeverageTemplate {
  // 模板方法
  public final void prepareBeverage() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
    System.out.println("Your " + getBeverageName() + " is ready!\n");
  }

  // 基本方法 - 共同步驟
  private void boilWater() {
    System.out.println("Boiling water");
  }

  private void pourInCup() {
    System.out.println("Pouring into cup");
  }

  // 抽象方法 - 由子類實現的特定步驟
  protected abstract void brew();
  protected abstract void addCondiments();
  protected abstract String getBeverageName();

  // 鉤子方法 - 子類可以選擇性覆寫
  protected boolean customerWantsCondiments() {
    return true;
  }
} 