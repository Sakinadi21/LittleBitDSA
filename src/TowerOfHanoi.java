public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, aux);
        System.out.println(src + " -> " + dest);
        towerOfHanoi(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        char A = 'A'; // Source rod
        char B = 'B'; // Auxiliary rod
        char C = 'C'; // Destination rod

        towerOfHanoi(n, A, B, C);
    }
}
//This Java code implements the Tower of Hanoi problem.
// The Tower of Hanoi is a mathematical puzzle where you have three rods and a number of disks of different sizes which can slide onto any rod.
// The objective is to move all the disks from the source rod to the destination rod using the auxiliary rod, following specific rules:
//
//1. Only one disk can be moved at a time.
//2. Each move consists of taking the top disk from one of the stacks and placing it on top of another stack.
//3. No disk may be placed on top of a smaller disk.
//
//In the code:
//- The `towerOfHanoi` method recursively solves the Tower of Hanoi problem.
// When the number of disks `n` is 1, it simply moves the disk from the source rod to the destination rod and prints the move.
//- Otherwise, it recursively moves `n-1` disks from the source to the auxiliary rod,
// then moves the last disk from the source to the destination rod,
// and finally recursively moves the `n-1` disks from the auxiliary to the destination rod.
//- The `main` method initializes the number of disks `n` to 3
// and the rods A, B, and C to represent the source, auxiliary, and destination rods respectively.
//- It then calls the `towerOfHanoi` method to solve the Tower of Hanoi problem for 3 disks with rods A, B, and C.
//
//When you run this code, it will output the sequence of disk movements needed to solve the Tower of Hanoi problem for 3 disks.