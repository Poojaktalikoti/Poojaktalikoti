1)How can you create constants in java?
ans:we must use static and final modifires

2)how many types of data type in java?
ans:two types

3)why Is specifying mandatory in java?
ans:Class is blueprint for object it is like pre-planed structure of home
 i.e virtual and object is actual physical entity

4)what are some common nameing convention in java?
ans:class,package,variable,constant method

5)what is variable initalization?how is different than assignment?
ans:Initializing a variable means specifying an initial value to assign to it

it does not have defined value

6)what is an array?
ans:same type of multiple value is called as array

7)can you pass the -ve number in array size?
ans:no array size can not be -ve.
		 bcoz,the size of an array represents the number of elements,
if we pass the -ve number there will be no compile time error.

8)where does array stored in JVM memory?
ans:heap area

9)what are the advantages of array?
ans:we can store muliple value in single variable
we can store objects in array.

10)what is an anonymous array in java?
ans:we can create an array without name is calle as anonymous.

11)public class Array {
	
	public static void main(String[] args) {
		
		int[] ar = new int[] {1,2,3,4,5};
		System.out.println("elements of given array");
		
		 for (int i = 0; i < ar.length; i++) {  
	            System.out.print(ar[i] + " ");  
	            
		 }

		
	}


}

12)public class Sort {
	
	public static void main(String[] args) {
		int[] ar = {13,7,6,45,21,9,101,102}:
			
			Array.sort(ar);
		
		System.out.println("modified ar[] : %s",Array.toString(ar));
	}
}
}

13)write a program whether to check two given arrays are equal both contain same data type and same length?
ans:
public class Arrays {
    public static void main(String[] args)
    {
        int a[] = { 30, 25, 40, 23 };
        int b[] = { 30, 26, 40 };
	 boolean result = Arrays.equals(a, b);
	if (result == true) ;
            System.out.println("Two arrays are equal");
        }
        else {
            System.out.println("Two arrays are not equal");
        }
    }
}
14)public class New {
    public static void main(String[] args)
    {
        int ar[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= ar.length; i++)
            System.out.println(ar[i]);
    }
}

15)what will happen if you do not intialize the array?
ans:If you don't initialize the numbers in your array, they can be anything.
 Using this instead saves you having to loop over the array and assign every value to 0

16)



17)The particular member belongs to a type itself, rather than to an instance of that type is a static keyword.
static method is member of object it accessible directly
static variable use property of all object

18)yes we can overload the static method must be different in signiture within the same class with mulitiple methods
*no static method can not override bocoz 

19) because it has to be invoked by the JVM

20)set of instruction that is only run only once when class is loaded into memory

21)java constructor can not be static

22)a simple static method is defined and declared in an interface which is being called in the main() method of the Implementation ...

23)calling one constructor inside anothr constructor

24)it is special type of method and it is don't have return type,constructor name same name s a class name

25)if we add return type of constructor then it will become a method of the class

26)No

27)by using reference variable of parentent cls is capable to hold its object reference 


28)		instance
*instunce is object of class
class
*blue print of object

29)2 ways

30)instantinstiating a class

	