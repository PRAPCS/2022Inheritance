public class puppy extends dogs{

  private int age;

  public puppy(String n, int l, int a){
    super(n,l);
    age =a;
  }

  public int getAge(){
    return age;
  }

  public String toString(){
    return super.toString()+" My age is: "+age;
  }
}