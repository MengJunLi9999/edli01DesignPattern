package org.edli01.solid.lsp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.lsp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 15:16
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Lsp {
  public static void main(String[] args) {
    Salesperson iphoneSalesperson = new Salesperson();
    iphoneSalesperson.setAbsPhone(new IPhone());
    iphoneSalesperson.startWorking();

    Salesperson gphoneSalesperson = new Salesperson();
    gphoneSalesperson.setAbsPhone(new GPhone());
    gphoneSalesperson.startWorking();
  }
}
