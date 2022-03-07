public class pets{

private String name;
  
public pets(String n){
  name = n;
}


public String getName(){
  return name;
}

public void setName(String nn){
  name = nn;
}

public String toString(){
  return "Your pets name is: "+name;
}
  
  
}