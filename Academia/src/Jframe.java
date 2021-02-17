import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import br.com.academia.model.*;

public class Jframe{
	public void criarJframe() {
		Font titulo = new Font("Arial", Font.BOLD,22);
		Font resultado = new Font("Arial", Font.BOLD,18);
		Color azul = new Color(192, 254, 193);
		Color VERDE = new Color(30, 132, 73);
		Color VERMELHO = new Color(236, 112, 98);
		Color amarelo = new Color(228, 234, 17);
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(500, 750);
		tela.setTitle("Calculando imc e ncd");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
	}
}