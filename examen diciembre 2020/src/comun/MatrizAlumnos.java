package comun;

public class MatrizAlumnos {
// esto es un proyecto
	public static int[][] entregarNotas() {
		int notas[][] = {

				{ 9, 5, 3, 6, 8, 9, 6, 5, 2, 5 }, 
				{ 9, 2, 3, 5, 8, 7, 8, 5, 9, 6 }, 
				{ 9, 5, 6, 2, 8, 5, 2, 1, 5, 2 },
				{ 10, 5, 5, 2, 8, 5, 8, 7, 4, 5 }, 
				{ 9, 6, 8, 7, 8, 5, 8, 9, 5, 7 }, 
				{ 9, 6, 5, 2, 8, 6, 5, 8, 6, 9 },
				{ 8, 8, 8, 8, 8, 4, 8, 8, 8, 8 }, 
				{ 9, 5, 7, 4, 4, 4, 8, 7, 8, 5 }, 
				{ 9, 5, 8, 7, 8, 4, 6, 8, 7, 4 },
				{ 10, 9, 9, 9, 8, 9, 9, 9, 9, 9 }, };
		return notas;
	}

	public static String[] entregarAlumnos() {
		String alumnos[] = {

				"Prudencia Albatros Palomo", "Eleuterio Banda Calmar", "Crisostomo Calero Colero",
				"Gervasio Danilo Sortosa", "Sopetran Escobar Puerto", "Euricio Gomez Tomblante",
				"Torcuato Lucas Jimenes", "Pristino Muñoz GoñeteGuinaga", "Anacleto Perez Espinosa",
				"Jacobo Sanchez Perruño", };
		return alumnos;
	}

	public static String[] entregarMaterias() {
		String materias[] = { "Metrica", "Dialogo", "Geometria", "Costura", "Sentido", "Orden", "Disciplina", "Stress",
				"Actitudes", "Sonrisa" };
		return materias;
	}
}
