# java-8-functional-interface

Functional interfaces are introduced as part of Java 8. It is implemented using the annotation called @FunctionalInterface. It ensures that the interface should have only one abstract method. The usage of the abstract keyword is optional as the method defined inside the interface is by default abstract. It is important to note that a functional interface can have multiple default methods (it can be said concrete methods which are default), but only one abstract method. The default method has been introduced in interface so that a new method can be appended in the class without affecting the implementing class of the existing interfaces. Prior to Java 8, the implementing class of an interface had to implement all the abstract methods defined in the interface.

The functional interface has been introduced in Java 8 to support the lambda expression. On the other hand, it can be said lambda expression is the instance of a functional interface.
