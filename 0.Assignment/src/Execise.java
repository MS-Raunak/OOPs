interface Sim{}

class Airtel implements Sim{}
class Jio implements Sim{}

class BSNL{}
class MTN{}

class SimUser{
    public void displaySimFeatures(Object object){
        if (object instanceof Sim){
            System.out.println(object.getClass().getSimpleName() + " supported 5g");
            return;
        }
        System.out.println(object.getClass().getSimpleName() + " not supported 5g");
    }
}


public class Execise {
    public static void main(String[] args) {
        SimUser user = new SimUser();
        user.displaySimFeatures(new BSNL());
    }
}


/*
1.Types Of Arguments
2. Typecasting
3. Class & Objects
4. Difference b/w static and no-static var
5. JDK
6. Static vs Non-Static methods
7. Abandon Object
8. Why static and non-static method
9. this keyword & call to this()
10 Blocks or initializer
11. Method overloading
12. Constructor & Constructor  Overloading, Constructor Chaining
13. Final Keyword
14. Has-A Relationship
15. Is-A Relationship or Inheritance
16. Object class
17. Super keyword & call to super()
18. Access Modifier
19. Method Overriding
20. Annotation(@override)
21. Non-primitive typecasting
22. Break Label
23. Binding(Compile time & Runtime)
24. Method Hiding
25. Abstract class & Concrete class
26. Abstract method & Concrete method
27. Interface(Java7,8,9)
28. Changing Parent
29. Default Method(j8)
30. Down casting
31. InstanceOf keyword
32. Functional Interface
33. Marker Interface
34. Tight Coupling
35. Loose Coupling
36. Polymorphism
37. Advantages of Polymorphism
38. Abstraction
39. When to use Abstract class
40. Advantages of interfaces over Abstract class
41. Data Encapsulation
42. Advantages of data encapsulation


* Strong Num : Factorial of each
* Armstrong num: power of digit count


























 */


