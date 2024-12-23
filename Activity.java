public class Activity {
    public static void main(String[] args) {
      Dog myDog = new Dog("Speed", true);
      myDog.setNumberOfPuppies(3); 
   
      Dog puppy1 = new Dog("LeBron", true);
      Dog puppy2 = new Dog("HypeBits", true);
      Dog puppy3 = new Dog("Ray", true);
   
      myDog.addPuppy(puppy1);
      myDog.addPuppy(puppy2);
      myDog.addPuppy(puppy3);
   
      System.out.println("My dog's name is " + myDog.showName());
      myDog.bark(); 
      System.out.println("My dog has " + myDog.showNumberOfPuppies() + " puppies.");
      myDog.showPuppies();
    }
  }
  
  