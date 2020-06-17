# Math Mania Game (MMG) GUI 

**COMP603 : Program Design & Construction  (Project 2)** <br/>
-JAVA Graphical User Interface (GUI) version<br/>
-Include database component (Apache Derby DB) to the product<br/>
-Implement design patterns (Model View Controller)<br/>
-Include necessary unit tests.<br/><br/>

**About MMGame**

Math Mania Game is a simple mathematical quiz game that revolves around the 4 basic mathematical operations.<br/>
*Addition, Subtraction, Multiplication and Division*<br/>
It has three levels varying difficulty such as different operations and amount of points to score. 
Please read the game rules before playing, thank you.<br/><br/>

**1. Login form** <br/>
This form is displayed when the game is run. Player needs to login into their account by filling in their correct username and password, whereas new players can go to 'register' button to create an account in the game. <br/>
- Login button
  - This will open the 'Main Menu' of MMG game when correct username and password are entered. Appropriate messages will be displayed when user enters wrong password or username, or blank fields.
- Register button
  - This will open the 'Register' form.

<p align="center">
  <img width="350" height="375" src="https://user-images.githubusercontent.com/62451840/84591930-438f1780-ae96-11ea-874e-192f739256b2.png"><br><br>
    <img width="500" height="101" src="https://user-images.githubusercontent.com/62451840/84882585-96114380-b0e3-11ea-975c-d97f62c91719.png">
</p>


**2. Register form**  <br/>
This form is displayed when 'register' button in 'Login' form is clicked. New users need to register into the game database before playing. <br/>
- Register button
  - This will display a message indicating success of user registered into MMG database, then 'Login' form is displayed. Appropriate message will appear if any of fields are missing or existing usernames are used.
- Back button
  - This will open the 'Login' form back.

<p align="center">
  <img width="350" height="375" src="https://user-images.githubusercontent.com/62451840/84591905-1b071d80-ae96-11ea-8e4b-6ab2d5e92602.png"><br><br>
   <img width="650" height="91" src="https://user-images.githubusercontent.com/62451840/84882022-c0aecc80-b0e2-11ea-9180-ffa92c937ca1.png">
</p>


**3. Main menu**  <br/>
This form is displayed when player successfully login into the game. <br/>
- Play Game button
  - This will open 'Levels' menu.
- Ranking button
  - This will open the 'Ranking' form.
- Show Rules button
  - This will open the 'Game Rules' form.
- Sign Out button
  - Player will sign out from their account and 'Login' form back.

<p align="center">
  <img width="350" height="375" src="https://user-images.githubusercontent.com/62451840/84591950-7802d380-ae96-11ea-902f-a4a2f3879ee6.png">
</p>


**4. Levels**  <br/>
This form is displayed when 'Play Game' button is clicked in the 'Main Menu' form. <br/>
- Level 1: Easy button
  - This will open Level1 form where easy questions are generated for 10 rounds.
- Level 2: Intermediate  button
  - This will open Level2 form where intermediate questions are generated for 10 rounds.
- Level 3: Advanced button
  - This will open Level3 form where advanced questions are generated for 10 rounds. <br/>
  Refer to game rules for details regarding the different challenges in the three levels.
- Return to Main Menu button
  - This will open 'Main Menu' form back. <br/>
  Refer to game rules for details regarding the different challenges in the three levels.
  
 <p align="center">
  <img width="350" height="375" src="https://user-images.githubusercontent.com/62451840/84887062-58afb480-b0e9-11ea-8413-49026f2cd7c6.png">
</p>

 Example of level's question form:
<p align="center">
  <img width="350" height="375" src="https://user-images.githubusercontent.com/62451840/84592043-bb5d4200-ae96-11ea-8e6d-35fc39de8e6a.png">
</p>

    
**5. Ranking**   <br/>
This form is displayed when 'Ranking' button is clicked in the 'Main Menu' form. <br/>
- Return to Main Menu button
  - This will open 'Main Menu' form back.

<p align="center">
  <img width="350" height="375"" src="https://user-images.githubusercontent.com/62451840/84591963-8f41c100-ae96-11ea-80d8-5e21fd2d7230.png">
</p>


**6. Game Rules**   <br/>
This form is displayed when 'Show Rules' button is clicked in the 'Main Menu' form. <br/>
- Return to Main Menu button
  - This will open 'Main Menu' form back.
  
<p align="center">
  <img width="350" height="375" src="https://user-images.githubusercontent.com/62451840/84591974-9bc61980-ae96-11ea-95b1-b3328916a4b5.png">
</p>


**7. End Game**<br/>
This form is displayed when player has finished 10 rounds of the game in each level. <br/>
- More challenges button
  - This will open 'Levels' form for player to try playing other levels.
- Main Menu button
  - This will open 'Main Menu' form.
  
<p align="center">
  <img width=""350" height="375" src="https://user-images.githubusercontent.com/62451840/84592004-a7b1db80-ae96-11ea-934a-83f170251f21.png">
</p>

