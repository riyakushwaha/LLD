package Patterns.Factory;
/*
* ============= SimpleFactory Method =============
* class PizzaStore: orderPizza
* class SimplePizzaFactory: createPizza
* Interface Pizza: prepare, bake, cut, box
* CheesePizza, VeggiePizza, ClamPizza, PepperoniPizza classes implementing Pizza interface
*
* Product -----> ConcreteProduct
* ConcreteStore ---> ConcreteFactory
*
* IF YOU CREATE MULTIPLE FACTORY AND PASS IT TO CONCRETE STORE IT WILL A STRATEGY PATTERN
*
*
* ============= Patterns.Factory Method =============
* Defines an interface for creating an object, but lets subclasses decide which class to instantiate
* It lets a class defer instantiation to subclasses
*
* These two are called Creater classes
* abstract class PizzaStore: abstract func createPizza, normal func orderPizza
* NYPizzaStore, INPizzaStore implementing the function createPizza
*
* Below ones are called Product classes
* Interface Pizza: prepare, bake, cut, box
* CheesePizza, VeggiePizza, CalmPizza, PepperoniPizza classes implementing Pizza interface
*
* Product
* ConcreteProduct
*
* Creator(factoryMethod:createPizza, anOperation: orderPizza)
* ConcreteCreator(factoryMethod: createPizza)
*
*
* Pizza ---- IN-CHEESE, IN-CORN, IN-VEGGIES (IN-STORE
*            NY-CHEESE, NY-CORN, NY-VEGGIES (NY-STORE)
*
*
* ============= Abstract Patterns.Factory Method =============
* Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
*
* abstract Product having composition for ingredients like Dough, Veggies
* ConcreteProduct
*
* Ingredients interface for Dough, Veggies
* Concrete Ingredients
*
* IngredientFactory interface  --createDough, createVeggies
* Concrete IngredientFactory ---- NYIngredientFactory, INIngredientFactory, ChicagoIngredientFactory
*
* Creator(factoryMethod:createPizza, anOperation: orderPizza)
* ConcreteCreator(factoryMethod: createPizza) like NYPizzaStore, INPizzaStore
*
* Pizza(INGREDIENT-FACTORY)---- IN-CHEESE, IN-CORN, IN-VEGGIES (IN-STORE(in-ingredient-factory))
*                               NY-CHEESE, NY-CORN, NY-VEGGIES (NY-STORE(ny-ingredient-factory))
*
*
*
* */