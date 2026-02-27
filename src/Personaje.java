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

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        if (nivel > 0) {
            this.nivel = nivel;
        }
    }
    public void setExperiencia(int experiencia) {
        if (experiencia >= 0) {
            this.experiencia = experiencia;
        }
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
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
        setExperiencia(getExperiencia() + 50);
        return nombre + " ganó 50 puntos de experiencia.";
    }
    public String subirNivel() {
        if (getExperiencia() >= 100) {
            setNivel(getNivel() + 1);
            setExperiencia(0);
            return nombre + " subió a nivel " + getNivel();
        }
        return "No tienes suficiente experiencia.";
    }

    public String recibirDaño() {
        int nuevaVida = getVida() - 20;
        if (nuevaVida < 0) nuevaVida = 0;
        setVida(nuevaVida);
        return nombre + " recibió 20 de daño.";
    }

    public String curarse() {
        int nuevaVida = getVida() + 20;
        if (nuevaVida > 100) nuevaVida = 100;
        setVida(nuevaVida);
        return nombre + " se curó 20 puntos.";
    }
}