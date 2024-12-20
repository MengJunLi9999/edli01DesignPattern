package org.edli01.solid.lod;

import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.lod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 10:46
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class Zookeeper {
    private List<Animal> animalList;

    public Zookeeper(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feedAndDisplay() {
        System.out.println("Feed the animals and display their names.");
        for(Animal animal : animalList) {
            System.out.println("Feed " + animal.getName());
        }
    }
}
