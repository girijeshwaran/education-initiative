# Java Design Patterns & Mars Rover Project

## Introduction

Demonstrates common **Java design patterns** in real-world scenarios.
Includes a **shopping system** and a **Mars rover simulation**.
Illustrates practical usage of **behavioral, creational, and structural patterns**.

## Exercise 1: Design Patterns Demo

Observer, Strategy, Singleton, Factory, Decorator, and Adapter patterns for a **shopping system**.
Notify customers, select payment methods, manage cart, create products, and add features dynamically.
Run with:

```bash
cd src
javac */*/*.java Main.java
java Main
```

## Exercise 2: Mars Rover Simulation

Simulates a **rover moving on a grid** with obstacles.
Uses Command, Composite, Decorator, Observer, Singleton, and Factory/Strategy patterns.
Run with:

```bash
cd src
javac core/*.java domain/commands/*.java domain/direction/*.java domain/grid/*.java domain/decorator/*.java
java core.MarsRoverApp
```
