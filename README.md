
# **Refactoring MonolithicAdventureGame Using SOLID Principles**

## **1.Project Overview**
This project is a refactored version of a monolithic adventure game, following SOLID principles to improve modularity, scalability, and maintainability.

---

### **2. . SOLID Principles Applied**

#### **✅ Single Responsibility Principle (SRP)**
- Each class has only one responsibility (separate classes for Player, Enemy, Items, Combat, Levels, and Score).


#### **✅ Open/Closed Principle (OCP)**
- New enemies and items can be added without modifying existing code (using IEnemy and IItem interfaces).


#### **✅ Dependency Inversion Principle (DIP)**
- CombatManager depends on IEnemy, not specific enemy classes, making it flexible.

#### **✅ Liskov Substitution Principle (LSP)**
- Zombie, Vampire, and Skeleton can replace Enemy without breaking the game.

#### **✅ Interface Segregation Principle (ISP)**
- Split IEnemy and IItem instead of using one large interface.


```
📂 SOLID-Refactored-AdventureGame
│── 📂 src
│   ├── 📂 player
│   │   ├── Player.java
│   ├── 📂 combat
│   │   ├── CombatManager.java
│   ├── 📂 enemies
│   │   ├── Enemy.java
│   │   ├── Skeleton.java
│   │   ├── Zombie.java
│   │   ├── Vampire.java
│   ├── 📂 items
│   │   ├── ItemManager.java
│   │   ├── GoldCoin.java
│   │   ├── HealthElixir.java
│   │   ├── MagicScroll.java
│   ├── 📂 level
│   │   ├── LevelManager.java
│   ├── 📂 score
│   │   ├── ScoreManager.java
│   ├── MainGame.java
│
│── 📂 docs
│   ├── UML-After-Refactor.png
│   ├── SOLID-Refactoring-Report.pdf
│
│── README.md
```
