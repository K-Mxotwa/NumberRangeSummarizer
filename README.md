Task: Implement code which has the ability to produce a comma delimited list of numbers, grouping the numbers into a range when they are sequancial.

Sample input: "1,3 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31"

Sample output: "1, 3, 6-8, 12-15, 21-24, 31"

Solution.

Assumptions:
- Input can be an empty string
- Input can be an single value string
- Input can be an multiple values string
- The string can come in sorterd or unsorted form
- Values in the input string can be negetive or positive
- The values contained in the input string can be of any length

Approach:
- Used 3 variables(beggining, currentNumber, end) to track the if range continue
- beggining marks the beggining of the range
- end marks the end of the range
- currentNumber is number used to check if the range continues or not
- The range continues if the difference between end and current number equals 1
- the range end if the difference between end and current number is greater than 1
- it is single value range if between end and current number is greater than 1 and beggining equals end


Tools used:
- IntelliJ
- Maven
- JUnit
- Java 11
- Git

  
Testing:
- Navigate to the project directory in the terminal and execute the command below
- mvn test
