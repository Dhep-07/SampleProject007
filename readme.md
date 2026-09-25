# Student Result Calculator

A simple Java console application that calculates a student's **total marks**, **average marks**, and determines whether the student has **passed or failed**.

## 📌 Features

* Stores a student's name
* Accepts marks for three subjects
* Calculates the total marks
* Calculates the average marks
* Determines PASS or FAIL based on the average
* Displays the result in a simple console format

## 🛠️ Technologies Used

* **Java**
* **Java Collections Framework** (`java.util.*`)
* IntelliJ IDEA or any Java-compatible IDE

## 📋 Program Logic

The program currently uses three subject marks:

```java
int mark1 = 85;
int mark2 = 92;
int mark3 = 88;
```

The total is calculated using:

```java
int total = mark1 + mark2 + mark3;
```

The average is calculated using:

```java
double average = total / 3.0;
```

The student passes if the average is **50 or above**:

```java
if (average >= 50)
    System.out.println("Result    : PASS");
else
    System.out.println("Result    : FAIL");
```

## ▶️ Example

For the current values:

| Subject     |     Marks |
| ----------- | --------: |
| Subject 1   |        85 |
| Subject 2   |        92 |
| Subject 3   |        88 |
| **Total**   |   **265** |
| **Average** | **88.33** |

Since the average is greater than 50, the result is:

```text
Result    : PASS
```

## 💻 Expected Output

```text
Student Result
--------------------
Name      : Rahul
Total     : 265
Average   : 88.33333333333333
Result    : PASS
```

## 🚀 How to Run

### Prerequisites

Make sure Java is installed on your system.

Check your Java installation:

```bash
java -version
```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Navigate to:

   ```text
   src/main/java/org/example/Main.java
   ```
3. Open `Main.java`.
4. Click the **Run** button.
5. The result will be displayed in the console.

### Using the Terminal

Compile the Java file:

```bash
javac Main.java
```

Run the program:

```bash
java Main
```

## 📂 Project Structure

```text
SampleProject007/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   └── Main.java
│
├── README.md
└── ...
```

## 🔧 Customization

You can change the student's name and marks directly in `Main.java`:

```java
String studentName = "Rahul";
int mark1 = 85;
int mark2 = 92;
int mark3 = 88;
```

For example:

```java
String studentName = "Arun";
int mark1 = 45;
int mark2 = 55;
int mark3 = 40;
```

The program will automatically recalculate the total, average, and result.

## 🔮 Future Improvements

Possible improvements for this project include:

* Accepting marks from the user using `Scanner`
* Supporting more subjects
* Displaying grades such as A, B, C, and D
* Adding student roll number
* Validating marks between 0 and 100
* Supporting multiple students
* Displaying the result as a formatted report

## 👨‍💻 Author

**Dhep-07**

GitHub: https://github.com/Dhep-07/SampleProject007

## 📄 License

This project is created for educational and learning purposes.
