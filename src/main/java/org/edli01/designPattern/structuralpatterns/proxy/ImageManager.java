package org.edli01.designpattern.structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.proxy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Manager class for handling multiple images
 */
public class ImageManager {
  private List<IImage> images;

  public ImageManager() {
    images = new ArrayList<>();
  }

  public void addImage(String fileName) {
    images.add(new ProxyImage(fileName));
    System.out.println("Added image: " + fileName + " (not loaded yet)");
  }

  public void displayImage(int index) {
    if (index >= 0 && index < images.size()) {
      System.out.println("\nAccessing image at index " + index);
      images.get(index).display();
    } else {
      System.out.println("Invalid image index");
    }
  }

  public void displayAllImages() {
    System.out.println("\nDisplaying all images:");
    for (IImage image : images) {
      image.display();
    }
  }

  public void listImages() {
    System.out.println("\nAvailable images:");
    for (int i = 0; i < images.size(); i++) {
      System.out.println(i + ": " + images.get(i).getFileName());
    }
  }
} 