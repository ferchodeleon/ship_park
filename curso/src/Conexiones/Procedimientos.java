package Conexiones;


import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;

public class Procedimientos {
    
    // INICIO PROCEDIMIENTOS ESPECIALIDADES
    
    public static void entradaEspecialidades(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTAR_DATOS_ESPECIALIDADES(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    
    public static void EliminarEspecialidades(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ELIMINAR_ESPECIALIDADES(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BUSCAR_ESPECIALIDADES(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BUSCAR_ESPECIALIDADES(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void ActualizarEspecialidades(int a, String b)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call UPDATE_ESPECIALIDADES(?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    // FIN PROCEDIMIENTOS ESPECIALIDADES
    
    // INICIO PROCEDIMIENTOS EMPLEADOS
    
    public static void entradaEmpleados(int a,String b,String c, String d, int e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTAR_DATOS_EMPLEADOS(?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setInt(5, e);
        entrada.execute();
    }
    
    public static void EliminarEmpleados(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ELIMINAR_EMPLEADOS(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void buscarEmpleados(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BUSCAR_EMPLEADOS(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void ActualizarEmpleados(int a, String b, String c, String d, int e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call UPDATE_EMPLEADOS(?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setInt(5, e);
        entrada.execute();
    }
    
    //FIN PROCEDIMIENTOS EMPLEADOS
    
    //INICIO PROCEDIMIENTOS ZONAS
    
    public static void entradaZonas(String a,String b, String c, int d, int e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTAR_DATOS_ZONA(?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setInt(5, e);
        entrada.execute();
    }
    
    public static void eliminarZonas(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ELIMINAR_ZONAS(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void buscarZonas(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BUSCAR_ZONAS(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void actualizarZonas(int a, String b, String c, String d, int e, int f)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call UPDATE_ZONAS(?,?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setInt(5, e);
        entrada.setInt(6, f);
        entrada.execute();
    }
    
    //FIN PROCEDIMIENTOS ZONAS
    
    // INICIO PROCEDIMIENTOS AMARRES
    
    public static void entradaAmarres(String a,String b, String c, int e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTAR_DATOS_AMARRE(?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, e);
        entrada.execute();
    }
    
    public static void eliminarAmarres(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ELIMINAR_AMARRES(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void buscarAmarres(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BUSCAR_AMARRES(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void actualizarAmarres(int a, String b, String c, String d, int e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call UPDATE_AMARRES(?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setInt(5, e);
        entrada.execute();
    }
    
    // FIN PROCEDIMIENTOS AMARRES
    
    // INICIO PROCEDIMIENTOS EMBARCACIÓN
    
    public static void entradaEmbarcaciones(int a, String b, String c, int d, int e, int f)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTAR_DATOS_EMBARCACION(?,?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setInt(5, e);
        entrada.setInt(6, f);
        entrada.execute();
    }
    
    public static void eliminarEmbarques(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ELIMINAR_EMBARQUES(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void buscarEmbarques(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BUSCAR_EMBARQUES(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void actualizarEmbarcacion(int a, String b, String c, int d, int e, int f)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call UPDATE_EMBARQUES(?,?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setInt(5, e);
        entrada.setInt(6, f);
        entrada.execute();
    }
    
    // FIN PROCEDIMIENTOS EMBARCACIÓN
    
    // INICIO PROCEDIMIENTOS SOCIO
    
    public static void entradaSocios(int a, String b, String c, String d, String e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTAR_DATOS_SOCIO(?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setString(5, e);
        entrada.execute();
    }
    
    public static void eliminarSocios(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ELIMINAR_SOCIOS(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void buscarSocio(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BUSCAR_SOCIO(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void actualizarSocios(int a, String b, String c, String d, String e)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call UPDATE_SOCIOS(?,?,?,?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setString(5, e);
        entrada.execute();
    }
    
    // FIN PROCEDIMIENTOS SOCIOS

}
