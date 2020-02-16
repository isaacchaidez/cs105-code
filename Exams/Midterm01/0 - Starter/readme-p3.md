



# Problem 3 - Encapsulation

## Problem Context

You are creating a small program that will encapsulate an un-encapsulated class

```
public class Employee{

	public String name;
	public double salary;
	public int yearsOfService;
}
```




## Requirements

Encapsulate the class above in the following fashion:

1. Ensure all instance variables are initialized at construction
2. Ensure that years of service is read-only after object construction
3. Ensure that instance variables cannot be directly accessed or modified from the outside
4. Name cannot exceed 25 characters
5. Salary cannot be raised more than 6% at a time.
6. Salary cannot be raised more than once. 



To test your code

1. In the **edu.sbcc.cs105.p3** folder, create your code
2. Change the problemId in Program.main to **p3.**