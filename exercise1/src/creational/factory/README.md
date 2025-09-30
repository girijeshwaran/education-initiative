# Factory Pattern

## Overview
The Factory pattern defines an interface for creating objects but lets subclasses decide which class to instantiate.

## Key Classes
- `ProductFactoryType` – Interface for products.
- `Electronics` / `Clothing` – Concrete products.
- `ProductFactory` – Factory class to create products based on input.

## Use Case in Project
- Dynamically creating product objects (Electronics, Clothing) without specifying concrete classes.

## How It Works
1. Call `ProductFactory.createProduct("electronics")`.
2. Factory returns an object of type `Electronics`.
