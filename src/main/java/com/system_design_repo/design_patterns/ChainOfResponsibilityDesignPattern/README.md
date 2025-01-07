# Chain of Responsibility Pattern

## Introduction

The **Chain of Responsibility** is a **behavioral design pattern** that allows passing requests along a chain of handlers. Each handler in the chain either handles the request or passes it to the next handler in the chain. This pattern decouples the sender of the request from the handler, allowing multiple objects to process the request without knowing which one will actually handle it.

This pattern is particularly useful when you need to process a request through a series of handlers, and each handler has the option to either handle the request or forward it to the next handler.

## Intent

The intent of the Chain of Responsibility Pattern is to:
- Allow multiple handlers to process a request without the sender needing to know which handler will take care of it.
- Achieve flexibility in the assignment of responsibilities.
- Decouple the sender and receiver of the request by allowing the request to pass through a chain of handlers.

## Components of the Chain of Responsibility Pattern

The pattern involves the following key components:

1. **Handler**:
    - The abstract class or interface that declares the method for handling the request and for setting the next handler in the chain.

2. **ConcreteHandler**:
    - The class that implements the `Handler` interface and processes requests. If it cannot handle the request, it forwards it to the next handler in the chain.

3. **Client**:
    - The class that sends the request to the first handler in the chain. The client does not know which handler will process the request.

---

## How the Chain of Responsibility Pattern Works

1. A **client** sends a request to the first handler in the chain.
2. The **handler** either processes the request or passes it to the next handler in the chain if it cannot handle it.
3. This process continues until a handler processes the request or the end of the chain is reached.

---

## UML Diagram

```plaintext
+------------------+         +------------------+         +------------------+
|    Client        |         |     Handler      |         |  ConcreteHandler |
|------------------|         |------------------|         |------------------|
| - handler: Handler|<>------>| + handleRequest()|<------->| + handleRequest() |
|------------------|         | + setNextHandler()|         |------------------|
| + sendRequest()  |         +------------------+         | + doHandler()     |
+------------------+                                       +------------------+
