# Singleton Pattern

## Overview
The Singleton pattern ensures that a class has only one instance and provides a global access point.

## Key Classes
- `ShoppingCart` – Singleton class representing a user's shopping cart.

## Use Case in Project
- Ensuring only one shopping cart instance exists for a user session.

## How It Works
1. `ShoppingCart.getInstance()` returns the single instance.
2. Items are added and shown from the single cart instance.
