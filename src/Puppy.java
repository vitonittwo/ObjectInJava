public class Puppy {

    int puppyAge;

    // this method displays the puppy name
    public Puppy(String name)
    {
        System.out.println("Puppy name is " + name);
    }

    // this method displays the puppy age
    public int getAge() {
        System.out.println("Puppy age is " + puppyAge);
        return puppyAge;
    }

    // this method sets the puppy age
    public void setAge(int age) {
        puppyAge = age;
    }

public static void main(String[] args) {

        // create Puppy class objects
         Puppy myPuppy = new Puppy("Blondy");
    myPuppy.setAge( 4 );
    myPuppy.getAge();
         Puppy yourPuppy = new Puppy("Karry");
    yourPuppy.setAge( 7 );
    yourPuppy.getAge();
         Puppy herPuppy = new Puppy("Lilly");
    herPuppy.setAge( 5 );
    herPuppy.getAge();
         Puppy hisPuppy = new Puppy("Sanny");
    hisPuppy.setAge( 3 );
    hisPuppy.getAge();
         Puppy thatPuppy = new Puppy("Sunny");
    thatPuppy.setAge( 8 );
    thatPuppy.getAge();

    }


}


   // String[] whosePuppy = {"My", "Your", "Her", "His", "That"};
   // for (int i = 0; i < 5; i++) {

// System.out.println(whosePuppy[i] + " puppy name is " + name);