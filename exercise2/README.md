Mars Rover Programming
Problem

Simulate a rover moving on a rectangular grid:

M = move forward

L = turn left

R = turn right

The rover navigates around obstacles, with grid boundaries enforced.

Features

Move rover using commands (M, L, R)

Detect and avoid obstacles

Enforce grid boundaries

Logging of rover actions via decorator

Observer logs position changes

Extensible command system

Design Patterns Used

Command Pattern – encapsulates rover actions

Composite – manages grid and obstacles

Decorator – adds logging behavior to rover

Observer – logs rover position updates

Singleton – manages the grid

State/Strategy + Factory – handles directions (N, S, E, W)

How to Run

Navigate to the src folder:

cd src


Compile all Java files:

javac core/*.java domain/commands/*.java domain/direction/*.java domain/grid/*.java domain/decorator/*.java


Run the application:

java core.MarsRoverApp

Usage

Enter grid size when prompted.

Optionally, enter obstacle positions (e.g., 2,2 3,5).

Enter the rover's starting position and direction (e.g., 1 2 N).

Input a string of commands (M, L, R) to move the rover.

Repeat until you type exit.