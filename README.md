# AnimalInheritance
Designing classes of animal based on Inheritance mechanism

*Question 1:
  - Since all kinds of animal can move and sound in general rather than walk and sing, Animal class should be an abstract class with 
move() and sound() abstract methods. In the future, if there is any subclass of Animal with specific way of move or sound (example: walk,
fly, crawl for move), we can implement move() and sound() in that specific class correspondingly.
  - There are 2 unit tests that I used to test the sing() method of a Bird.
  - For maintainability, interfaces like Flyable, Singable and Walkable are used instead of writing direct method for a class, since for example, not all Animal can fly and not only Bird can fly as well. Then, any class can fly can easily implement those separate Interfaces.

