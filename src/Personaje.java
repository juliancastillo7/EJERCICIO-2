class Personaje {
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    private boolean vivo;


    public Personaje(String nombre) {
        this.nombre = nombre;
        nivel = 1;
        experiencia = 0;
        vida = 100;
        vivo = true;
    }

    public String ganarExperiencia() {
        experiencia += 10;
        return "El personaje ganó 10 puntos de experiencia.";
    }

    public String subirNivel() {
        nivel++;
        experiencia = 0;
        return "El personaje subió de nivel";
    }

    public String recibirDaño() {
        vida -= 15;

        if (vida <= 0) {
            vida = 0;
            vivo = false;
            return "El personaje recibió daño y ha muerto";
        }

        return "El personaje recibió 15 puntos de daño";
    }

    public String curarse() {
        if (!vivo) {
            return "No se puede curar porque está muerto";
        }

        vida += 20;
        return "El personaje se curó 20 puntos";
    }

    public String mostrarEstado() {
        return "      ESTADO      " +
                "Nombre: " + nombre +
                "Nivel: " + nivel +
                "Experiencia: " + experiencia +
                "Vida: " + vida +
                "¿Está vivo?: " + vivo;
    }
}