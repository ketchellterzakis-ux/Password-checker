# Password-checker
A command-line tool written in Python that rates how strong a password is and explains what to improve.

## What it does

- Checks password length
- Checks for a mix of uppercase letters, lowercase letters, numbers, and symbols
- Flags passwords that appear on a list of common passwords
- Gives a strength rating (Weak, Medium, or Strong) with tips to improve it

## How to run it

1. Install Python 3 from python.org.
2. Download `password_checker.py`.
3. In a terminal, run:

```
python password_checker.py
```

4. Type a password when asked. The program prints its rating and suggestions.

## Example

```
Enter a password: resume123
Rating: Weak
Tips: Use at least 12 characters. Add uppercase letters and symbols.
```

## What I learned

- Using strings, loops, and conditionals in Python
- How password length and variety affect security
- Reading input and giving clear feedback to the user

## Notes

Passwords are checked on your own computer and are never saved or sent anywhere.
