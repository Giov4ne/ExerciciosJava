package poligono;

import java.util.Scanner;

public class Poligono {

    private String nome;
    private int numLados;
    private double medidaLado;
    private Scanner scanner = new Scanner(System.in);

    public void setNumLados() {
        int n = 0;
        while(n < 3 || n > 5){
            try{
                System.out.print("Número de lados: ");
                n = Integer.parseInt(this.scanner.nextLine());
                if(n < 3 || n > 5){
                    System.out.println("O número de lados precisa ser entre 3 e 5.\n");
                } else{
                    this.numLados = n;
                    if(this.numLados == 3){
                        this.nome = "Triângulo";
                        setMedidaLado();
                    } else if(this.numLados == 4){
                        this.nome = "Quadrado";
                        setMedidaLado();
                    } else{
                        this.nome = "Pentágono";
                    }
                }
            } catch(NumberFormatException e){
                System.out.println("O valor precisa ser do tipo inteiro.\n");
            }
        }
    }

    private void setMedidaLado() {
        double m = 0;
        while(m <= 0){
            try{
                System.out.print("Medida do lado (cm): ");
                m = Double.parseDouble(this.scanner.nextLine());
                if(m <= 0){
                    System.out.println("A medida do lado precisa ser maior do que 0.\n");
                } else{
                    this.medidaLado = m;
                }
            } catch(NumberFormatException e){
                System.out.println("O valor precisa ser do tipo decimal.\n");
            }
        }
    }

    public String getPoligono() {
        return this.nome;
    }

    public String getArea() {
    	String area = "";
        if(this.nome == "Triângulo"){
        	double base = this.medidaLado;
        	double altura = Math.sqrt((Math.pow(this.medidaLado, 2) - Math.pow((base/2), 2)));
        	area = "Área: " + ((base * altura) / 2) + " cm²";
        } else if(this.nome == "Quadrado"){
            area = "Área: " + (Math.pow(this.medidaLado, 2)) + " cm²";
        }
        return area;
    }

}