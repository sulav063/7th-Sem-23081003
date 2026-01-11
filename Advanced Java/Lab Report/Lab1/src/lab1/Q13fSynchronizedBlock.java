/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Sulav
 */
public class Q13fSynchronizedBlock {
    public static void main(String[] args) {
        Object o = new Object();
        synchronized (o) {
            System.out.println("Sync Block");
        }
        System.out.print("\nLab1,Sulav Adhikari ,2381003");
    }
}
