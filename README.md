# Java 23種設計模式

這個專案展示了物件導向程式設計(OOP)、SOLID 設計原則，以及 23 種設計模式在 Java 中的實現，主要用於教育目的和實際應用參考。

## 專案概述

本專案分享內容主要如下，完整分享OOP、SOLID、23種設計模式：
1. OOP 四大基本概念的實踐
2. SOLID 設計原則的應用
3. 23 種設計模式的具體實現

### 目錄結構

## 設計模式分類

### 創建型模式
- Factory Method（工廠方法）
- Abstract Factory（抽象工廠）
- Builder（建造者）
- Prototype（原型）
- Singleton（單例）

### 結構型模式
- Adapter（適配器）
- Bridge（橋接）
- Composite（組合）
- Decorator（裝飾）
- Facade（外觀）
- Flyweight（享元）
- Proxy（代理）

### 行為型模式
- Chain of Responsibility（責任鏈）
- Command（命令）
- Interpreter（解釋器）
- Iterator（迭代器）
- Mediator（中介者）
- Memento（備忘錄）
- Observer（觀察者）
- State（狀態）
- Strategy（策略）
- Template Method（模板方法）
- Visitor（訪問者）

## 設計模式優缺點

### 創建型模式

#### Factory Method（工廠方法）
- 優點：
  - 遵循開閉原則，易於擴展新產品
  - 將產品的創建與使用解耦
  - 封裝產品創建的細節
- 缺點：
  - 增加系統的類別數量
  - 增加系統的複雜度

#### Abstract Factory（抽象工廠）
- 優點：
  - 分離了具體的類別
  - 易於交換產品系列
  - 有利於產品的一致性
- 缺點：
  - 難以支援新種類的產品
  - 設計較為複雜

#### Builder（建造者）
- 優點：
  - 可以精細控制構建過程
  - 允許對象有不同的表示
  - 將複雜對象的構建與表示分離
- 缺點：
  - 需要創建多個類別
  - 產品必須有足夠的相似性

#### Prototype（原型）
- 優點：
  - 隱藏複製對象的複雜性
  - 提供簡單的創建機制
  - 允許運行時添加或刪除產品
- 缺點：
  - 實現深複製較為複雜
  - 每個類別都需要實現克隆方法

#### Singleton（單例）
- 優點：
  - 保證一個類別只有一個實例
  - 提供對實例的全局訪問點
  - 節省系統資源
- 缺點：
  - 可能違反單一職責原則
  - 在多線程環境需要特別注意
  - 可能掩蓋不良設計

### 結構型模式

#### Adapter（適配器）
- 優點：
  - 將不兼容的接口轉換為兼容
  - 提高代碼重用性
  - 增加類別的透明度
- 缺點：
  - 可能會增加系統的複雜性
  - 可能需要重寫部分代碼

#### Bridge（橋接）
- 優點：
  - 抽象和實現分離
  - 提高可擴展性
  - 實現細節對客戶透明
- 缺點：
  - 增加系統的複雜度
  - 需要正確識別抽象層次

#### Composite（組合）
- 優點：
  - 定義了包含基本對象和組合對象的層次結構
  - 簡化客戶端代碼
  - 易於增加新類型的組件
- 缺點：
  - 使設計變得更加一般化
  - 可能會使系統難以限制組件

#### Decorator（裝飾）
- 優點：
  - 比繼承更靈活
  - 允許動態添加職責
  - 有效避免類別爆炸
- 缺點：
  - 可能產生過多小對象
  - 增加系統複雜度

#### Facade（外觀）
- 優點：
  - 簡化了客戶端與子系統的關係
  - 實現了子系統與客戶端的解耦
  - 提供了一個統一的接口
- 缺點：
  - 可能成為一個過度融合的類
  - 增加了新的依賴關係

#### Flyweight（享元）
- 優點：
  - 減少對象創建，節省內存
  - 提高系統性能
  - 符合時空轉換原則
- 缺點：
  - 系統變得複雜
  - 需要區分內部狀態和外部狀態

#### Proxy（代理）
- 優點：
  - 協調調用者和被調用者
  - 可以進行額外的處理
  - 提供對目標對象的保護
- 缺點：
  - 可能會影響處理速度
  - 實現較為複雜

### 行為型模式

#### Chain of Responsibility（責任鏈）
- 優點：
  - 降低耦合度
  - 簡化對象間的連接
  - 增強給對象指派職責的靈活性
- 缺點：
  - 不能保證請求一定被處理
  - 可能產生較長的處理鏈

#### Command（命令）
- 優點：
  - 將請求封裝成對象
  - 支持撤銷/重做操作
  - 可以組合成複合命令
- 缺點：
  - 可能產生大量命令類
  - 增加系統的複雜度

#### Iterator（迭代器）
- 優點：
  - 提供統一的遍歷接口
  - 簡化集合的遍歷
  - 支持不同方式的遍歷
- 缺點：
  - 可能需要額外的類來實現迭代
  - 增加系統的複雜度

