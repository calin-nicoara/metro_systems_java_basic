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
