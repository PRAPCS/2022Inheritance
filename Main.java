class Main {
  public static void main(String[] args) {
    pets p = new pets("Bruno");
    System.out.println(p);
    //System.out.println(p.getLegs());

   dogs d = new dogs("Pluto", 4);
    System.out.println(d.toString());
    System.out.println(d.getName());//Look in dogs first then the parent for the method

    puppy pup = new puppy("Doge", 4, 2);
    System.out.println(pup);
    System.out.println(pup.getName());

    snake s = new snake("Kaa","Red");
    System.out.println(s.getColor());
    System.out.println(s);
    System.out.println(s.getName());
    
  }
}