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
  }
}