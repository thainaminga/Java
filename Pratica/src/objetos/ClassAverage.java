package objetos;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		
		//fase de incialização
		int total = 0;//
		int gradeCounter = 1;//
		//
		while (gradeCounter <=10)//faz o loop 10 vezes
		{
			System.out.println("Enter grade: ");//prompt
			int grade = input.nextInt();//
			total = total + grade;//
			gradeCounter = gradeCounter + 1;
		}
		
		//fase de termino
		int average = total / 10;//
		
		//
		System.out.printf("%n Total of all 10 grades is %d%n",total);
		System.out.printf("Classe average is %d%n",average);
	}

}//fim da classe ClassAverage
