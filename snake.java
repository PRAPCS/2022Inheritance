public class snake extends pets{

 private String color;

 public snake(String n, String c){
   super(n);
   color = c;
 }

  public String getColor(){
    return color;
  }

  public String toString(){
    return super.toString()+" I am a snake";
  }
  
}