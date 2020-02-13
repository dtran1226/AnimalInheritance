# AnimalInheritance
Designing classes of animal based on Inheritance mechanism

I.Part A:
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
  
*Question 3:
  - Instead of using inheritance, we notice that a Rooster is actually just a male Chicken, so we only need add Gender attribute to classify these 2 types of Chicken. However, every animal must have their own gender, that's why we should add Gender attribute to Animal and reuse in Chicken class. The Gender attribute should make use of Enum since it only has 2 values.
  - When implementing sound() method, we only need to check the Gender to make a suitable sound.

*Question 4:
 - Although parrots may have different sounds depending on where they live, they are still similar parrot. We dont need to create lots of different parrots since there maybe tons of them. We only need to add an enum attribute to specify which sound a specific parrot is imitating. Then, switch case will be used to make a suitable sound.
 
II. Part B:
*Question 1:
  - Since a fish can only swim, it only need to implement Swimmable interface. However, it is an animal so there is a need to extend Animal as well.
  
*Question 2:
  - Similar to Gender attribute above, we can think of adding Color and Size attributes to Animal and reuse in Shark and Clownfish classes. The only difference is these attributes are default for all Sharks and Clownfishs. Therefore, we need to assign specific values for them in their Constructors.
  - makeJokes() is a specific function that rarely animal have, so we can add it directly to Clownfish. Oppositely, since all Animal can eat, eat() function should be added to Animal and Shark can override with specific kind of food (other fish).

*Question 3:
  - Since dolphin is not exactly a fish, we only need to extends Animal class and since it can swim, we merely need to implement Swimmable interface.
  
III. Part D:
*Question 1:
  - Create a Butterfly class which extends Animal, override sound() method as "I cant make a sound" and implement Flyable interface.

*Question 2:
  - Since Caterpillar is not a Butterfly (cannot fly) but a Butterfly is still considered as a Caterpillar (cannot sound, can walk). We can consider letting Butterfly extends Caterpillar instead of Animal and still implement Flyable interface. For Caterpillar, it should extend Animal and implement Walkable interface.
  - Since the way Butterfly walk is actually walk rathan than crawling like a Caterpillar, we also need to override a suitable walk() for them.
  
IV. Part E:
  - A list of animals should be created corresponding to the way we structured our classes. In our case, no need to create general classes (classes have sub-classes) like Animal,Bird, Fish.
  - Take advantage of stream in Java 8 to count the number of animals which can do a specific function by checking if they are instances of specific interfaces.
  
V. Bonus: Although I dont have enough time for this part, I still want to write down my solution
*Question 1:
  - Every animal has their own origin. Therefore, we can add an Enum for storing their origins. For a rooster as an example, we can create a HashMap to store a key, value pair of an origin with its string of sound ("Vietnam", "cook-ku-u"; "Canada", "Cock-a-doodle-doo"). Then, in the sound() method of Chicken, we can make a suitable sound of a rooster based on its origin.

*Question 2:
  - Springboot framework can be used for easily designing REST APIs for querying these animals.
  - The key thing is we need to define suitable RequestMappingURL and the JSONProperties for Animal attributes.
