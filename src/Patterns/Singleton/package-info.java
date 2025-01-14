package Patterns.Singleton;
/*
    Using an enum to create a singleton class in Java is a highly recommended practice due to its inherent advantages,
    particularly in handling serialization and ensuring a single instance.
    Here's why enums are well-suited for creating singleton classes:

    1. Singleton Property by Design
    Enums in Java are inherently singletons. Each enum constant is an instance of the enum type, and Java guarantees
     that there is only one instance of each enum constant, making enums a natural fit for implementing singletons.

    2. Serialization
    Serialization is straightforward with enums. The Java serialization mechanism ensures that the singleton
    property is maintained, i.e., during deserialization, it guarantees that no new instances are created.
    The Java language specification ensures that for any enum value, readResolve is automatically used, maintaining
    the singleton property.

    3. Thread Safety
    Enums provide implicit support for thread safety. The JVM ensures that enum constants are created in a
    thread-safe manner. This means that you don’t have to worry about complex synchronization issues when dealing
    with enums.

    4. Simplicity and Conciseness
    Using an enum to implement a singleton is concise and requires fewer lines of code compared to other singleton
    implementations. It avoids the boilerplate code needed for other methods such as the Bill Pugh Singleton Design
     or the Double-Checked Locking pattern.

    -->> Advantages
    1. Serialization Safety: The enum singleton is safe from the issues that can arise from the default serialization
    process.
    2. Thread Safety: Enum constants are implicitly final and static, making them thread-safe.
    3. Reflection Protection: Enums are inherently protected against instantiation via reflection. Attempting to
    instantiate an enum using reflection will throw a java.lang.IllegalArgumentException.
    4. Simplicity: The code is simple, clean, and easy to understand, eliminating the need for explicit synchronization
    and other complex mechanisms.

    -->> Problem
    1. Serialization and Deserialization: Serialization and deserialization can create new instances of a singleton
    class. During deserialization, a new instance of the class is created, which can violate the singleton property.
    2. Reflection: Reflection can be used to access private constructors and create new instances of a singleton class,
    breaking the singleton property.
    3. Class Loaders: Multiple class loaders can create multiple instances of the singleton class, breaking the
    singleton property.


 */