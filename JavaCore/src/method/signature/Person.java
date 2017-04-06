package method.signature;

/**
 * Created by sail on 3/18/17 11:20 AM.
 * Project: ToLearn.
 * Function: Test method signature.
 * Explanation: method signature — the method's name and the parameter types.
 * Reference:
 *     1. https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
 *     2. http://blog.csdn.net/l294265421/article/details/46373023
 */
public class Person {
    private String name;
    private String gender;
    private int age;

    // constructor 0: empty
    public Person() {
    }

    /**
     * constructor 1 & 2: can not exist together. Because their parameter types are same.
     *                   (String, String, int)
     *                   (String, String, int)
     * constructor 1 & 3: can exist together. Because their parameter types are different.
     *                   (String, String, int)
     *                   (String, int, String)
     * method signature does nothing with parameter names.
     */
    // constructor 1
    public Person(String name, String gender, int age) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // constructor 2
//    public Person(String gender, String name, int age) {
//        super();
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }

    // constructor 3
    public Person(String name, int age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Ancestor getAncestor() {
        return new Ancestor();
    }
}
