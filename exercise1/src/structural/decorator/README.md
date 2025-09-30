# Decorator Pattern

## Overview
The Decorator pattern allows behavior to be added to individual objects dynamically without affecting other objects.

## Key Classes
- `ProductFeature` – Interface for products.
- `BaseProduct` – Concrete product.
- `ProductDecorator` – Abstract decorator class.
- `GiftWrap` / `ExtendedWarranty` – Concrete decorators.

## Use Case in Project
- Adding features to products dynamically, e.g., gift wrapping or extended warranty.

## How It Works
1. Wrap a `BaseProduct` with `GiftWrap` and `ExtendedWarranty`.
2. Calling `applyFeature()` applies all features in order.
