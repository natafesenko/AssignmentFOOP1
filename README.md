# AssignmentFOOP



- [X] Cover Page

- [X] Introduction

- [X] Algorithm (Flowchart and Pseudocode)

- [X] Entire Programming Code with Commenting and Prudent Printing printed from Eclipse

- [X] Screen Printout of working program (1)

- [X] Errors Documented

- [X] Error Screen Printouts (2) 

- [X] Conclusion

- [X] Bibliography

## Introduction

As they say – well begun is half done.  So, I write simple program in Java. Why? Because I wanted to try, AND I did it! Knowing how to write, compile and execute code is a skill I'll need throughout my professional career. In this course, I've learned how to create software programs using standard coding structures and processes such as variables, constants, operators, decision logic, iteration constructs, and functions. For this assignment, I wrote an application using the Java programming language. 

My program count index BMI it’s one project, one class and six methods. I use a Imperial BMI Formula 

BMI = 703 × weight (lbs) / height (in)* height (in) 

```
This program calculates index BMI 

OUTPUT welcomeMessage(); 
OUTPUT "What your Weight? (lb)"
INPUT user input his weight
STORE the user's input in the weight variable
INPUT user input his hieght
STORE the user's input in the height variable
STORE check that the input value is not 0
  IF value = 0
  OUTPUT "You must provide a correct input(double precision float)"
STORE count BMI in Imperial BMI Formula
STORE compare BMI in Imperial BMI Formula
  IF bmi < 15 
  OUTPUT "You have a Very severely underweight"
  IF bmi <= 16 
  OUTPUT "You have a Severely underweight"
  IF bmi <= 18.5
  OUTPUT "You have a Underweight"
  IF bmi <= 25
  OUTPUT "You have a Normal (healthy weight)"
  IF bmi >= 30
  OUTPUT "You have a Overweight"
  IF bmi >= 35
  OUTPUT "You have a Moderately obese"
  IF bmi >= 40
  OUTPUT "You have a Severely obese"
  IF bmi > 40
  OUTPUT "You have a Very severely obese"
STORE casting BMI int to double
OUTPUT ask user how value show for him
INPUT user input his answer
  IF 1 
  OUTPUT "Your BMI is " + intBmi
  IF 2
  OUTPUT "Your BMI is " + Bmi
```

## Calculator BMI

The Calculator app is a simple app written in Java.  
You can always get the latest version of Calculator from this repository.

### Features

- [x] It's using Imperial BMI formula for calculation

- [x] BMI weight categories as a result

- [x] Conversion between int and double of measurement.

### How to build and run

```sh
javac CountBMI.java && java CountBMI

