## Generics
1. Write a class called WrapperModel that has a generic in its definition (T).
It should have the following structure:
   - int: id
   - String: type
   - T: data
   
It should have getters, setters, constructor, equals, hashCode.


## Collections
2. Create an ArrayList of type Integer and add the number from 1 to 100 in
them.
- Iterate through these numbers and show them to the console one by one using an
Iterator
- Get a sublist of all the numbers between 30 and 40. Use a utility method
to randomize the order of your sublist. Then show on the big list in the console.


3. We have an object Student with the following information
    - int: id
    - String: name
    - int: classId
    
Create an ArrayList or Set with a couple of students with different classIds.
Using a Map, try to group the people with the same classId together.
Hint: A generic type can be inside another generic type. (Ex. List<List<Integer>>)



## Multi-threading
4. Create a new class called ClassRoom which has

\- String: name  
\- List<Student>: studentsInClass

\+ ClassRoom(String name) // set studentInClass to an empty ArrayList

\+ getNumberOfStudents(): int  
\+ getName(): String  
\+ addStudent(Student: student)

After this is done:
- Try and use the addStudent on many different Threads (1000) on the same object. 
Then call getNumberOfStudents and see if is what you are expecting.
- Make the ClassRoom safe for multi threaded operations.

- Add a method called graduate(Student: student). Add a sleep on the Thread that waits for 2 seconds.
Open a new Thread and call the graduate(...) method from there. In the main Thread you should
intererupt this thread in 1 seonds.