#### Mediator（中介者）
- 優點：
  - 減少了對象間的耦合
  - 集中控制交互
  - 簡化對象協議
- 缺點：
  - 中介者可能過於複雜
  - 可能造成對象和中介者的過度耦合

#### Memento（備忘錄）
- 優點：
  - 提供了恢復機制
  - 封裝了存儲細節
  - 維護了封裝邊界
- 缺點：
  - 可能消耗大量內存
  - 可能需要完整克隆對象

#### Observer（觀察者）
- 優點：
  - 支持廣播通信
  - 符合開閉原則
  - 建立了觸發機制
- 缺點：
  - 可能引起循環調用
  - 觀察者順序不可控

#### State（狀態）
- 優點：
  - 封裝了狀態的轉換規則
  - 將狀態轉換顯式化
  - 消除了大量的條件分支
- 缺點：
  - 可能增加類的數量
  - 結構和實現都較為複雜

#### Strategy（策略）
- 優點：
  - 算法可以自由切換
  - 避免使用多重條件判斷
  - 擴展性良好
- 缺點：
  - 策略類會增多
  - 所有策略類都需要對外暴露

#### Template Method（模板方法）
- 優點：
  - 提高代碼復用性
  - 符合開閉原則
  - 提供了一個框架
- 缺點：
  - 可能導致類的數目增加
  - 增加了系統複雜度

#### Visitor（訪問者）
- 優點：
  - 符合單一職責原則
  - 優秀的擴展性
  - 支持雙分派
- 缺點：
  - 增加了系統的複雜度
  - 破壞封裝
  - 具體元素變更比較困難

## 功能特點

1. **完整性**
   - 涵蓋所有 23 種 GoF 設計模式
   - 每個模式都有完整的示例代碼

2. **教育性**
   - 詳細的註解說明
   - 清晰的程式碼結構
   - 實用的應用場景

3. **實用性**
   - 可直接應用於實際專案
   - 提供多種實現方式
   - 易於理解和擴展

## 使用說明

1. **環境要求**
   - JDK 8 或更高版本
   - Maven 3.6.0 或更高版本

2. **運行方式**
   ```bash
   #下載程式碼
   git clone https://github.com/MengJunLi9999/edli01DesignPattern.git
   
   # 編譯及執行指令範例
   # javac -d(指定編譯後路徑參數) "編譯後class放置路徑" "設計模式 or OOP or SOLID的最底層資料夾/*.java" -encoding utf-8
   # java -cp(類別、zip、jar搜尋路徑參數) "class放置路徑、zip、jar" "指定有main的類別程式"
   
   # 範例：設計模式
   javac -d edli01DesignPattern/target/classes edli01DesignPattern/src/main/java/org/edli01/designpattern/behavioralpatterns/command/*.java -encoding utf-8
   java -cp edli01DesignPattern/target/classes org.edli01.designpattern.behavioralpatterns.command.EdLi01Command
   
   # 範例：OOP
   javac -d edli01DesignPattern/target/classes edli01DesignPattern/src/main/java/org/edli01/oop/encapsulation/*.java -encoding utf-8
   java -cp edli01DesignPattern/target/classes org.edli01.oop.encapsulation.EdLi01Encapsulation
   
   # 範例：SOLID
   javac -d edli01DesignPattern/target/classes edli01DesignPattern/src/main/java/org/edli01/solid/dip/*.java -encoding utf-8
   java -cp edli01DesignPattern/target/classes org.edli01.solid.dip.EdLi01Dip
   
   ```

3. **範例運行**
   - 每個模式都有獨立的主類
   - 可以直接運行對應的 EdLi01{PatternName}.java 文件

## 學習建議

1. **循序漸進**
   - 從簡單的模式開始學習
   - 理解模式的核心概念
   - 嘗試修改和擴展範例

2. **實踐應用**
   - 在實際項目中嘗試應用
   - 理解模式的適用場景
   - 注意模式的優缺點

## 貢獻指南

歡迎提交 Pull Request 或 Issue：
- 修復 bug
- 改進文檔
- 添加新的示例
- 優化現有代碼

## 作者資訊

- 作者：MENG-JUN LI
- Instagram：[@edli_01](https://www.instagram.com/edli_01)
- 網站：[edli-01.com](https://edli-01.com/)

## 授權資訊

本專案採用 MIT 授權條款 - 詳見 [LICENSE](LICENSE) 文件

## 結論

設計模式是軟體開發中解決常見問題的最佳實踐方案。本篇文章通過實際的[程式碼示例](https://github.com/MengJunLi9999/edli01DesignPattern)，幫助軟體開發者：

1. **深入理解**
   - 設計模式的核心概念
   - 各種模式的實現方式
   - 模式之間的關係

2. **實際應用**
   - 在實際項目中正確使用設計模式
   - 提高代碼的可維護性和擴展性
   - 提升軟體設計能力

3. **持續學習**
   - 設計模式的演進和發展
   - 現代編程中的最佳實踐
   - 軟體架構設計的思維方式