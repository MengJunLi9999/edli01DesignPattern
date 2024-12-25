package org.edli01.designpattern.creationalpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.prototype
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:09
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Document manager using prototype pattern
 */
public class DocumentManager {
  private Map<String, IDocument> documentMap = new HashMap<>();

  public void addDocument(String key, IDocument doc) {
    documentMap.put(key, doc);
  }

  public IDocument getDocument(String key) {
    IDocument doc = documentMap.get(key);
    return doc != null ? doc.clone() : null;
  }
} 