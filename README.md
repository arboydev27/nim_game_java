
Overview:
This Java project implements the classic two-player strategy game Nim, showcasing principles of object-oriented programming, including polymorphism, abstract classes, and custom exceptions. The game lets players take turns removing objects from piles, with the player forced to take the last object declared the loser.

In this java-based version of Nim, players can choose between a human player or a computer-controlled player (RandomPlayer) for a match of Nim. The structure leverages abstract classes and exceptions, creating a flexible framework where various player types can interact seamlessly with the game logic.

Game Features:
1. Abstract Player Class: A polymorphic design allows different player types to interact with the game without modifying core logic.
2. Custom Exceptions:
    - IllegalMoveException ensures that invalid moves, such as selecting a non-positive number or out-of-bounds pile index, are handled gracefully.
3. Player Classes:
    - RandomPlayer: A computer opponent that makes random legal moves.
    - HumanPlayer: Allows user input through the console.
4. Flexible Game Engine: Using polymorphism and dependency injection, the game engine (Nim class) interacts with any Player subclass, enabling the addition of new player types without altering the core game.

Key Components:
  - Player Class: An abstract class defining the structure for different types of players.
  - Piles Class: Manages pile sizes, enforces game rules, and handles moves, throwing exceptions for invalid actions.
  - Nim Class: Manages gameplay, enforcing turn-based interactions and notifying players of valid and invalid moves.
  - OptimalPlayer (Optional): A challenging AI using optimal strategies to maximize winning chances.

How to Play:
1. Setup: Clone the repository and import it into an IDE. Compile and run the main driver class.
2. Gameplay: Players take turns removing objects from piles by specifying a pile index and the number of objects to remove.
3. Winning Condition: The player who avoids taking the last object wins.|

Sample game output:

```text
Piles: [3, 4, 5]
Enter pile index: 0
Enter object number: 2
RandomPlayer removed 3 from pile 2.

Piles: [1, 4, 2]
Enter pile index: 1
Enter object number: 1q
Enter object number: 1
RandomPlayer removed 1 from pile 0.

Piles: [0, 3, 2]
Enter pile index: 1
Enter object number: 0
Nonpositive object number: 0

Piles: [0, 3, 2]
Enter pile index: 1
Enter object number: 1
RandomPlayer removed 2 from pile 2.

Piles: [0, 2, 0]
Enter pile index: 1
Enter object number: 1
RandomPlayer removed 1 from pile 1.

Nice job, Mukhtar. You win!
```

Additional Learning:
  - Polymorphism and Dependency Injection: Allows flexible integration of various player types.
  - Game Strategy: Experiment with OptimalPlayer to explore combinatorial game theory.

Have fun!

