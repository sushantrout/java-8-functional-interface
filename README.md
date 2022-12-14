# java-8-functional-interface

Functional interfaces are introduced as part of Java 8. It is implemented using the annotation called @FunctionalInterface. It ensures that the interface should have only one abstract method. The usage of the abstract keyword is optional as the method defined inside the interface is by default abstract. It is important to note that a functional interface can have multiple default methods (it can be said concrete methods which are default), but only one abstract method. The default method has been introduced in interface so that a new method can be appended in the class without affecting the implementing class of the existing interfaces. Prior to Java 8, the implementing class of an interface had to implement all the abstract methods defined in the interface.

The functional interface has been introduced in Java 8 to support the lambda expression. On the other hand, it can be said lambda expression is the instance of a functional interface.


In Java 8, there are 4 main functional interfaces are introduced which could be used in different scenarios. These are given below.

<ol>
  <li>Consumer</li>
<li>Predicate</li>
<li>Function</li>
<li>Supplier</li>
 </ol>

Among the above four interfaces, the first three interfaces also have extensions also which are given below.

<ol>
  <li>Consumer - BiConsumer</li>
  <li>Predicate – BiPredicate</li>
<li>Function – BiFunction, UnaryOperator, BinaryOperator</li>
  </ol>
  
  <h3>Predicate</h3>
<ol>
  <li>  public abstract boolean test(T) </li> 
   <li> public java.util.function.Predicate and(java.util.function.Predicate<? super T>)</li> 
   <li> public java.util.function.Predicate negate()</li> 
   <li> public java.util.function.Predicate or(java.util.function.Predicate<? super T>)</li>
   <li> public static java.util.function.Predicate isEqual(java.lang.Object)</li>
  </ol>

<h3>Function</h3>
<ol>
  <li>public abstract R apply(T)</li>
  <li>public <V> java.util.function.Function<V, R> compose(java.util.function.Function<? super V, ? extends T>)</li>
  <li>public <V> java.util.function.Function<T, V> andThen(java.util.function.Function<? super R, ? extends V>)</li>
  <li>public static <T> java.util.function.Function<T, T> identity()</li>
</ol>

<h3>Consumer</h3>
<ol>
  <li>accept(T)</li>
  <li>andThen(java.util.function.Consumer&lt;? super T&gt;)</li>

</ol>

<h3>Supplier</h3>
<ol>
  <li>T get()</li>
</ol>
