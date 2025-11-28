package com.example.blogdenotas.Model;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private int fechaNacimiento;
    private String nombreReal;
    private String apellidos;

    public Usuario (String nombreUsuario, String contraseña,int fechaNacimiento, String nombreReal, String apellidos){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreReal = nombreReal;
        this.apellidos = apellidos;
    }

    //constructor nulo
    public Usuario(){
        this.nombreUsuario = "";
        this.contraseña = "";
        this.fechaNacimiento = 0;
        this.nombreReal = "";
        this.apellidos = "";
    }

    //getters
    public String getNombreUsuario(){return this.nombreUsuario;}
    public String getContraseña(){return this.contraseña;}
    public int getFechaNacimiento(){return this.fechaNacimiento;}
    public String getNombreReal(){return this.nombreReal;}
    public String getApellidos(){return this.apellidos;}


    //setters
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public void setFechaNacimiento(int fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreReal(String nombreReal){
        this.nombreReal = nombreReal;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String usuarioToString(){
        return "Usuario{"+ "Nombre de usuario: " +nombreUsuario +", Contraseña: "+contraseña+ ", fecha de nacimiento: "+ fechaNacimiento+ ", nombre real: "+ nombreReal+ ", apellidos: "+apellidos+"}";
    }

}
