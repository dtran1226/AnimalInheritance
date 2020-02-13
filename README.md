# AnimalInheritance
Designing classes of animal based on Inheritance mechanism

*Question 1:
  - Since all kinds of animal can move and sound in general rather than walk and sing, Animal class should be an abstract class with 
move() and sound() abstract methods. In the future, if there is any subclass of Animal with specific way of move or sound (example: walk,
fly, crawl for move), we can implement move() and sound() in that specific class correspondingly.
  - There are 2 unit tests that I used to test the sing() method of a Bird.
  - For maintainability, interfaces like Flyable, Singable and Walkable are used instead of writing direct method for a class, since for example, not all Animal can fly and not only Bird can fly as well. Then, any class can fly can easily implement those separate Interfaces.
  
*Question 2:
  - For this question, we realize that not all birds can fly, so we need to change the implement of Flyable from Bird into specific Bird which can fly (like Duck in this example).
  - Bird also needs to change to abstract class with abstract method move() instead of the first assumption that all birds move by Flying. Now, different birds with different moving way (walk or fly) can implement their own ways of moving. Since Bird becomes abstract class, all instantiation of Bird must change to corresponding kind of Bird (Duck or Chicken for now).
  - Swimmable interface is added for implementation by animal which can swim like Duck.
  - Still assume that most of Birds sounding by singing, Duck and Chicken needs to override their own sound() methods to specific sound.

