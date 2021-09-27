# W02

191220102  孙文戈

------



## 任务一

### 1.

#### example类图

![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-OraOraOra0ra/master/example/class.puml)

#### 对象时序图

![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-OraOraOra0ra/master/example/timeline.puml)

### 2.

#### example设计理念

​	首先确定项目的内容是老爷爷指挥葫芦娃排队，明确各类的功能如排序类负责排序功能、队列类负责形成队列、葫芦娃类负责葫芦娃数据结构的生成、老爷爷类负责调用指挥排序，并且确定各类之间的交互关系，识别出基本的接口。然后依据各项类的功能分析，确定各类的基本属性数据。通过分析类的共性，构建抽象类或接口类（Linable与Sorter），从而实现代码重用以及建立框架。接着在接口中调用隐藏的实现方法，构成一个粗粒度流程，且分析接口是否合理。再具体实现所有的各项类中方法，并相应的扩充数据属性。最后再反复迭代来扩展系统，且给用户提供尽可能少的接口。

#### 好处

1、易维护
采用面向对象思想设计的结构，可读性高，由于继承与抽象类的存在，即使改变需求，那么维护也只是在局部模块，所以维护起来是非常方便和较低成本的。
2、质量高
在设计时，可重用现有的，例如第三次作业便是可以在第二次作业基础上继续完成。
3、效率高
在软件开发时，根据设计的需要对现实世界的事物进行抽象，产生类。使用这样的方法解决老爷爷指挥葫芦娃排队问题，接近于日常生活和自然的思考方式，能够提高程序设计的效率与质量。
4、易扩展
由于继承、封装、多态的特性，自然设计出高内聚、低耦合的系统结构，使得系统更灵活、更容易扩展，由example到task2与task3的扩展难度显著降低。

#### 可改进之处

数据的声明放在定义前面，可以增强代码的可读性，方便他人对于原项目的理解与进一步开发。

Scene中对象的初始化与文件的IO操作可以进一步封装，增强代码的封装性。



## 任务二

#### 类图

![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-OraOraOra0ra/master/s191220102/src/task2/class.puml)

#### 选择排序

[![asciicast](https://asciinema.org/a/438161.svg)](https://asciinema.org/a/438161)

#### 快速排序

[![asciicast](https://asciinema.org/a/438236.svg)](https://asciinema.org/a/438236)

