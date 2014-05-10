/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public class Cliente {

          String rut;
          String nombre;
          String direccion;
          String telefono;
          String fechanac;
          String email;
          
          
          Connection cnn;
          Statement state;
          ResultSet res;
          
          
          public Cliente(){
              
              try {
                  Class.forName("");
                  cnn = DriverManager.getConnection("", "", "");
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
              } catch (SQLException ex) {
                  Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          
          }

    public Cliente(String rut, String nombre, String direccion, String telefono, String fechanac, String email, Connection cnn, Statement state, ResultSet res) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechanac = fechanac;
        this.email = email;
        this.cnn = cnn;
        this.state = state;
        this.res = res;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }

    public Statement getState() {
        return state;
    }

    public void setState(Statement state) {
        this.state = state;
    }

    public ResultSet getRes() {
        return res;
    }

    public void setRes(ResultSet res) {
        this.res = res;
    }
          
          
  public void ingresar(){
  
              try {
                  String query = "insert into clientes values('"+rut+"','"+nombre+"','"+direccion+"','"+telefono+"','"+fechanac+"','"+email+"')";
                  int saber = 0;
                  
                  state = cnn.createStatement();
                  saber = state.executeUpdate(query);
                  
                  if(saber == 1){
                  
                      
                  }
              } catch (SQLException ex) {
                  Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
              }
      
          
              
  }
          
    
}
