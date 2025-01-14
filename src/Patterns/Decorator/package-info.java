package Patterns.Decorator;

/*
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative
to subclassing for extending functionality.
* Abstract Product
* ConcreteProduct
* Abstract ProductDecorator Implements Product has composition of Product which it instantiates in constructor
* ConcreteDecorators implements ProductDecorator calls ConcreteProduct then self method like in notifications
*
* Decorators have the same supertype as the object they decorate and because of this we can pass wound the wrapped
object in place of the original one
Decorators adds it own behaviour before and/or after delegating to the object it decorates to do the rest of the job.
* */