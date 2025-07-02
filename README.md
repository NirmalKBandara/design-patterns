---
# Design Patterns
---
`I am sharing my work related to design pattern implementations here.`

## 01. Creational Patterns

`Concerned with object creation mechanisms.`

| Pattern              | Purpose                                                                                                          |
| -------------------- | ---------------------------------------------------------------------------------------------------------------- |
| [**Singleton**](FactoryMethod)        | Ensures a class has only one instance and provides a global point of access.                                     |
| [**Factory Method**](Singelton)   | Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. |
| [**Abstract Factory**](...) | Provides an interface for creating families of related or dependent objects.                                     |
| [**Builder**](Builder)          | Separates the construction of a complex object from its representation.                                          |
| [**Prototype**](Prototype)        | Creates new objects by copying an existing object (prototype).                                                   |

## 02. Structural Patterns

`Deal with object composition or how classes and objects are combined.`

| Pattern       | Purpose                                                                        |
| ------------- | ------------------------------------------------------------------------------ |
| [**Adapter**](Adapter)   | Converts one interface to another the client expects.                          |
| [**Bridge**](Bridge)    | Decouples abstraction from its implementation.                                 |
| **Composite** | Treats individual objects and compositions of objects uniformly.               |
| **Decorator** | Adds responsibilities to objects dynamically.                                  |
| **Facade**    | Provides a simplified interface to a larger body of code.                      |
| **Flyweight** | Reduces memory usage by sharing as much data as possible with similar objects. |
| **Proxy**     | Provides a surrogate or placeholder for another object.                        |


## 03. Behavioral Patterns

`Concerned with how objects interact and responsibilities are assigned.`

| Pattern                     | Purpose                                                                                               |
| --------------------------- | ----------------------------------------------------------------------------------------------------- |
| **Chain of Responsibility** | Passes a request along a chain of handlers.                                                           |
| **Command**                 | Encapsulates a request as an object, thereby letting you parameterize clients with queues, logs, etc. |
| **Interpreter**             | Defines a grammar for interpreting a language.                                                        |
| **Iterator**                | Provides a way to access elements of a collection without exposing the underlying representation.     |
| **Mediator**                | Defines an object that encapsulates how a set of objects interact.                                    |
| **Memento**                 | Captures and restores an object's internal state.                                                     |
| **Observer**                | Defines a one-to-many dependency so that when one object changes state, all dependents are notified.  |
| **State**                   | Allows an object to alter its behavior when its internal state changes.                               |
| **Strategy**                | Defines a family of algorithms, encapsulates each one, and makes them interchangeable.                |
| **Template Method**         | Defines the skeleton of an algorithm, deferring some steps to subclasses.                             |
| **Visitor**                 | Separates an algorithm from an object structure on which it operates.                                 |
