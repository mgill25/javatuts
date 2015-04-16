package com.company;

/**
 * HelloIdea
 * Created by Manish on 16/04/15.
 */

import java.lang.annotation.*;

/*
Annotations are a form of metadata, which are not really part of the
program itself, but provide data about it to the compiler.

Annotations have a number of uses, like:
    1. Information for the compiler - can be used by compiler to detect errors and supress warnings.
    2. Compile time and deployment time processing - Tools can process annotated information to generate code,
    XML files and so forth.
    3. Runtime processing - Some annotations are available to be examined at runtime.
 */

// Add metadata by first defining an annotation type. Annotation types are interfaces.
// We use @Documented annotation to make the information in @ClassPreamble appear
// in Javadoc-generated documentation
// Notice that @Documented is a meta-annotation that we apply to the ClassPreamble annotation!
@Documented
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

@ClassPreamble(
    author = "John Doe",
    date = "3/17/2002",
    currentRevision = 6,
    lastModified = "4/12/2004",
    lastModifiedBy = "Dane Joe",
    reviewers = {"Alice", "Bob", "Cindy"}
)
public class AnnotationTut extends SomeBaseClass {
    /*
    Some Predefined Annotation Types.
    The ones defined in java.lang are:
        - @Deprecated
        - @Override
        - @SupressWarnings
     */

    // Javadoc comment follows.
    /**
     * @deprecated
     * Explanation of why it was deprecated.
     * Notice that the case is important. The javadoc tag has lowercase 'd',
     * while the annotation itself has uppercase 'D'.
     */
    @Deprecated
    static void deprecatedMethod() {

    }

    /*
    @Override is not required to override a method, but it helps
    to prevent errors. If the method override is not correct,
    compiler will complain!
     */
    @Override
    int overriddenMethod() {
        return 20;
    }

    public static void main(String[] args) {
        AnnotationTut obj = new AnnotationTut();
        System.out.println("object is: " + obj);
        System.out.println("obj method result: " + obj.overriddenMethod());
    }
}


class SomeBaseClass {
    int overriddenMethod() {
        return 10;
    }
}
