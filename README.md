🏭 Warehouse Management System

This project is a Java-based warehouse management system that simulates the management of suppliers, articles (products), and sales transactions within a warehouse.
✨ Features

    📦 Manage Providers: Add, update, and remove suppliers.
    🏷️ Manage Articles: Add, update, and remove items in the inventory.
    💸 Sales Management: Process sales transactions, update stock after sales, and calculate total sales including tax (IVA).

🗂️ Project Structure

The project is organized using object-oriented principles, with the following main classes:

    🏭 Main.java: Manages the overall warehouse operations, including managing suppliers, articles, and processing sales.
    🤝 Provider.java: Represents suppliers who provide items to the warehouse. Each supplier has attributes like supplier code, name, address, phone, email, and a list of articles they supply.
    📦 Article.java: Represents the items in the warehouse, including attributes such as article code, name, description, price, tax, and available units. Articles are associated with suppliers.
    🛒 Sales.java: Handles sales transactions, including details like the price, date, tax percentage (IVA), and total sale amount calculated based on the item price and tax.

💻 Technologies Used

    ☕ Java: The programming language used for the system.
    🧪 JUnit: For testing the functionality of the classes.
    🛠️ Maven: (Optional) for dependency management and project building.
