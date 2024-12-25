package org.edli01.solid.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.lod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 00:56
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Lod {
  public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<Animal>();
    animalList.add(new Animal("Lion"));
    animalList.add(new Animal("Shark"));
    animalList.add(new Animal("Eagle"));

    ZooDirector zooDirector = new ZooDirector();
    zooDirector.assignTasks(new Zookeeper(animalList));
  }
}
