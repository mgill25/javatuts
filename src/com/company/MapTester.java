package com.company;

/**
 * HelloIdea
 * Created by manish on 17/04/15.
 */

import java.util.*;

public class MapTester {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        // We can just swap HashMap with LinkedHashMap if we wish to preserve the order!

        // Initialize frequency table from the command line
        for (String a: args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1); // Set to 1 if never been seen before, otherwise increment
        }

        System.out.println(m.size() + " distinct words");
        System.out.println(m);

        // Get All the keys!
        for (String k: m.keySet()) {
            System.out.println(k);
        }

        // With an iterator
        for (Iterator<String> it = m.keySet().iterator(); it.hasNext(); ) {
            if (it.next() == null) {
                it.remove();
            }
        }

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + ":: " + e.getValue());
        }

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("it", 2);

        // Map algebra
        if (m.entrySet().containsAll(m2.entrySet())) {
            System.out.println("Yep, m2 is a submap of m!");
        }

        Map<String, Integer> m3 = new HashMap<>();
        m3.put("it", 3);

        if (m2.keySet().equals(m3.keySet())) {
            System.out.println("both maps have the same keys oh my gawd!!");
        }

        // Test the validate function defined below (oh god so many types!)
        Set<String> s1 = new HashSet<>();
        s1.add("it");
        s1.add("foo");

        Set<String> s2 = new HashSet<>();
        s2.add("it");
        s2.add("foo");

        boolean valid = validate(m3, s1, s2);
        System.out.println("Valid?: " + valid);

        // All the keys common to 2 map objects
        Set<String> commonKeys = new HashSet<String>(m2.keySet());
        commonKeys.retainAll(m.keySet());
        System.out.println("Keys common to m and m2: " + commonKeys);

        // Remove all pairs from m that are also present in m2
        System.out.println("m before removal: " + m.entrySet());
        m.entrySet().removeAll(m2.entrySet());
        System.out.println("m after removal: " + m.entrySet());

        // Remove all the keys from m2 that have mappings in m3. (pair doesn't have to be equal!)
        // NOTE: we take keySet() of both!
        m2.keySet().removeAll(m3.keySet());
        System.out.println("m2 after removal of all items which have mappings in m3 as well: " + m2.entrySet());

        getContributors();
        fireEmployees();
    }

    static void getContributors() {
        /*  Idiom 1:
            We have a map, managers, that maps each employee to his/her manager.
            Types of keys and values doesn't matter as long as they're the same.
            We want to know who the "individual contributors" are (non-managers)
         */
        Map<String, String> managers = new HashMap<>();
        managers.put("Simon", "Paul");
        managers.put("Ali", "Simon");
        managers.put("Barry", "Simon");
        managers.put("Ronald", "Keith");
        managers.put("Jack", "Barry");

        System.out.println("Here is our managers map: " + managers.entrySet());
        Set<String> individualContributors = new HashSet<>(managers.keySet());
        individualContributors.removeAll(managers.values());
        System.out.println("Here are our individual contributors: " + individualContributors);
        System.out.println("--------------------------------------------------");
    }

    static void fireEmployees() {
        /*  Idiom 2:
            Fire all employees who report directly to the manager named Simon.
        */
        Map<String, String> OrigManagers = new HashMap<>(); // <Employee, Manager> as key, value
        OrigManagers.put("Simon", "Paul");
        OrigManagers.put("Ali", "Simon");
        OrigManagers.put("Russell", "Barry");
        OrigManagers.put("Barry", "Simon");
        OrigManagers.put("Ronald", "Keith");
        OrigManagers.put("Jack", "Barry");
        OrigManagers.put("Paul", "Keith");

        Map<String, String> managers = new HashMap<>(OrigManagers);
        System.out.println("Here is our managers map: " + managers.entrySet());
        managers.values().removeAll(Collections.singleton("Simon"));
        /*
        Collections.singleton is a static factory method that returns an immutable Set
        with the single specific element.
         */
        System.out.println("Here is our managers map: " + managers.entrySet());

        // Once we have done this, we might have employees whose managers no longer work
        // for the company (Simon's employees could themselves have been managers!)
        // See: Russell and Jack reported to Barry who reported to Simon. After firing Barry,
        // they are left with no manager to report to!
        Map<String, String> m = new HashMap<>(managers);
        m.values().removeAll(managers.keySet());
        Set<String> slackers = m.keySet();
        // TODO: this idiom seems a bit buggy. Paul, Ronald have a manager (Keith), so they shouldn't be slackers.
        System.out.println("slackers are: " + slackers);
        System.out.println("--------------------------------------------------");
    }

    static <K, V> boolean validate(Map<K, V> attrMap, Set<K> requiredAttrs, Set<K>permittedAttrs) {
        boolean valid = true;

        Set<K> attrs = attrMap.keySet();

        // attrMap should contain all defined in requiredAttrs
        if (!attrs.containsAll(requiredAttrs)) {
            Set<K> missing = new HashSet<K>(requiredAttrs);
            missing.removeAll(attrs);
            System.out.println("Missing attributes: " + missing);
            valid = false;
        }

        // attrMap can only contain the ones defined in permittedAttrs
        if (!permittedAttrs.containsAll(attrs)) {
            Set<K> illegal = new HashSet<K>(attrs);
            illegal.removeAll(permittedAttrs);
            System.out.println("Illegal attributes: " + illegal);
            valid = false;
        }

        return valid;
    }
}
