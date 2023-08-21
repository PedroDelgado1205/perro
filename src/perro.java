public class perro {
    //atributos
    public String nombre="JONES";
    public String raza="PITBULL";
    public int edad=1;
    //metodos
    public String getNombre(){
        return this.nombre;
    }
    public void miPerro(){
        System.out.println(
                "Nombre: "+this.nombre+"\n"+
                "Edad: "+this.edad+"\n"+
                "Raza: "+this.raza);
    }
}

