package poo_java_adrian;

public class Combate {
    Pokemon p1;
    Pokemon p2;
    int turno; // Declare turno as a class-level variable

    public Combate(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.turno = (p1.velocidad > p2.velocidad) ? 1 : 2; // Initialize turno based on speed
    }

    public void iniciar() {
        while (p1.nivelVida > 0 && p2.nivelVida > 0) {
            System.out.println(p1.nombre + " : " + p1.nivelVida);
            System.out.println(p2.nombre + " : " + p2.nivelVida);

            // Combat logic
            if (turno == 1) {
                System.out.println("Ataca : " + p1.nombre);
                if (p2.esquivar()) {
                    System.out.println(p2.nombre + " evadió el ataque");
                } else {
                    p2.nivelVida -= p1.poderDaño;
                    System.out.println(p2.nombre + " recibió el ataque");
                }
                turno = 2; // Switch turn
            } else {
                System.out.println("Ataca : " + p2.nombre);
                if (p1.esquivar()) {
                    System.out.println(p1.nombre + " evadió el ataque");
                } else {
                    p1.nivelVida -= p2.poderDaño;
                    System.out.println(p1.nombre + " recibió el ataque");
                }
                turno = 1; // Switch turn
            }

            try {
                Thread.sleep(3000); // Delay for realism
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determine winner
        if (p1.nivelVida <= 0 && p2.nivelVida <= 0) {
            System.out.println("EMPATE");
        } else if (p1.nivelVida > p2.nivelVida) {
            System.out.println(p1.nombre + " ha GANADO LA PELEA");
        } else {
            System.out.println(p2.nombre + " ha GANADO LA PELEA");
        }
    }
}
