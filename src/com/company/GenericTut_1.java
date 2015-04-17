package com.company;
/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */

class Pair<X, Y> {
    private X first;
    private Y second;

    public Pair(X firstArg, Y secondArg) {
        this.first = firstArg;
        this.second = secondArg;
    }

    public X getFirst() { return first; }
    public Y getSecond() { return second; }
    public void setFirst(X arg) { this.first = arg; }
    public void setSecond(Y arg) { this.second = arg; }
}

public class GenericTut_1 {
    static void printPair(Pair<String, Long> pair) {
        System.out.println("("+ pair.getFirst() + ", " + pair.getSecond() + ")");
    }

    static void printPairWild(Pair<?,?> pair) {
        System.out.println("("+ pair.getFirst() + ", " + pair.getSecond() + ")");
    }

    public static void main(String[] args) {
        Pair<String, Long> limit = new Pair<>("Maximum", 1024L);
        printPair(limit);
        limit.setFirst("MAXXXXXXXX");
        printPairWild(limit);
    }

    /*
    ***READ***
    Ref: http://www.angelikalanger.com/GenericsFAQ/FAQSections/ParameterizedTypes.html

    Q: Why do instantiations of a generic type share the same runtime type?
    A: Type Erasure. It omits all information related to the type parameters and the type arguments.
    List<String> translates into the so called raw-type List. Hence, all instantiations of the same
    generic type share the same runtime type, namely the raw type.

    This is evident if we print the name of the class of both an instance of ArrayList<String>,
    and an ArrayList<Long>, we get the same answer: ArrayList, which is the runtime Type.
     */

    /*
    Q: Is List<Object> a SuperType of List<String> ?
    A: NO. different instantiations of the same generic type for different concrete type arguments
    have no type relationship.

    If T1 is a subtype of T1, and G is some Generic Type declaration, that means that
    G<T1> will NOT BE a subtype of G<T2>.

    So something like:
        void PrintAll(ArrayList<Object> lst) {
            for (Object o: lst)
                System.out.println(o);
        }

    when called with something like:
        ArrayList<String> list = new ArrayList<>();
        PrintAll(list); // THIS WILL THROW ERROR
    because they might have the same Generic argument, but the generic argument
    has different Type arguments! It will for the same type argument, however.
    Say, something like Collection.

    Collection will work because List<Object> is compatible to a Collection<Object>.
    This happens because of WildCard instantiations.
     */
}
