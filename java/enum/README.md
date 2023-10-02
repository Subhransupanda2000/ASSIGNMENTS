# Constructor in enum
* Enums are a data type in programming languages used to define a collection of named constants.
  These constants are typically used to represent a set of discrete values that are meaningful in a specific context.
  Enums make code more readable and self-documenting by replacing magic numbers or strings with descriptive names.

Here are some key points about enums:

1. Named Constants:
Enums allow you to define named constants. For example, instead of using 0 and 1 to represent weekdays and weekends, you can define an enum with the names Monday, Tuesday, Wednesday, etc., making the code more readable and understandable.

2. Distinct Values:
Enumerations represent distinct values, meaning each enum constant is unique within the enum type. This ensures that the values used are restricted to a specific set of options.

3. Sequential Numbers:
Enum values are often assigned sequential integers starting from 0 (although this can be customized). For instance, if you don't specify values for the enum constants, they will be assigned 0, 1
# Abscract method in enum:
* An abstract method in an enum is a method that is declared without an implementation, and must be implemented by each enum member. This allows each enum member to define its own behavior for a given operation, without having to use a switch statement on the enum type.

* Enums and Abstract Methods: While an enum itself cannot have abstract methods, you can define an interface with abstract methods and then have enum constants implement those methods. This allows you to enforce specific behavior for each enum constant.

* Interface Implementation: Enum constants implement the abstract methods defined in an interface that they declare they implement. Each enum constant provides its 
 own implementation of these methods, allowing for distinct behavior for each constant.

* Enforcing Behavior: Abstract methods in enums are useful for ensuring that each enum constant adheres to a specific contract or interface. It provides a way to 
 define a consistent set of methods that each constant must implement.
