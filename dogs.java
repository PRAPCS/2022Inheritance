public class dogs extends pets{

private int legs;

  public dogs(String n, int l){
   super(n);
    legs = l;
     
  }

  public int getLegs(){
    return legs;
  }

 // public String getName(){
   // return "I have overridden the parent run my //version"+super.getName();
 // }

  public String toString(){
    return super.toString()+ " It has "+legs+" legs.";
  }


  
}