public class Dog{

  private String name;
  public Dog(String name){
    this.name=name;
  }
  public boolean equals(Object other){
    Dog dog = (Dog)other;
    return this.name.equals(dog.name);
  }
}
