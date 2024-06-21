# Comparing Python and Java

This project is just for comparing how Java works versus Python.

## Variable Differences

#### Python:
Does not need to identify what a variable will be holding before defining it

#### Java:
Must declare what the variable will hold before defining it. If it will hold a number, declare that it will only hold numbers. If it will hold a string, declare
that it will only hold strings.

I don't think the value type can be changed once the variable has been defined, so make sure it's correct

## Arrays/Lists

#### Python:
Uses Lists

Lists are dynamic. Their sizes can grow and shrink as needed. Lists can have multiple value types in them.

#### Java:
Uses Arrays

Arrays are very rigid. You must declare the array size when you create it, and I haven't found out if that size can be adjusted later or not.

Each array can only take one value type. If a new array is created to hold strings,
that array can only ever hold strings. If another array is created to hold doubles (integers with decimals), then that's the only type of value it can hold.

## Functions/Methods

#### Python:
Uses functions

functions have to be defined before they can be used (in the same file of code - higher lines)

#### Java:
Uses methods

Each method must declare what type of data - if any - will be returned at the end of the method. The return datatype can be a Java primitive datatype, an object, or a collection of a datatype or an object, or can be void.

A void return type means the method does not return a value. If a method has a non-void return type, then it must contain a return statement that specifies the value to return.
