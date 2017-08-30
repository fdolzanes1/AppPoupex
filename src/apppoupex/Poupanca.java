/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppoupex;

/**
 *
 * @author Fabiano
 */
public class Poupanca {
    
    private int anos;
    private double jurosAoMes;
    private double depositoMensal;
    
    public Poupanca(int a, double j, double dm) {
        anos = a;
        jurosAoMes = j/100;
        depositoMensal = dm; 
    }
    
    public double ResultadoTotal() {
        
        int num_pagamentos = anos * 12;
        
        double total = 0;
        for (int i = 0; i < num_pagamentos; i++) {
            total = total + depositoMensal;
            total = total + total * jurosAoMes;
        }
        return total;
    }
    
}