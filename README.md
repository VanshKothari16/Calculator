# Structure:
This class is used to make a simple Frame which shows all four types of Calculator in the Form of Button.In this class, I had used two major classes to design the Frame. One is **JFrame** to design the Frame with its different methods like **setBounds(),setDefaultCloseOperation(),setLayout(),add()**,etc. Other is **JButton** class to show four button on the Frame with its different method like **setTitle(),setBounds(),addActionListener()**,etc. Most important feature of this class is that I made use of **ActionListener** interface to add some action when user press the button with its overrided method **"public void addActionPerformed(ActionEvent e)"**; I have extended **Connection** java class in this class so that when user press any of the four button it's respective class will run.
   <p align="center">
     <img src="https://github.com/user-attachments/assets/9c9aebbd-5a16-4788-b710-7754a8d3f8eb" alt="Image" width="300"/>
   </p>

# Connection
This class just contains **four methods** and in each method **the object of remaining four classes is instantiated.** 

# SIP Calculator
In this class, I accept the Fixed amount invested every month as a SIP, the Rate of Interest in Percentage, and the Number of years. I had used this formula: FV=P(1+i)^(n-1).
   <p align="center">
     <img src="https://github.com/user-attachments/assets/0e58911c-38fc-4183-a1b1-5226b2085059" alt="Image" width="300"/>
   </p>

# CAGR Calculator
   <p align="center">
     <img src="https://github.com/user-attachments/assets/e60ec649-f1a6-43de-9408-d3a1af2f1130" alt="Image" width="300"/>
   </p>

# Commercial Calculator
   <p align="center">
     <img src="https://github.com/user-attachments/assets/04a6976b-91a8-4591-9a9f-b361c6ee67b1" alt="Image" width="300"/>
   </p>


# EMI Calculator
   <p align="center">
     <img src="https://github.com/user-attachments/assets/1c68cf5d-1390-459e-88fd-95dcbb1ff76b" alt="Image" width="300"/>
   </p>
