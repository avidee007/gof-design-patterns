# Template Method Pattern

The Template Method Pattern defines the skeleton of an algorithm in a base class,
allowing subclasses to provide concrete implementations for specific steps.

## Use Cases:

Defining workflows or processes where certain steps are customizable by subclasses.
Frameworks where the overall structure is the same, but specific details can vary.

## Example:

Let’s create an order processor that is customizable for different types
of orders (e.g., in-store pickup vs. online delivery).