Creati o clasa cu urmatoarea: forma
Class Building

    - constructionId: int
    - name: String
    - capacity: int
    - dateOfConstruction: LocalDate

The class should a have a constructor with all member variables, getters, setters, toString, equals method 
and hashCode method.(try implementing the equals method yourself).
The class should also implement Comparable using  the **constructionId** as the comparison info.
Create a separate Comparator for this class, but using the **capacity** as the comparison info.
Add a couple of examples in an array and test yours comparison implementations.

More advanced: Write a Comparator class using the **name** as the comparison info,
but do not use the built-in *compareTo* method in String. Try to implement it yourself.
-----------------
Use the Building class to write and read information from a file using the object directly.
- Create a static method that receives an array of *Building* objects and then writes this
objects to a file using ObjectOutputStream.
- Create a static method that receives a file path as a parameter (the file path to the
file you created earlier) and displays the *Building* objects inside.

See ro.cni.javabasicmetrosystems.prepared.day3.io.ObjectOutputStreamEx for an example.


------------------
Create a basic calculator using BigDecimal to make the calculations.
* The user should see a prompt in the console ("Welcome to the calculator! 
Please insert your calculation")
* The user should be able to insert an expression as a String. Examples:
    * 12 + 3 + 4 -> 19
    * 2 * 2.5 + 3 -> 8
    
You can implement the following features in this order (order of difficulty):
* Implement just + and - (ex: 4 - 5 + 7 -> 6)
* Add support for * and / (take into consideration the order of operands (* and / before + and -)
(ex: 4 + 3 * 2 -> 10)
* Advanced: Add support for parentheses (ex: ( 4 - 5 ) * 2 -> -2 )

Hints: 
* You can consider that it is mandatory to add a space between operands, like in
the examples. This will make them easier to separate.
* For the case of parentheses, it may be useful to create a wrapper class
called Operation in which you can separate different groups of parentheses. Then
that class can have a method called getValue that returns BigDecimal to be used
in further operations. (not a requirement, just a suggestion)
