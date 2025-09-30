# Strategy Pattern

## Overview
The Strategy pattern allows selecting an algorithm at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

## Key Classes
- `PaymentStrategy` – Interface for payment methods.
- `CreditCardPayment` / `PayPalPayment` – Concrete strategies.
- `PaymentContext` – Uses the strategy to process payment.

## Use Case in Project
- Choosing between Credit Card and PayPal payments dynamically.

## How It Works
1. `PaymentContext` is configured with a `PaymentStrategy`.
2. Calling `payAmount()` executes the selected strategy.
