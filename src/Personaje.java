public class Personaje {
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.experiencia = 0;
        this.vida = 100;
    }
    public String crearUsuario() {
        return "Personaje " + nombre + " creado correctamente.";
    }
    public String mostrarEstado() {
        return "Nombre: " + nombre +
                "Nivel: " + nivel +
                "Experiencia: " + experiencia +
                "Vida: " + vida + "\n";
    }
    public String ganarExperiencia() {
        experiencia += 50;
        return nombre + " ganó 50 puntos de experiencia.";
    }
    public String subirNivel() {
        if (experiencia >= 100) {
            nivel++;
            experiencia = 0;
            return nombre + " subió a nivel " + nivel;
        }
        return "No tienes suficiente experiencia para subir de nivel.";
    }
    public String recibirDano() {
        vida -= 20;
        if (vida < 0) {
            vida = 0;
        }
        return nombre + " recibió 20 de daño.";
    }
    public String curarse() {
        vida += 20;
        if (vida > 100) {
            vida = 100;
        }
        return nombre + " se curó 20 puntos.";
    }
    public String getNombre() {
        return nombre;
    }
}