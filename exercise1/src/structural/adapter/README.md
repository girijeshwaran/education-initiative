# Adapter Pattern

## Overview
The Adapter pattern allows incompatible interfaces to work together by converting one interface into another.

## Key Classes
- `Shipping` – Target interface.
- `ExternalShippingService` – Existing service with incompatible interface.
- `ShippingAdapter` – Adapter to use the external service.

## Use Case in Project
- Shipping a product using an external service that has a different method signature.

## How It Works
1. `ShippingAdapter` wraps `ExternalShippingService`.
2. Call `ship()` on the adapter to internally call `sendPackage()`.
