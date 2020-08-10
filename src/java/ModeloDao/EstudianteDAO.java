package ModeloDao;

import Modelo.Estudiante;
import java.util.List;
import Config.bd.ConectaBd;
import Interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EstudianteDAO implements CRUD{
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Estudiante e = new Estudiante();

    @Override
    public List listarestudiante() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        String consulta = " select * "
                        + "from estudiante ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setIdestudiante(rs.getInt("idestudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellidos(rs.getString("apellidos"));
                estudiante.setDni(rs.getString("dni"));
                estudiante.setCodigo(rs.getString("codigo"));
                estudiante.setEstado(rs.getString("estado"));
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            
        }
        return estudiantes;
    }

    @Override
    public Estudiante buscarestudiante(int idestudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarestudiante(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarestudiante(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarestudiante(int idestudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}