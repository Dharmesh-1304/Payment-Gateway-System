# Payment Gateway System (Low-Level Design)

## Overview
This project demonstrates a scalable Payment Gateway System built using Java and Object-Oriented Programming principles.

## Features
- Multiple payment methods (UPI, Credit Card, Net Banking)
- Factory Pattern for payment creation
- Strategy Pattern for payment processing
- Observer Pattern for notifications
- Retry mechanism for fault tolerance
- Transaction tracking with status
- Layered architecture (Controller, Service, Repository)

## Tech Stack
- Java
- OOP & SOLID Principles
- Design Patterns

## How to Run
```bash
javac payment/*.java factory/*.java validator/*.java processor/*.java \
model/*.java observer/*.java logger/*.java exception/*.java \
repository/*.java service/*.java controller/*.java main/Main.java

java main.Main
