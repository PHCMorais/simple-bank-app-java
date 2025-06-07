# Simple Bank App in Java

This is a simple Java console application that simulates the creation and operation of a bank account. The project was developed as part of my programming studies, and it focuses on practicing object-oriented programming concepts using basic input/output.

## 💡 Project Description

The application allows the user to:

- Create a bank account with or without an initial deposit.
- Make deposits and withdrawals.
- View account information after each operation.
- Apply a fixed bank fee of $5.00 on each withdrawal.

Design decisions:

- The account number is immutable after creation.
- The account holder's name can be updated.
- The balance can only be modified through deposit or withdrawal methods.

## 📚 Learning Goals

This project helps reinforce:

- Class structure and encapsulation
- Constructors and method overloading
- Getters and setters
- Method-based access to internal data
- Input handling using `Scanner`
- Output formatting using `String.format`

## 🛠️ Technologies Used

- Java (JDK 17 or higher recommended)
- Console-based application

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/simple-bank-app-java.git
   ```
2. Open the project in your Java IDE (such as IntelliJ IDEA, Eclipse, or VS Code).

3. Compile and run `Program.java`.

## 🖥️ Sample Output

```
Enter account number: 8532
Enter account holder: Alex Green
Is there a initial deposit (y/n)
y
Enter initial deposit value: $500.00

Account Data: 
Account 8532, Holder: Alex Green, Balance: 500.00

Enter deposit value: $200.00
Updated account Data: 
Account 8532, Holder: Alex Green, Balance: 700.00

Enter withdraw value: $300.00
Updated account Data: 
Account 8532, Holder: Alex Green, Balance: 395.00
```

## 📝 Notes

The code is written with detailed comments for educational purposes. It is part of a learning journey in Java, focused on understanding the basics of OOP and user input.

---

Feel free to fork this project, test it, or suggest improvements!
