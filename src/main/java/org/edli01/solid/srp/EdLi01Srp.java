package org.edli01.solid.srp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.srp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 10:21
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Srp {
  public static void main(String[] args) {
    SmartTv tv = new SmartTv();
    tv.enable();
    tv.openApp();
    tv.closeApp();
    tv.disable();
  }
}
