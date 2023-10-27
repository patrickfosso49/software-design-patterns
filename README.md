# Software Design Patterns
Model and implement software design patterns in Java

Software design patterns are general solutions to commonly ocurring problems faced during software design. They are classified into creational, structural and Behavioral design patterns.
### Content structure

The various patterns are grouped into folders named according to pattern type.

### [Creational design patterns](https://github.com/patrickfosso49/software-design-patterns/tree/main/creational)
These design patterns are meant to solve problems related to object instantiation
#### [1. Factory Pattern](https://github.com/patrickfosso49/software-design-patterns/tree/main/creational/factory/fouotsop_fosso_patrick_20U2585)

Refine the process of object creation by providing interfaces for their creation and allowing implementing classes to decide which class to instantiate.

This pattern promotes  code reuse and loose coupling between classes
#### [2. Singleton Pattern](https://github.com/patrickfosso49/software-design-patterns/tree/main/creational/singleton/fouotsop_fosso_patrick_20U2585/code)

Ensure that a class has a single instance while providing a global access this single instance

Prevent unnecessary instantiation of the class by making its constructor private

Declare a private static field of type of the singleton class and make its getter static to. This make it accessible everywhere.

#### [3. Abstract Factory Pattern](https://github.com/patrickfosso49/software-design-patterns/tree/main/creational/abstractfactory)

This pattern is similar to the factory pattern, but provide interfaces for the creation of a family of products rather than a single product.

#### [4. Builder Pattern](https://github.com/patrickfosso49/software-design-patterns/tree/main/creational/builder/code)

Faciliate the creation complex objects that require laborious, step-by-step initialization of many fields or even nested objects.

Extract the object creation method out of its own class, let it handled by an external builder.

Provide an interface builder and implement this interface with concrete builders to handle creation of complex objects of various types.

### Run the code

With visual studio code, if you have a debugger for java, you just need to run any class from the list of available classes

Alternatively you can compile and run the main classes for each pattern by running the following command inside the initial or modified folder in the code directory of each pattern.

example for singleton pattern
```console
username@pc:~/software-design-patterns$ javac creational/singleton/fouotsop_fosso_patrick_20U2585/code/initial/TestingSingleton.java
```
```console
username@pc:~/software-design-patterns$ java creational/singleton/fouotsop_fosso_patrick_20U2585/code/initial/TestingSingleton
```