/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.automoveltrabalho;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class AutomovelTrabalho
 */
public class AutomovelTrabalho {

    Scanner input = new Scanner(System.in);

    //
    // Fields
    //
    private String marca;
    private String cor;
    private String tipo;
    private float motor;
    private float peso;
    private int passageiros;

    //
    // Constructors
    //
    public AutomovelTrabalho() {
    }

    ;
  
  //
  // Methods
  //


  //
  // Accessor methods
  //
    public void setMarca(String newVar) {
        this.marca = newVar;
    }

    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }
    
    public void setCor(String newVar) {
        this.cor = newVar;
    }

    /**
     * Get the value of cor
     *
     * @return the value of cor
     */
    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        String[] tiposValidos = {"carro", "moto", "caminhão", "ônibus"};
        boolean contem = Arrays.stream(tiposValidos).anyMatch(tipo::equals);
        if (!contem) {
            while (!Arrays.stream(tiposValidos).anyMatch(tipo::equals)) {
                System.out.println("Tipo inválido");
                System.out.println("opções: caminhão; moto; carro; ônibus");
                tipo = input.nextLine();
            }
            this.tipo = tipo;
        } else {
            this.tipo = tipo;
        }
    }

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    } 

    public void setMotor(float motor) {
        if (motor < 1) {
            while (motor < 1) {
                System.out.println("O motor não pode ter menos de 1cc");
                System.out.println("Informe a cilindrada do Automóvel: ");
                motor = input.nextFloat();
            }
        } else {
            this.motor = motor;
        } 
    }

    /**
     * Get the value of motor
     *
     * @return the value of motor
     */
    public float getMotor() {
        return motor;
    }

    public void setPeso(float peso) {
        if (peso < 1) {
            while (peso < 1) {
                System.out.println("O peso não pode ser menor que 1KG");
                System.out.println("Informe o peso do Automóvel em KG: ");
                peso = input.nextFloat();
            }
        } else {
        this.peso = peso;
        }
    }

    /**
     * Get the value of peso
     *
     * @return the value of peso
     */
    public float getPeso() {
        return peso;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros < 1) {
            while (passageiros < 1) {
                System.out.println("O número de passageiros não pode ser menor que 1");
                System.out.println("Informe o número de passageiros do veículo: ");
                passageiros = input.nextInt();
            }
        } else {
            this.passageiros = passageiros;
        } 
    }

    /**
     * Get the value of passageiros
     *
     * @return the value of passageiros
     */
    public int getPassageiros() {
        return passageiros;
    }

    //
    // Other methods
    //
    
    //informa o tipo informado, marca e cor
    protected void veiculo(){
        System.out.println("");
        System.out.print("O tipo de veículo informado é: " + tipo);
        System.out.print(", sendo da marca " + marca + " e da cor " + cor);
    }
    
    //verifica o tipo de carteira necessária com base nas informações obtidas
    protected void verificar(){
        System.out.println("");
        
        //verifica se é uma moto e a cilindrada do motor menor que 50
        if (tipo.equals("moto") & motor <= 50){
            System.out.println("O tipo de habilitação necessária é categoria ACC");
            System.out.println("Permitindo o uso de veículos de 2 ou 3 rodas com até 50cc");
            
        //verifica se é uma moto e a cilindrada do motor maior que 50
        } else if (tipo.equals("moto") & motor > 50) {
            System.out.println("O tipo de habilitação necessária é categoria A");
            System.out.println("Permitindo o uso de veículos de 2 ou 3 rodas com ou sem carro lateral");
            
        //verifica se possui mais que 8 passageiros
        } else if (passageiros > 8){
            System.out.println("O tipo de habilitação necessária é categoria D");
            System.out.println("Permitindo o uso de veículos com mais de 8 passageiros");
            
        //verifica se pesa mais que 3500KG
        } else if (peso > 3500) {
            System.out.println("O tipo de habilitação necessária é categoria C");
            System.out.println("Permitindo o uso de veículos de carga acima de 3500KG");
        
        //caso nenhuma informação tenha sido aceita, resta somente a última categoria
        }else {
            System.out.println("O tipo de habilitação necessária é categoria B");
            System.out.println("Permitindo o uso de carros de passeio abaixo de 3500KG e menos de 8 passageiros");
        }
    }
}
