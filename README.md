# java_practice

Logic Building 1:
Reversing Words with options: Write a function (method) that takes as input a string (sentence) and generates a new string (modified sentence) by reversing the words in the original string, maintaining the words positions. 
In addition, the function should be able to control the reversing of the case (uppercase or lowercase) based on a case_option parameter, as follows –

If case_option = 0, Normal reversal of words
i.e. If the original sentence is “Wipro TechNologies BangaLore”, 
the new reversed sentence should be “orpiW seigoloNhceT eroLagnaB”

If case_option = 1, Reversal of words with retaining position’s Case
i.e. If the original sentence is “Wipro TechNologies BangaLore”, 
the new reversed sentence should be “Orpiw SeigOlonhcet ErolaGnab”
Note that positions 1, 7, 11, 20 and 25 in the original string are uppercase W, T and B.
Similarly positions 1, 7, 11, 20 and 25 in the new string are uppercase O, S, O, E and G.

If case_option = 2, Reversal of words including Case
i.e. If the original sentence is “Wipro Technologies Bangalore”, 
the new reversed sentence should be “ORPIw SEIGOLONHCEt EROLAGNAb”
Note that W, T and B, that were uppercase in original string have become lowercase and all the lowercase letters have become uppercase.

The prototype of the function is:
public static void reverseWords_andCase(String sentence, int case_option);
The reversed string is expected to be assigned to the member String output1.

NOTE:
    a) Only space character should be treated as the word separator. i.e. “Hello World” should be treated as two separate words “Hello” and “World”. However, “Hello,World”, “Hello;World”, “Hello-World” or “Hello/World” should be considered as a single word.
    b) Non-alphabetic characters in the string will not be subjected to case-changes. For example, if case_option=1, and the original sentence is “Wipro TechNologies, Bangalore”, the new reversed sentence should be “Orpiw ,seiGolonhceT Erolagnab”. Note that comma has been treated as part of the word “Technologies,” and because comma had to take the position of uppercase T it remained as a comma and uppercase T took the position of comma. However the words “Wipro” and “Bangalore” have changed to “Orpiw” and “Erolagnab”.

    c) Some more examples –
Input string = “I Am alWays 24#7 Busy.” 
With case-option = 0, reversed string will be “I mA syaWla 7#42 .ysuB”
With case-option = 1, reversed string will be “I Ma syAwla 7#42 .ysuB”
With case-option = 2, reversed string will be “i Ma SYAwLA 7#42 .YSUb”

    d) Please ensure that no extra (additional) space characters are embedded within the resultant reversed string.

Example(s):


Input
Expected Output

Argument (StateName)
case_opt

1
Wipro Technologies Bangalore
0
orpiW seigolonhceT erolagnaB
2
Wipro Technologies, Bangalore
0
orpiW ,seigolonhceT erolagnaB
3
Wipro Technologies Bangalore
1
Orpiw Seigolonhcet Erolagnab
4
Wipro Technologies, Bangalore
1
Orpiw ,seigolonhceT Erolagnab
5
Wipro Technologies, Bangalore
2
ORPIw ,SEIGOLONHCEt EROLAGNAb
6
The day is Good and Dry.
2
EHt YAD SI DOOg DNA .YRd
7
Prudential World CUP was held in 1983
2
LAITNEDURp DLROw puc SAW DLEH NI 3891
8
17%89 was the Code!!
2
98%71 SAW EHT !!EDOc
import java.io.*;
import  java.util.*;

class UserMainCode
{
    public static String output1;
	    		
    public static void reverseWords_andCase(String str, int input1){
        //Write code here
    }	
    
}

Logic Building 2:
    1) Simple Encoded Array: Maya has stored few confidential numbers in an array (array of int). To ensure that others do not find the numbers easily, she has applied a simple encoding. 
Encoding used: Each array element has been substituted with a value that is the sum of its original value and its succeeding element’s value.
i.e. arr[i] = arr[i] + arr[i+1]
e.g. value in arr[0] = original value of arr[0] + original value of arr[1]
Also note that value of last element i.e. arr[last index] remains unchanged.

Example:
If the original array is – 
{2, 5, 1, 7, 9, 3}
The encoded array would be –
{7, 6, 8, 16, 12, 3}

Provided the encoded array, you are expected to find the –
    a) First number (value in index 0) in the original array
    b) Sum of all numbers in the original array

The prototype of the function is:
public static void findOriginalFirstAndSum(int[] input1);
where input1 is the encoded array.
The method is expected to –
    • find the value of the first number of the original array and store it in the member output1 and 
    • find the sum of all numbers in the original array and store it in the member output2

Assumption(s):
    • The array elements can be positive and/or negative numbers


Example 1:
Original array = {2, 5, 1, 7, 9, 3}
Encoded array = {7, 6, 8, 16, 12, 3}
First number in original array = 2
Sum of all numbers in original array = 27
NOTE: Only the “Encoded array” will be supplied to the function and it is expected to do the processing to find the expected result values.

Example 2:
Original array = {20,15,17,45,23,12,78,54,21,98,70,80,56,71,77,93,44,19}
Encoded array = {35,32,62,68,35,90,132,75,119,168,150,136,127,148,170,137,63,19}
First number in original array = 20
Sum of all numbers in original array = 893

Example 3:
Original array = {8, -10, 3, -15}
Encoded array = {-2, -7, -12, -15}
First number in original array = 8
Sum of all numbers in original array = -14

Example 4:
Original array = {9}
Encoded array = {9}
First number in original array = 9
Sum of all numbers in original array = 9

Example 5:
Original array = {10, 12, 3, 5, 7, 20}
Encoded array = {22, 15, 8, 12, 27, 20}
First number in original array = 10
Sum of all numbers in original array = 57

Example 6:
Original array = {1, -45, 8, 23, 0, 0, -6, 89, 21, 53}
Encoded array = {-44, -37, 31, 23, 0, -6, 83, 110, 74, 53}
First number in original array = 1
Sum of all numbers in original array = 144

Example 7:
Original array = {12,17,-13,-16,0,90,87,-56,67,-67,-67,6,11,12,9,-1,0,0,8,3,4,2,-6,9,-18,19,27,-5,0,23,28,-56,-81,-50,16,0}
Encoded array = {29,4,-29,-16,90,177,31,11,0,-134,-61,17,23,21,8,-1,0,8,11,7,6,-4,3,-9,1,46,22,-5,23,51,-28,-137,-131,-34,16,0}
First number in original array = 12
Sum of all numbers in original array = 14

import java.io.*;
import  java.util.*;

class UserMainCode
{
    public static int output1, output2;
	    		
public static void findOriginalFirstAndSum(int[] input1){
        //Write code here
    }	
}

Sample Reference solution –
    public static void findOriginalFirstAndSum(int[] input1)
    {
        //Write code here
        int sum=input1[input1.length-1]; //Storing the last element in sum

        for (int i = input1.length-2; i>=0; i--)
        {
  //Decode each element: Subtract each element with its successive element
            input1[i] -= input1[i+1]; 
            sum += input1[i]; 
        }

        output1 = input1[0]; // Store first element in output1
        output2 = sum;       // Store sum of all elements in output2
    }


