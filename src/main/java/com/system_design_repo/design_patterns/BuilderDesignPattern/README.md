# Builder Pattern in Software Design

## Introduction

The **Builder Pattern** is a **creational design pattern** used to construct complex objects step by step. It allows the creation of objects with many optional parameters or parts, ensuring that the object is built in a flexible, incremental way. The Builder Pattern is used to separate the construction of an object from its representation.

## Key Components of the Builder Pattern

The Builder Pattern consists of the following key components:

1. **Product**:
    - The complex object that needs to be created. It typically has multiple parts that need to be assembled.

2. **Builder**:
    - Defines the abstract interface for building parts of the `Product`. It provides methods to construct the object in a specific way, like setting the CPU, RAM, etc.

3. **ConcreteBuilder**:
    - Implements the `Builder` interface and constructs the parts of the `Product`. It is responsible for assembling the parts and returning the final `Product`.

4. **Director**:
    - The director is responsible for managing the construction process. It directs the `Builder` to assemble the parts in a specific order.

5. **Client**:
    - The client uses the `Director` and `Builder` to create the final product. The client may choose a specific type of builder and initiate the construction process.

## How the Builder Pattern Works

1. **Client** initiates the process by providing a `Builder` object to the `Director`.
2. **Director** calls methods on the `Builder` to build individual parts of the product (e.g., CPU, RAM, Storage).
3. **ConcreteBuilder** implements the actual logic to assemble and create the product. It defines the parts and their assembly.
4. The **Client** can retrieve the constructed product by calling `getResult()` on the builder.

## Flow of the Builder Pattern

### 1. Product Creation
The `Product` is the final object being constructed. It is typically complex and consists of multiple parts, which can be configured in various ways depending on the builder used.

### 2. Builder Interface
The `Builder` interface defines all the steps needed to create the object (e.g., building CPU, RAM, storage). It provides methods to set each part of the product.

### 3. Concrete Builder
The `ConcreteBuilder` is a class that implements the `Builder` interface. It performs the actual construction by setting each part of the product according to the requirements (e.g., gaming computer, business computer).

### 4. Director
The `Director` orchestrates the construction process by calling methods on the builder. It ensures that the steps are followed in the correct order to create the product.

### 5. Client
The client uses the `Director` and a specific `Builder` to create the product. The client does not need to know the details of the construction process, as it is abstracted away.

## UML Diagram

```plaintext
+--------------------+        +-----------------+
|     Director       |        |     Builder     |
|--------------------|        |-----------------|
| - builder: Builder |<>----->| + buildCPU()    |
|--------------------|        | + buildRAM()    |
| + construct()      |        | + buildStorage()|
|                    |        | + getResult()   |
+--------------------+        +-----------------+
                                       ^
                                       |
                               +----------------------+
                               |   ConcreteBuilder    |
                               |----------------------|
                               | - product: Product   |
                               | + buildCPU()         |
                               | + buildRAM()         |
                               | + buildStorage()     |
                               | + getResult()        |
                               +----------------------+
                                       ^
                                       |
                             +------------------+
                             |     Product      |
                             |------------------|
                             | - CPU            |
                             | - RAM            |
                             | - Storage        |
                             | + displayInfo()  |
                             +------------------+
