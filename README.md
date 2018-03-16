# Real Calculator Simulate Engine
An extendable calculator engine simulates real world calculator.
Real world calculator looks like: 

![](https://i5.walmartimages.com/asr/c89acab8-c1cc-4959-8440-3fee39e6b88a_1.b71394f0af9a3b27c9c7011b81548f9f.jpeg)


## 1. Basic Calculator
Functions refer this image:

![iOS Calculator](https://cdn.macrumors.com/article-new/2017/10/calculatorapp-250x445.jpg)

Library call example:

```java
// create an basic calculator
Calculator calculator = new BasicCalculator();

// 2 + 31 = 33; 33 * 2 = 66;
calculator.reset()
    .pressKey(Keys.TWO.getSymbol())
    .pressKey(Keys.ADD.getSymbol())
    .pressKey(Keys.THREE.getSymbol())
    .pressKey(Keys.ONE.getSymbol())
    .pressKey(Keys.EQUAL.getSymbol())
    .pressKey(Keys.MULTIPLY.getSymbol())
    .pressKey(Keys.TWO.getSymbol())
    .pressKey(Keys.EQUAL.getSymbol());

// display = "66";
String display = calculator.getDisplay();

```

## 2. Memorable Calculator
In progress...