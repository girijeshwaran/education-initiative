# Observer Pattern

## Overview
The Observer pattern defines a one-to-many dependency between objects. When one object (Subject) changes its state, all dependent objects (Observers) are notified and updated automatically.

## Key Classes
- `Product` (Subject) – Maintains state and notifies observers.
- `Customer` (Observer) – Gets notified when product is in stock.
- `Observer` & `Subject` – Interfaces for observer management.

## Use Case in Project
- Notifying customers when a product (e.g., iPhone 15) is back in stock.

## How It Works
1. `Customer` subscribes to `Product`.
2. When `Product.setInStock(true)` is called, all subscribed customers are notified.
