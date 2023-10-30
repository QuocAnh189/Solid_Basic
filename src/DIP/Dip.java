package DIP;

class Dip {
    public static void main(String[] args) {
        Person parent = new Person("AnhQuoc", Role.PARENT);
        Person child1 = new Person("VanDuy", Role.CHILD);
        Person child2 = new Person("VuongDuy", Role.CHILD);

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent);
        relationships.addParentAndChild(child1);
        relationships.addParentAndChild(child2);

        Research research = new Research(parent, relationships);
        System.out.println(research);

    }
}
