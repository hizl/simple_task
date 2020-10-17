# simple_task
solution task from lang and rules 



1. create exceptions: MyArraySizeException (incorrect array size), and
   My Array Data Exception (something is wrong in the array cell);
2. Write a method whose input is a two-dimensional string array (String[][]) of size
   4×4. When submitting an array of a different size, you must throw an exception
   MyArraySizeException.    
3. next, the method must go through all the elements of the array, convert to int, and
       sum. If the conversion failed in some element of the array (for example, the
       cell contains a character or text instead of a number), an exception must be thrown
       My Array Data Exception with details of which cell contains invalid Data.
       Data calculation for this matrix is stopped.
4. In the main() method need to call a derived method to handle possible exceptions
   MySizeArrayException and MyArrayDataException and output the calculation result.
   Note : to convert a string to a number, you can use the method of the Integer class:
   **Integer. valueOf ( "1" )**
