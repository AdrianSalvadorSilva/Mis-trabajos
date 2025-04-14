package ComAdriánSilva;

public class testAlumno {
 public static  void main(String[] args) {
	
	/*Alumno a = new Alumno( 50000, "Adrian", "Silva", "colegia javer");
	 System.out.println("nombre de la intitucion: "+a.institucion+ " Nombre Materia: "+a.materias );
	 System.out.println("Nomnbre Alumno: "+a.getNombre()+" La Cedula: "+a.getCI());*/

      // Crear un objeto Alumno
      Alumno alumno = new Alumno(12345, "Juan", "Perez", "Instituto XYZ", 3);
      
      // Crear algunos objetos Asignatura
      Asignatura asignatura1 = new Asignatura("Matemáticas", "MAT101");
      Asignatura asignatura2 = new Asignatura("Historia", "HIS202");
      Asignatura asignatura3 = new Asignatura("Programación", "PRG303");
      
      // Agregar asignaturas al vector de materias del alumno
      alumno.agregarAsignatura(0, asignatura1);
      alumno.agregarAsignatura(1, asignatura2);
      alumno.agregarAsignatura(2, asignatura3);
      
      // Listar las asignaturas del alumno
      System.out.println("Listado de asignaturas:");
      alumno.listarAsignaturas();
      
      // Mostrar la representación en cadena del objeto Alumno
      System.out.println("\nRepresentación del objeto Alumno:");
      System.out.println(alumno);
      System.out.println(asignatura1);
 

}
}