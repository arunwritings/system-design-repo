# Adapter Pattern in Software Design

## Introduction

The **Adapter Pattern** is a **structural design pattern** that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by providing a way to adapt one interface to another. This pattern is particularly useful when you have legacy code or third-party libraries with interfaces that do not align with your current application structure.

## Intent

The intent of the Adapter Pattern is to:
- Convert one interface to another expected by the client.
- Enable classes with incompatible interfaces to work together.
- Allow reusing existing classes with minimal changes.

## Components of the Adapter Pattern

The Adapter Pattern consists of the following key components:

1. **Target**:
    - The interface that the client expects. It defines the methods the client can call to perform the desired operation.

2. **Adaptee**:
    - The class with an existing interface that is incompatible with the `Target`. The `Adaptee` has the functionality that needs to be adapted to the `Target`.

3. **Adapter**:
    - A class that implements the `Target` interface and contains an instance of the `Adaptee`. The adapter delegates requests to the `Adaptee`'s methods, adapting them to the `Target` interface.

4. **Client**:
    - The class that uses the `Target` interface. The client doesn't need to know about the `Adaptee` or the `Adapter`; it simply works with the `Target` interface.

## How the Adapter Pattern Works

1. The **Client** communicates with the **Target** interface.
2. The **Adapter** implements the **Target** interface and internally uses the **Adaptee** to fulfill requests.
3. The **Adaptee** has an existing method (or set of methods) that the client wants to use, but its interface does not match the `Target` interface. The adapter converts the method calls to the appropriate format.

---

## UML Diagram

```plaintext
+------------------+        +-----------------+
|      Client      |        |     Target      |
|------------------|        |-----------------|
| - target: Target |<>----->| + request()     |
|------------------|        +-----------------+
| + execute()      |                ^
+------------------+                |
                                    |
                              +---------------------+
                              |      Adapter        |
                              |---------------------|
                              | - adaptee: Adaptee  |
                              | + request()         |
                              +---------------------+
                                    ^
                                    |
                              +---------------------+
                              |      Adaptee        |
                              |---------------------|
                              | + specificRequest() |
                              +---------------------+
