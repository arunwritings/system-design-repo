## **Factory Pattern**

### **Purpose**

The **Factory Pattern** is a creational design pattern used to provide a way to create objects without specifying the exact class of the object being created. It abstracts the instantiation process, allowing the client to work with a factory method that produces objects of a specific type.

### **When to Use**

Use the **Factory Pattern** when:
- You need to create an object but want to decouple the object creation process from the system using it.
- The class of the object being created is determined at runtime.
- You want to simplify the code and avoid dealing with complex `if-else` or `switch` statements for object creation.

### **Structure**

1. **Product Interface**: Defines the common methods that the concrete products will implement.
2. **Concrete Products**: Implement the product interface and define specific behavior.
3. **Factory**: An abstract class or method that provides a way to create products, usually through a method like `createProduct()`.
4. **Concrete Factory**: Implements the factory method to return a specific product type.

### **Benefits**
- **Decouples object creation**: The client code does not need to know the details of object instantiation.
- **Centralizes creation logic**: The factory encapsulates object creation logic, making it easier to manage.
- **Flexibility**: The object creation logic can be changed without affecting the client code.

