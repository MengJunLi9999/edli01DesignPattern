package org.edli01.oop.inheritance;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.inheritance
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 16:11
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Inheritance {
  public static void main(String[] args) {
    Music jay = new PopMusic("Jay");
    Music edli01 = new JazzMusic("EdLi01");

    jay.arrangementOrPlay();
    edli01.arrangementOrPlay();
  }
}
