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
# Parameterized enum
* Parameterized enums can be useful for a variety of purposes. 
*Data-Driven Enums: Parameterized enums are used when you need to associate specific data or parameters with each enum constant. This data can be of any type, such as strings, numbers, or custom objects.

* Constructor with Parameters: To create parameterized enums, you define a constructor within the enum class that accepts the desired parameters. Each enum constant then provides values for these parameters when it's declared.

* Private Fields: The enum constants can have private fields to store the parameters. These fields are initialized in the constructor and can be accessed through getter methods.

* Methods and Behavior: Parameterized enums often include methods to access and manipulate the associated data. These methods can provide behavior or operations related to the enum constants.

* Real-World Modeling: Parameterized enums are especially useful when modeling real-world entities that have attributes or characteristics unique to each constant. Examples include representing fruits with color and taste or countries with population and GDP.

* Enhanced Expressiveness: Parameterized enums make code more expressive by encapsulating data and behavior within the enum itself. This improves code readability and maintainability.

* Enumerating Values: You can still iterate through the enum constants using values() and use them in switch statements or other control structures.
