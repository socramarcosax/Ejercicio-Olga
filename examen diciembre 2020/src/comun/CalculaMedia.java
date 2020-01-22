package comun;
import comun.MatrizAlumnos;

public class CalculaMedia {
	public static void main(String[] args) {
		int notas[][] = MatrizAlumnos.entregarNotas();
		float[] calculaMediaMaterias = calculaMediaMaterias(notas);
		for (int i = 0; i < calculaMediaMaterias.length; i++) {
			System.out.println(calculaMediaMaterias[i]);
		}
	}
	public static float[] calculaMediaMaterias(int notas[][]) {
		float resultados[]=new float[notas[0].length];
		for (int i = 0; i < notas[0].length; i++) {
			for (int j = 0; j < notas.length; j++) {
				resultados[i]+=notas[j][i];
			}
			resultados[i]/=notas[0].length;
		}
		return resultados;
	}
}
