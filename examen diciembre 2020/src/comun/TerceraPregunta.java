package comun;
import comun.MatrizAlumnos;


public class TerceraPregunta {
	public static void main(String[] args) {
		int notas[][]=MatrizAlumnos.entregarNotas();
		boolean[] comprobarTresSuspensosConsecutivos = comprobarTresSuspensosConsecutivos(notas);
		for (int i = 0; i < comprobarTresSuspensosConsecutivos.length; i++) {
			System.out.println(comprobarTresSuspensosConsecutivos[i]);
		}
	}
	
	public static boolean[] comprobarTresSuspensosConsecutivos(int notas[][]) {
		boolean circunstancia[]=new boolean[notas.length];
		int contador=0;
		for (int i = 0; i < notas[0].length; i++) {
			for (int j = 0; j < notas.length; j++) {
				if(notas[j][i]<5)
					contador++;
				else
					contador=0;
				if(contador==3)
					circunstancia[i]=true;
			}
		}
		return circunstancia;
	}
}
