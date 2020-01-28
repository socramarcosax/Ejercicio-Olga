package comun;

public class ContadorDeSuspensosAprobados {
	public static int[][] contarAprobadosYSuspensosPorMateria(int notas[][]) {
		int resultados[][]=new int[notas[0].length][2];
		for (int i = 0; i < notas[0].length; i++) {
			for (int j = 0; j < notas.length; j++) {
				int aprobado = 5;
				if (notas[j][i] >= aprobado)
					resultados[i][0]++;
				else
					resultados[i][1]++;
			}
		}
		return resultados;
	}
}
