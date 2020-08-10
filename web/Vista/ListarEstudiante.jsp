<%-- 
    Document   : ListarEstudiante
    Created on : 03/08/2020, 09:13:36 AM
    Author     : Usuario
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Estudiante"%>
<%@page import="ModeloDao.EstudianteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Estudiantes</title>
    </head>
    <body>
        <div>
            <h1> Listado de Estudiante> </h1>
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Apellidos</th>
                            <th>DNI</th>
                            <th>Codigo</th>
                            <th>Estado</th>
                            <th>Acciones</th>
                        </tr>
                </thead>
                <tbody>

                    <%
                        EstudianteDAO estudianteDAO = new EstudianteDAO();
                        List<Estudiante> estudiantes = estudianteDAO.listarestudiante();
                        Iterator<Estudiante> iterator = estudiantes.iterator();
                        Estudiante estudiante = null;
                        while (iterator.hasNext()) {
                            estudiante = iterator.next();


                    %>
                    <tr>
                        <td><% out.print(estudiante.getIdestudiante()); %></td>
                        <td><% out.print(estudiante.getNombre()); %></td>
                        <td><% out.print(estudiante.getApellidos()); %></td>
                        <td><% out.print(estudiante.getDni()); %></td>
                        <td><% out.print(estudiante.getCodigo()); %></td>
                        <td><% out.print(estudiante.getEstado()); %></td>
                        <td></td>
                    </tr>
                    <%    }
                    %>                    
                </tbody>
            </table>
        </div>
    </body>
</html>

