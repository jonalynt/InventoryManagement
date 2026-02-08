<h1 align="center"> HELLO, WORLD! </h1>

<h1 align="center"> Welcome to our Inventory Management Project! </h1>

----

## 🎓 Team: Codeon
**Students:**

👤 Jonalyn Tumpong (lr.jtumpong@mmdc.mcl.edu.ph)  
👤 Noeme Escarlan (lr.nescarlan@mmdc.mcl.edu.ph)  
👤 Shaira Marie Darantinao (lr.smdarantinao@mmdc.mcl.edu.ph)  

**Institution:** Mapúa Malayan Digital College  
**Course:** MO-IT102 - Data Structures and Algorithms  
**Section:** S2101  

---

## 🚀 Project Overview
This project is a Java-based inventory management system designed to track vehicle stock. Following mentor feedback to prioritize simplicity and default organization, we implemented a custom **Singly Linked List** that maintains an alphabetical order by brand using sorted insertion.

## 🛠️ Features & Logic
* **Simplistic Data Structure**: Uses a standard Singly Linked List to reduce architectural complexity.
* **Automatic Alphabetical Sorting**: The `addStock` method uses a sorted insertion algorithm ($O(n)$) to ensure the inventory is always in ascending order (A-Z) by Brand.
* **Search Functionality**: Efficiently locate vehicle records using unique Engine Numbers.
* **Record Management**: Supports removing records via `deleteStock` while preserving list integrity.

## 📈 Technical Details
| Operation | Complexity | Description |
| :--- | :--- | :--- |
| **Insertion** | $O(n)$ | Finds the correct alphabetical spot for the brand. |
| **Search** | $O(n)$ | Linear search by Engine Number. |
| **Deletion** | $O(n)$ | Locates and unlinks the specified node. |

## 💻 Output Example
As seen in our terminal testing, adding cars out of order results in a correctly sorted list:
1. Audi (Brand)
2. BMW (Brand)
3. Toyota (Brand)

---

### <img align ='center' src='https://media2.giphy.com/media/UQDSBzfyiBKvgFcSTw/giphy.gif?cid=ecf05e47p3cd513axbek3f56ti3jzizq8hincw20jauyyfyw&rid=giphy.gif' width ='29' /> Here's some humor for you:
<img src="https://readme-jokes.vercel.app/api" alt="Error fetching resource, Refresh again to view Jokes Card" width = '11000' />

