/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication18;

class pessoa
{
int idade;
int peso;
}
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int atual=1;
        int ant=1;
        int n=0;
        System.out.println("1 \n1");
        for (int i=1;i<10;i++)
                {
                n=atual+ant;
                ant=atual;
                atual=n;
                
                System.out.println(n);
                }
    
    
    }
    
}
