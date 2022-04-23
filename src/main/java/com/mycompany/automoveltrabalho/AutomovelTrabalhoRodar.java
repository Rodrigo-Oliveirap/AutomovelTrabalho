/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automoveltrabalho;

//importa o scanner
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class AutomovelTrabalhoRodar {
    
    public static void main(String[] args) {
        
        //variáveis
        String tipo;
        String cor;
        String marca;
        float motor;
        float peso;
        int passageiros;
        
        //inicia o scanner
        Scanner input = new Scanner(System.in);
        
        //instancia o automovel
        AutomovelTrabalho auto = new AutomovelTrabalho();
        
        //pede e declara as informações do veículo utilizando o set
        
        //marca
        System.out.println("Informe a marca do Automóvel: ");
        marca = input.nextLine();
        auto.setMarca(marca);
        
        //cor
        System.out.println("Informe a cor do Automóvel: ");
        cor = input.nextLine();
        auto.setCor(cor);
        
        //tipo
        System.out.println("Informe o tipo do Automóvel: ");
        System.out.println("opções: caminhão; moto; carro; ônibus");
        tipo = input.nextLine();
        auto.setTipo(tipo);
        
        //filtra se o tipo não for moto
        if (!tipo.equals("moto")){
            
            //número de passageiros
            System.out.println("Informe o número de passageiros do veículo: ");
            passageiros = input.nextInt();
            auto.setPassageiros(passageiros);
            
            //filtra se tiver mais que 8 passageiros
            if (passageiros < 8){
                System.out.println("Informe o peso do Automóvel em KG: ");
                peso = input.nextFloat();
                auto.setPeso(peso); 
            }
        
        //caso seja moto, será perguntado a cilindrada    
        } else {
            System.out.println("Informe a cilindrada do Automóvel: ");
            motor = input.nextFloat();
            auto.setMotor(motor);
        }
        
        //chamando métodos
        
        //informa o tipo informado, marca e cor
        auto.veiculo();
        
        //verifica o tipo de carteira necessária com base nas informações obtidas
        auto.verificar();               
        
    }
    
}
